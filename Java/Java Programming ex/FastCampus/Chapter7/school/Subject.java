package school;

import java.util.ArrayList;

public class Subject {
	private int StudentId;
	private String subjectName;
	private int gradeType;
	private ArrayList<Student> studentList=
			new ArrayList<>();
	
	public Subject(int StudentId,String subjectName) {
		this.StudentId = StudentId;
		this.subjectName=subjectName;
		this.gradeType=SideClass.Define.AB_type;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	
	
	
}
