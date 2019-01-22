/* 174쪽, 로봇만들기 코드 5-3 [개선된 코드 interface 이용] */

package java_design_pattern;

public class MissileStrategy implements AttackStrategy
{
	public void attack()
	{
		System.out.println("I have Missile and can attack with it.");
	}
}
