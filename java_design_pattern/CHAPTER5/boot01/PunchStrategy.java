/* 174쪽, 로봇만들기 코드 5-3 [개선된 코드 interface 이용] */

package java_design_pattern;

public class PunchStrategy implements AttackStrategy
{
	public void attack()
	{
		System.out.println("I have strong punch and can attack with it.");
	}
}
