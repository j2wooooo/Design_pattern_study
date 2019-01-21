/* 162쪽, 다음 GUI 클래스에 포함된 init 메서드의 순차 다이어그램을 작성하라. */

package java_design_pattern;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

class GUI extends Frame{
	private JLabel l = new JLabel("W = ", Label.RIGHT);
	private JTextField tf = new JTextField();
	private JButton b = new JButton("B");
	
	public GUI()
	{
		super("순차 다이어그램");
		this.init();
		this.setSize(500, 200);
		this.setVisible(true);
	}
	
	public void init() {
		this.setLayout(new GridLayout(1,1));
		
		Panel p1 = new Panel(new BorderLayout());
		p1.add("West", l);
		p1.add("Center", tf);
		
		Panel p2 = new Panel(new FlowLayout(FlowLayout.CENTER));
		p2.add(b);
		this.add(p2);
	}
}
