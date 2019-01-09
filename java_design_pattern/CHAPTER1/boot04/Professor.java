/* [p.44] 27쪽, 그림 1-9 를 코드로 작성하라. */
package java_design_pattern;

public class Professor {
	private Student student;

	public void setStudent(Student student)
	{
		// 다른 클래스의 메소드를 부른다.
		this.student = student;
		student.setAdvisor(this);
	}
	
	public void advise()
	{
		// 다른 클래스의 메소드를 부른다.
		student.advise("상담 내용은 여기에...");
	}
}
