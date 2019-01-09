/* [p.46] 29쪽, 그림 1-12을 코드로 작성하라. */
package java_design_pattern;

import java.util.Vector;

public class Student {
	private String name;
	private Vector<Course> courses;

	// 학생의 이름을 저장하고 이 학생이 듣는 강좌들의 vector를 만든다.
	public Student(String name) {
		this.name = name;
		courses = new Vector<Course>();
	}
	
	// 이 학생이 듣는 강좌들의 vector에 새로운 강좌를 추가한다.
	// 이 학생이 강좌를 추가함과 동시에 강좌에도 이 학생의 이름을 추가한다.
	public void registerCourse(Course course) {
		courses.add(course);
		course.addStudent(this); // 앞선 코드에서 추가된 코드
	}
	
	// 이 학생이 듣는 강좌들의 vector에서 기존 강좌를 제거한다.
	// 기존 강좌를 제거함과 동시에 강좌에도 이 학생의 이름을 제거한다.
	public void dropCOURSE(Course course) {
		if(courses.contains(course)) {
			courses.remove(course);
			course.removeStudent(this); // 앞선 코드에서 추가된 코드
		}
	}
	
	// 이 학생이 듣는 강좌들의 vector를 반환한다.
	public Vector<Course> getCourses(){
		return courses;
	}
}

/* Student 클래스와 Course 클래스의 연관 관계가 양방향 연관 관계이기 때문에 양쪽 클래스에서 서로를 참조할 수 있는 속성을 정의했다.
또한 다중성이 다대다이므로 참조 속성은 Vecor를 이용했다. */
