package Implement;

import java.util.Scanner;

public class P2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 문제에서 주어진 n 값 입력
		int n = sc.nextInt();
		
		/*
		 *   이중 반복문 설정
		 *		밖의 반복문은 주어진 n에서 숫자가 하나씩 줄어드는것을 표현
		 *		안의 반복문은 주어진 n의 갯수만큼 *을 출력
		 */
		for(int i = n ;i >0;i--) {
			for(int j = i ; j > 0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
