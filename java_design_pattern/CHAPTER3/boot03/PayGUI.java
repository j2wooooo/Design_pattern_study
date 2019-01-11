/* 137쪽,다음 코드는 정상 작업 시간(workHours 속성)과 잔업 시간(overTimeHours 속성)을 기반으로 임금을 계산하고 이를 출력하는 기능(calculatePay 메서드)을 제공한다.
 * 현재 설계의 문제점을 진단하고 설계를 개선하라.
 */

/* CalculatePayMachine 클래스의 변경 사유는 크게 2가지이다.
 * 하나는 GUI가 변경되는 경우이고 다른 하나는 임금을 계산하는 로직이 변경되는 경우이다.
 * 따라서 하나의 클래스는 하나의 변경사유만 있어야 한다는 SRP를 위반한다. SRP를 따르려면 우선 2가지 변경사유를 각기 다른 클래스에서 담당하도록 해야 한다.
 * 
 * 또한 위와 같이 변경한 설계는 SRP는 만족하지만 OCP를 만족하지 않는다. 만약 임금 로직이 변경되는 경우에는 GUI 클래스도 영향을 받는다.
 * GUI 클래스가 임금을 계산하는 구체적인 구체 클래스와 직접적인 연관을 맺었기 때문이다. 이 문제를 해결하려면 GUI 클래스가 인터페이스와 연관을 갖는 것이 더 나은 설계가 된다.
 */

package java_design_pattern;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PayGUI extends Frame implements ActionListener, DocumentListener{
	private PayCalculationStrategy pc; // 변경
	
	private JLabel workingHoursLabel = new JLabel("Working Hours = ", Label.RIGHT);
	private JLabel overTimeHoursLabel = new JLabel("Overtime Hours =", Label.RIGHT);
	private JLabel payAmountLabel = new JLabel("Pay Amount =", Label.RIGHT);
	
	private JTextField tfWorkingHours = new JTextField();
	private JTextField tfOvertimeHours = new JTextField();
	private JTextField tfResult = new JTextField();
	
	private JButton calcButton = new JButton("Calculate");
	private JButton resetButton = new JButton("Reset");
	private JButton end = new JButton("Stop");
	
	public PayGUI(PayCalculationStrategy pc) { // 변경
		super("Payment Calculation");
		this.pc = pc;
		this.init();
		this.start();
		this.setSize(500, 250);
		this.setVisible(true);
		
	}

	public void init() {
		this.setLayout(new GridLayout(5,1));
		
		Panel p = new Panel(new BorderLayout());
		p.add("West", workingHoursLabel);
		p.add("Center", tfWorkingHours);
		this.add(p);
		
		Panel p1 = new Panel(new BorderLayout());
		p1.add("West", overTimeHoursLabel);
		p1.add("Center", tfOvertimeHours);
		this.add(p1);
		
		Panel p2 = new Panel(new FlowLayout(FlowLayout.CENTER));
		p2.add(calcButton);
		this.add(p2);
		
		Panel p3 = new Panel(new BorderLayout());
		p3.add("West", payAmountLabel);
		p3.add("Center", tfResult);
		this.add(p3);
		
		Panel p4 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p4.add(resetButton);
		p4.add(end);
		this.add(p4);
	}
	
	public void start()
	{
		calcButton.addActionListener(this);
		resetButton.addActionListener(this);
		
		tfWorkingHours.getDocument().addDocumentListener(this);
		tfOvertimeHours.getDocument().addDocumentListener(this);
		
		end.addActionListener(this);
		
		calcButton.setEnabled(false);
		resetButton.setEnabled(false);
	}
	
	public boolean isDataEntered() {
		if(tfWorkingHours.getText().trim().length() == 0 ||
				tfOvertimeHours.getText().trim().length() == 0)
			return false;
		
		return true;
	}
	
	@Override
	public void insertUpdate(DocumentEvent e)
	{
		checkData();
	}
	@Override
	public void removeUpdate(DocumentEvent e)
	{
		checkData();
	}
	@Override
	public void changedUpdate(DocumentEvent e)
	{
		checkData();
	}
	
	public void checkData()
	{
		calcButton.setEnabled(isDataEntered());
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == end)
		{
			System.exit(0);
		}
		
		if(e.getSource() == resetButton)
		{
			tfWorkingHours.setText("");
			tfOvertimeHours.setText("");
			tfWorkingHours.requestFocus();
			tfResult.setText("");
			resetButton.setEnabled(false);
			return;
		}
		
		if(e.getSource() == calcButton)
		{
			int x = 0;
			try {
				x = Integer.parseInt(tfWorkingHours.getText().trim());
			}
			catch(NumberFormatException ee)
			{
				tfWorkingHours.setText("");
				tfWorkingHours.requestFocus();
				return;
			}
			
			int y = 0;
			try {
				y = Integer.parseInt(tfOvertimeHours.getText().trim());
			}
			catch(NumberFormatException ee)
			{
				tfOvertimeHours.setText("");
				tfOvertimeHours.requestFocus();
				return;
			}
			
			int payAmount = 0;
			payAmount = pc.getPay(x, y);
			
			tfResult.setText(String.valueOf(payAmount));
			resetButton.setEnabled(true);
		}
	}
}
