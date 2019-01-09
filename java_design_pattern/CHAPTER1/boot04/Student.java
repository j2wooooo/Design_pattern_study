/* [p.44] 27쪽, 그림 1-9 를 코드로 작성하라. */
package java_design_pattern;

public class Student {
	private Professor advisor;

	public void setAdvisor(Professor advisor)
	{
		this.advisor = advisor;
	}
	
	public void advise(String msg)
	{
		System.out.println(msg);
	}
}
