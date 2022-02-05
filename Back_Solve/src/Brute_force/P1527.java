package Brute_force;

import java.util.Scanner;

public class P1527 {

		
	//if 문을 위한 t/f 조건
	static boolean check(long num) {
		
		// 변수는 false로 지정
		boolean ck = false;

		// 0보다 작을때까지 반복
		while (num>0) {
			// 나누고 남은 값이 4와 7이 아니면 종료 및 값 false 반환
			if (num % 10 != 4 && num % 10 != 7) {
				ck = false;
				break;
			}
			// 값이 4와 7일 경우 num의 값을 10으로 나눈 몫으로 지정, 및 true 반환
			else {
				num/=10;
				ck = true;
			}
			
		}
		return ck;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		long a = sc.nextLong();
		long b = sc.nextLong();

		for (long i = a; i <= b; i++) {

			if (check(i)) {
				count++;
			}

		}
		// count 출력
		System.out.println(count);
	}
}
