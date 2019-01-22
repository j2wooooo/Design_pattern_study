/* 167쪽, 로봇만들기 코드 5-1 */

package java_design_pattern;

public abstract class Robot
{
	private String name;
	public Robot(String name) {
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public abstract void attack();
	public abstract void move();
}
