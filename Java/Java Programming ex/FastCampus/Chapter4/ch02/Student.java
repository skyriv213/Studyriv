package ch02;

public class Student {
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName  =  studentName;
		this.studentNum = studentNum;
		
	}
	public String toString() {
		return studentNum + ","+ studentName ;
	}

}
