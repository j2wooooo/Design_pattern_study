/* 181쪽, 4번 다음 코드는 아래에 설명하는 요구사항을 만족하는 프로그램을 작성한 것이다. 질문에 답하라. */

/* 필드 안에 2개 이상의 공이 존재한다.
 * 각 공은 첫째, 좌우로 움직이거나 둘째, 상하로 움직이거나 셋째, 대각선으로 움직일 수 있다.
 * 각 공은 빨간색이나 파란색으로 칠해진다.
 */

package java_design_pattern;

import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Field extends JPanel implements Runnable{
	private static final long serialVersionUID = 1L;
	private Ball[] balls;
	public Field(Ball[] balls) {
		this.balls = balls;
		setLayout(new FlowLayout());
	}
	
	public void paint(Graphics g)
	{
		g.clearRect(0, 0, BallFrame.WIDTH, BallFrame.HEIGHT);
		for(int i = 0; i < balls.length; i++)
		{
			g.setColor(balls[i].getColor());
			g.fillOval(balls[i].getX(), balls[i].getY(), Ball.SIZE, Ball.SIZE);
		}
	}
	
	public void run() {
		while(true) {
			repaint();
			try {
				Thread.sleep(5);
			}
			catch (InterruptedException e) {}
		}
	}
}
