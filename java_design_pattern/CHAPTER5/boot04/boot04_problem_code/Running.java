/* 185쪽, 5번 다음 코드와 실행 결과를 참고해 물음에 답하라. */

/* 만약 프로그램이 새로운 달리기 이미지를 처리해야 한다면 이때 어떤 문제가 발생하는가? */

package java_design_pattern;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Running extends JFrame{
	private Field field;
	
	public Running()
	{
		super("Running");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		field = new Field();
		
		add(field, BorderLayout.CENTER);
		
		setSize(500, 500);
		setVisible(true);
		
		Thread th = new Thread(field);
		th.start();
	}

}
