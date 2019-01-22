/* 167쪽, 로봇만들기 코드 5-1 */

package java_design_pattern;

public class Atom extends Robot
{
	private String name;
	public Atom(String name) {
		super(name);
	}
	
	public void attack()
	{
		System.out.println("I have strong punch and can attack with it.");
	}
	public void move()
	{
		System.out.println("I can fly.");
	}
}
