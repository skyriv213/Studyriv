package Solve;

import java.util.Scanner;

public class Ex3_003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오>>>");
		int n = sc.nextInt();
		for(int i = n; i >0 ; i--) {
			for(int j=0; j<i;j++) {
			System.out.print("*");
		}
			System.out.println();
		}
		sc.close();

	}

}
