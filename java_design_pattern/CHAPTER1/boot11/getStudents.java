/* [p.56] 그림 1-14를 구현한 코드에서 과목의 수강생을 구하는 getStudents 메서드를 구현하라. */

	// 강좌를 듣는 학생들을 반환하는 메소드
	public Vector<Student> getStudents(){
		Vector<Student> students = new Vector<Student>();
		Iterator<Transcript> itor = transcripts.iterator();
		
		while(itor.hasNext()) {
			Transcript tr = itor.next();
			students.add(tr.getStudent());
		}
		return students;
	}
