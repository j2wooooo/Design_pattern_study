/* [p.48] 31쪽, 그림 1-14 를 코드로 작성하라. */
package java_design_pattern;

import java.util.Vector;
import java.util.Iterator;

public class Transcript {

	// 정보들에 Student, Course 클래스와 수강 날짜, 수강 학점이 있다.
	private Student student;
	private Course course;
	private String date;
	private String grade;
	
	// 학생과 강좌에 대한 정보가 들어오면 학생, 강좌의 정보를 저장한다. 이 trascript의 각 vector에도 추가한다.
	public Transcript(Student student, Course course) {
		this.student = student;
		this.student.addTranscript(this);
		this.course = course;
		this.course.addTranscript(this);
	}
	
	public Student getStudent() {
		return student;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
}
