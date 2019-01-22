/* 181쪽, 4번 다음 코드는 아래에 설명하는 요구사항을 만족하는 프로그램을 작성한 것이다. 질문에 답하라. */

/* 필드 안에 2개 이상의 공이 존재한다.
 * 각 공은 첫째, 좌우로 움직이거나 둘째, 상하로 움직이거나 셋째, 대각선으로 움직일 수 있다.
 * 각 공은 빨간색이나 파란색으로 칠해진다.
 */

package java_design_pattern;

// 볼을 대각선으로 움직이게 하는 전략
public class DiagonalMoveStrategy extends DirectionStrategy{

	public void move(Ball ball)
	{
		ball.setIntervals(Ball.INTERVAL, Ball.INTERVAL); // 볼의 시작점을 설정함
		while(true)
		{
			// 대각선 방향으로 볼의 크기만큼 볼을 이동함
			ball.setX(ball.getX()+ball.getXinterval());
			ball.setY(ball.getY()+ball.getYinterval());
			
			// 프레임의 경계에 도달했을 때 볼의 진행 방향을 바꿈
			if((ball.getX() < 0 && ball.getXinterval() < 0) ||
				ball.getX() + Ball.SIZE > BallFrame.WIDTH - 15 && ball.getXinterval() > 0)
			{
				ball.setIntervals(-ball.getXinterval(), ball.getYinterval());
			}
			if((ball.getY() < 0 && ball.getYinterval() < 0) ||
				ball.getY() + Ball.SIZE > BallFrame.HEIGHT - 40 && ball.getYinterval() > 0)
			{
				ball.setIntervals(ball.getXinterval(), -ball.getYinterval());
			}
			try {
				Thread.sleep(30);
			}catch(InterruptedException e) {}
		}
	}
}
