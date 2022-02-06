package Brute_force;

import java.util.Scanner;

public class P1806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int s = sc.nextInt();
		int[] arr = new int[n+1];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// 변수 지정 , 수열의 합을 저장할 sum과 수열의 길이를 체크할 count
		int min = Integer.MAX_VALUE;
		int start = 0;
		int end = 0;
		int sum= 0;

		while (start <= n && end <= n) {
			// 문제에서 말한 조건식
			if(sum >= s && min > end -start) {
				// 최소길이
				min = end - start;
			}
			// sum이 s보다 작을경우, end 값을
			if(sum < s ) {
				// end의 인덱스 값을 더해주고 end 값은 계산 후 추가
				sum += arr[end++];
			}
			// sum이 s보다 클경우
			else {
				// 기존 값을 sum에서 빼주고 start의 값을 하나 증가
				sum -= arr[start++];
			}
		}
		if(min == Integer.MAX_VALUE) {
			System.out.println(0);
		}
		else {
			System.out.println(min);
		}
	}
}