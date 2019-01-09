/* [p.46] 29쪽, 그림 1-12을 코드로 작성하라. */
package java_design_pattern;

import java.util.Vector;

public class Course{
	private String name;
	private Vector<Student> students;
	
	// 강좌의 이름을 받아와 저장하고 이 강좌를 듣는 학생들의 vector를 만든다.
	public Course(String name) {
		this.name = name;
		students = new Vector<Student>();
	}
	
	// 이 강좌를 듣는 학생들의 vector에 새로운 학생을 추가한다.
	public void addStudent(Student student) {
		students.add(student);
	}
	
	// 이 강좌를 듣는 학생들의 vector에서 기존의 학생을 제거한다.
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	// 이 강좌를 듣는 학생들의 vector를 반환한다.
	public Vector<Student> getStudents(){
		return students;
	}
	
	// 이 강좌의 이름을 반환한다.
	public String getName() {
		return name;
	}
}
