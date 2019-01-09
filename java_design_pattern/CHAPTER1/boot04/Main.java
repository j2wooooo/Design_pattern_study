/* [p.44] 27쪽, 그림 1-9 를 코드로 작성하라. */
package java_design_pattern;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hongGilDong 이라는 Professor Class 변수를 만든다.
		Professor hongGilDong = new Professor();
		// manSup 이라는 Student Class 변수를 만든다.
		Student manSup = new Student();
	
		hongGilDong.setStudent(manSup);
		// Professor.setStudent()를 할 때,
		// Student.setAdvisor()를 불러 student의 advisor를 hongGilDong으로 설정한다.
		
		hongGilDong.advise();
		// Professor.advise()를 할 때,
		// Student.advise("상담 내용은 여기에...")를 부른다.
	}
}

/* 이 코드의 연관 관계는 양방향 영관 관계이므로 Professor 클래스 객체에서 Student 클래스 객체를 참조할 수 있는 속성(student)이 있고
Student 클래스 객체에서 Professor 클래스 객체를 참조할 수 있는 속성(advisor)이 있다.
또한 이 속성의 이름이 역할 이름을 활용한 것임을 알 수 있다. */
