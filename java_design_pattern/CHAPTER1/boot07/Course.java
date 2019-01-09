/* [p.48] 31쪽, 그림 1-14 를 코드로 작성하라. */
package java_design_pattern;

import java.util.Iterator;
import java.util.Vector;

public class Course{
	private Vector<Transcript> transcripts;
	private String name;
	
	// 강좌의 이름을 받아와 저장하고 이 강좌의 정보를 담는 vector를 만든다.
	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	// 이 강좌의 이름을 반환한다.
	public String getName() {
		return name;
	}
}
