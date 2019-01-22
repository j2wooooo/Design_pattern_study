/* 167쪽, 로봇만들기 코드 5-1 */

package java_design_pattern;

public class TaekwonV extends Robot
{
	private String name;
	public TaekwonV(String name) {
		super(name);
	}
	
	public void attack()
	{
		System.out.println("I have Missile and can attack with it.");
	}
	public void move()
	{
		System.out.println("I can only walk.");
	}
}
