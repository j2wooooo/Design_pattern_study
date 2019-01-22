/* 185쪽, 5번 다음 코드와 실행 결과를 참고해 물음에 답하라. */

/* 만약 프로그램이 새로운 달리기 이미지를 처리해야 한다면 이때 어떤 문제가 발생하는가? */

package java_design_pattern;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Field extends JPanel implements Runnable{
	private JLabel lbl;
	private String[] walkingImage = {"walk1.gif", "walk2.gif"};
	
	public Field()
	{
		setLayout(new BorderLayout());
		lbl = new JLabel();
		lbl.setIcon(new ImageIcon("./src/walk1.gif"));
		add(lbl, BorderLayout.CENTER);
	}
	
	public void run()
	{
		while(true)
		{
			String[] path = walkingImage;
			for(int i = 0; i < path.length; i++)
			{
				lbl.setIcon(new ImageIcon("./src/" + path[i]));
				try {
					Thread.sleep(300);
				}catch(InterruptedException e) {}
			}
		}
	}
}
