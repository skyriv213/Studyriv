package school;


public class Score {
	private int StudentId;
	private Subject subject;
	private int point;
	
	public Score(int StudentId, Subject subject, int point) {
		this.StudentId = StudentId;
		this.subject =subject;
		this.point =point;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ÇÐ¹ø" + StudentId + ", " + subject.getSubjectName()+ ":" + point;
	}
	
}
