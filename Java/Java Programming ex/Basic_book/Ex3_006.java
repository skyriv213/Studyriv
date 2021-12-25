package Solve;
import java.util.*;

public class Ex3_006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] m = {50000, 1000, 1000, 500, 100, 50, 10, 1};
		System.out.println("금액을 입력하시오>>>>");
		int a = sc.nextInt();
		for(int i = 0; i<m.length; i++) {
			if(a / m [i] != 0 ) {
				System.out.println(m[i]+"원 짜리 : "+a/m[i]+"개");
				a%=m[i];
			}
		}
		sc.close();

	}

}


/*
*대입연산자 복습 
*대입연산자 강의 듣기 
*/