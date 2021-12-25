package Solve;
import java.util.*;

public class Ex2_2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("2자리수 정수를 입력하시오(10~99)>>>");
		int a = sc.nextInt();
		int b = a/10;
		int c = a%10;
		if (b==c) {
			System.out.println("일의 자리 숫자와 십의 자리숫자가 동일합니다.");
		}
		else {
			 System.out.println("일의 자리 숫자와 십의 자리숫자의 수가 틀립니다");
			}
		
		
		
     sc.close();
	}

}
