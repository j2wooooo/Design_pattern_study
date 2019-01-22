/* 181쪽, 4번 다음 코드는 아래에 설명하는 요구사항을 만족하는 프로그램을 작성한 것이다. 질문에 답하라. */

/* 필드 안에 2개 이상의 공이 존재한다.
 * 각 공은 첫째, 좌우로 움직이거나 둘째, 상하로 움직이거나 셋째, 대각선으로 움직일 수 있다.
 * 각 공은 빨간색이나 파란색으로 칠해진다.
 */

package java_design_pattern;

public class HorizonalMoveStrategy extends DirectionStrategy{
	public void move(Ball ball)
	{
		ball.setIntervals(Ball.INTERVAL, 0);
		while(true)
		{
			ball.setX(ball.getX()+ball.getXinterval());
			
			if((ball.getX() < 0 && ball.getXinterval() < 0) ||
			ball.getX() + Ball.SIZE > BallFrame.WIDTH - 15 && ball.getXinterval() > 0)
			{
				ball.setIntervals(-ball.getXinterval(), 0);
			}
			try {
				Thread.sleep(30);
			}catch(InterruptedException e) {}
		}
	}
}
