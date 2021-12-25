package school;

import java.util.ArrayList;
public class Student {
	// 객체를 이루는데 필요한 기본 필드
	private int StudentId;
	private String StudentName;
	private Subject Major;
	
	//학생 성적 리스트
	private ArrayList<Score> ScoreList = new ArrayList<Score>();
	
	public Student(int StudentId,String StudentName, Subject Major) {
		this.StudentId =StudentId;
		this.StudentName = StudentName;
		this.Major = Major;
	}
	
	// ScoreList에 score를 추가시키는 메소드
	public void addSubjectScore(Score score) {
		ScoreList.add(score);
	}
	
	// StudentId를 받아오는 메소드
	public int getStudentId() {
		return StudentId;
	}
	
	// StudentId의 값을 수정시 private로 선언된 필드의 값을 수정하므로 사용하는 메소드, 데이터를 변경하는 역할
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	
	public Subject getMajor() {
		return Major;
	}

	public void setMajor(Subject major) {
		Major = major;
	}

	
	public ArrayList<Score> getScoreList() {
		return ScoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		ScoreList = scoreList;
	}

	void show() {
		System.out.println();
	}
}
