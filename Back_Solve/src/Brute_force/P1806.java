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
		int min = 9999;
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
				sum += arr[end];
				end++;
			}
			// sum이 s보다 클경우
			else {
				// start의 지점을 늘려주고, 그 지점 값을 빼준다
				start++;
				sum -= arr[start];
			}
		}
		if(min == 9999) {
			System.out.println(0);
		}
		else {
			System.out.println(min);
		}
	}
}