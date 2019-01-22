/* 174쪽, 로봇만들기 코드 5-3 [개선된 코드 interface 이용] */

package java_design_pattern;

public class WalkingStrategy implements MovingStrategy
{
	public void move()
	{
		System.out.println("I can only walk.");
	}
}
