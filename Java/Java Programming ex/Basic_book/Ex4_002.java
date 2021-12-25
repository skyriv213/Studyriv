package Solve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex4_002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    System.out.print("수학, 과학, 영어 순으로 3개의 점수를 입력하시오>> ");
		
		String [] s = br.readLine().split(" ");
		
		int [] score = new int [3];
		for(int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(s[i]);
		}
		int math = score[0];
		int science = score[1];
		int english = score[2];
		
		Grade me = new Grade(math, science, english);
		bw.write("평균은 " + Integer.toString(me.average()));
		
		bw.flush();
		bw.close();
		

	}

}
class Grade{
	private int math, science, english;
	
	public Grade(int math, int science, int english) {
		this.math =  math;
		this.science =  science;
		this.english = english;
		
	}
	public int average() {
		int sc = (math + science + english)/3;
	    return sc;
	}
}
