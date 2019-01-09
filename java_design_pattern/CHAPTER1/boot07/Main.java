/* [p.48] 31쪽, 그림 1-14 를 코드로 작성하라. */
package java_design_pattern;

import java.util.Iterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		// Student 클래스 2개, Course 클래스 2개, 정보를 담는 Transcript 클래스 3개를 만든다.
		Student s1 = new Student("manSup"); // manSup이 저장되고 그에 대한 vector가 만들어짐.
		Student s2 = new Student("gilDong"); // gilDong이 저장되고 그에 대한 vector가 만들어짐.
		Course se = new Course("Software Engineering"); // Software Engineering이 저장되고 그에 대한 vector가 만들어짐.
		Course designPattern = new Course("Design Pattern"); // Design Pattern이 저장되고 그에 대한 vector가 만들어짐.
		
		// Transcript t1은 manSup과 Software Engineering Class의 정보를 갖는다.
		// Transcript t1의 정보가 mansup의 vector에 추가된다.
		// Transcript t1의 정보가 software Engineering의 vector에 추가된다.
		Transcript t1 = new Transcript(s1, se); // manSup은 소프트웨어 공학 수강
		
		// Transcript t2는 manSup과 Design Pattern Class의 정보를 갖는다.
		// Transcript t2의 정보가 mansup의 vector에 추가된다.
		// Transcript t2의 정보가 Design Pattern의 vector에 추가된다. 
		Transcript t2 = new Transcript(s1, designPattern); // manSup은 디자인 패턴 수강
		
		// Transcript t3은 gilDong과 Design Pattern Class의 정보를 갖는다.
		// Transcript t3의 정보가 gilDong의 vector에 추가된다.
		// Transcript t3의 정보가 Design Pattern의 vector에 추가된다. 
		Transcript t3 = new Transcript(s2, designPattern); // gilDong은 디자인 패턴 수강
		
		// manSup은 2012년에 소프트웨어 공학에서 B0, 디자인 패턴에서 D+ 학점 취득
		t1.setDate("2012");
		t1.setGrade("B0");
		t2.setDate("2012");
		t2.setGrade("D+");
		
		// gilDong은 2013년에 디자인 패턴에서 C+ 학점 취득
		t3.setDate("2013");
		t3.setGrade("C+");
		
		Vector<Course> courses;
		courses = s1.getCourses();
		for(int i = 0; i < courses.size(); i++)
		{
			System.out.println(courses.get(i).getName());
		}
		
	}
}
