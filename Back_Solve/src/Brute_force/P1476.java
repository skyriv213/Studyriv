package Brute_force;

/*
 * 중국인의 나머지 정리
 * 문제에서 주어진 수는 각각 15, 28, 19 로 어떠한 수를 나눈 나머지를 의미한다.
 * 따라서 문제를 풀 때 어떤 수를 찾아가는 과정을 코드화시키면 된다.
 * --------------------------------------------------
 * 각 주어진 숫자들은 주어진 수를 각각의 수로 나눈 나머지이다. 따라서 그 수를 미리 빼줘서 계산을 하면
 * 나머지가 0이 된다.
 */

import java.util.Scanner;

public class P1476 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int e = sc.nextInt(); // 15로 나눈 나머지
		int s = sc.nextInt(); // 28로 나눈 나머지
		int m = sc.nextInt(); // 19로 나눈 나머지

		int i = 0;
		while(true) {
			i++;
			if((i-e)%15 == 0 && (i-s)%28 == 0 && (i-m)%19 == 0) {
				break;
			}
		}
		System.out.print(i);
	}
}
