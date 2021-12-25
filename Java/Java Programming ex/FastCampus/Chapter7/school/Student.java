package school;

import java.util.ArrayList;
public class Student {
	// ��ü�� �̷�µ� �ʿ��� �⺻ �ʵ�
	private int StudentId;
	private String StudentName;
	private Subject Major;
	
	//�л� ���� ����Ʈ
	private ArrayList<Score> ScoreList = new ArrayList<Score>();
	
	public Student(int StudentId,String StudentName, Subject Major) {
		this.StudentId =StudentId;
		this.StudentName = StudentName;
		this.Major = Major;
	}
	
	// ScoreList�� score�� �߰���Ű�� �޼ҵ�
	public void addSubjectScore(Score score) {
		ScoreList.add(score);
	}
	
	// StudentId�� �޾ƿ��� �޼ҵ�
	public int getStudentId() {
		return StudentId;
	}
	
	// StudentId�� ���� ������ private�� ����� �ʵ��� ���� �����ϹǷ� ����ϴ� �޼ҵ�, �����͸� �����ϴ� ����
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
