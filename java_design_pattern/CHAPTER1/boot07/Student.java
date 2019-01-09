/* [p.48] 31쪽, 그림 1-14 를 코드로 작성하라. */
package java_design_pattern;

import java.util.Iterator;
import java.util.Vector;

public class Student {
	
	// Transcript class 자료형을 갖는 vector
	private Vector<Transcript> transcripts;
	private String name;

	// 학생의 이름을 저장하고 이 학생의 정보에 대한 vector를 만든다.
	public Student(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	// 학생에 대한 정보를 저장하는 메서드
	public void addTranscript(Transcript transcript) {
		// 이 학생의 정보에 대한 vector에 정보들을 저장한다.
		transcripts.add(transcript);
	}
	
	// 학생이 듣는 강좌들을 반환하는 메서드
	public Vector<Course> getCourses(){
		Vector<Course> courses = new Vector<Course>();
		Iterator<Transcript> itor = transcripts.iterator();
		
		while(itor.hasNext()) {
			Transcript tr = itor.next();
			courses.add(tr.getCourse());
		}
		return courses;
	}
}
