/* 181쪽, 4번 다음 코드는 아래에 설명하는 요구사항을 만족하는 프로그램을 작성한 것이다. 질문에 답하라. */

/* 필드 안에 2개 이상의 공이 존재한다.
 * 각 공은 첫째, 좌우로 움직이거나 둘째, 상하로 움직이거나 셋째, 대각선으로 움직일 수 있다.
 * 각 공은 빨간색이나 파란색으로 칠해진다.
 */

package java_design_pattern;

import java.awt.Color;

public class BlueDrawStrategy extends DrawStrategy{
	public void draw(Ball ball)
	{
		ball.setColor(Color.blue);
	}
}
