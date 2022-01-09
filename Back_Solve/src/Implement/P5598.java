package Implement;

import java.util.Scanner;

public class P5598 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		/* 아스키 코드 활용
		 * 아스키 코드를 바탕으로 아스키 코드의 기준점을 D로 잡고 D의 전후에서 각각의 계산식으로 출력
		 */
		for(int i = 0 ; i < s.length();i++) {
			char ch =  s.charAt(i);
			int n = (int)ch ;
			if(n>=68) {
				n = n-3;
				char ch1 =(char)n;
				System.out.print(ch1);
			}
			else if(n>=65 && n<=67) {
				n= n+23;
				char ch2 =(char)n;
				System.out.print(ch2);
			}
			
		}
		
	}
}
