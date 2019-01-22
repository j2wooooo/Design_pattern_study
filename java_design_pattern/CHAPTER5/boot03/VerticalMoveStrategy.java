/* 181쪽, 4번 다음 코드는 아래에 설명하는 요구사항을 만족하는 프로그램을 작성한 것이다. 질문에 답하라. */

/* 필드 안에 2개 이상의 공이 존재한다.
 * 각 공은 첫째, 좌우로 움직이거나 둘째, 상하로 움직이거나 셋째, 대각선으로 움직일 수 있다.
 * 각 공은 빨간색이나 파란색으로 칠해진다.
 */

package java_design_pattern;

public class VerticalMoveStrategy extends DirectionStrategy{
	public void move(Ball ball)
	{
		ball.setIntervals(0, Ball.INTERVAL); // 볼의 시작점에 위치
		while(true)
		{
			ball.setY(ball.getY()+ball.getYinterval()); // 볼의 크기만큼 수직으로 이동
			
			if((ball.getY() < 0 && ball.getYinterval() < 0) ||
			ball.getY() + Ball.SIZE > BallFrame.HEIGHT - 40 && ball.getYinterval() > 0)
			{
				// 프레임의 경계에 도달했을 때 볼의 진행 방향을 바꿈
				ball.setIntervals(0, -ball.getYinterval());
			}
			try {
				Thread.sleep(30);
			}catch(InterruptedException e) {}
		}
	}
}
