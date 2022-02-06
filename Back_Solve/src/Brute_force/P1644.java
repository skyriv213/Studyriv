package Brute_force;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P1644 {
	static int N;
	static boolean[] arr;
	static ArrayList<Integer> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new boolean[N + 1];
		list = new ArrayList<>();
		Arrays.fill(arr, true);

		arr[0] = arr[1] = false;
		for (int i = 2; i * i <= N; i++) {
			if (arr[i]) {
				for (int j = i * i; j <= N; j += i) {
					arr[j] = false;
				}
			}
		}


		// 소수를 리스트에 넣어주기

		for (int i = 0; i <= N; i++) {
			if (arr[i]) {
				list.add(i);
			}
		}

		int count = 0;
		int start = 0;
		int end = 0;
		int sum = 0;

		while (true) {
			if (sum >= N) {
				sum -= list.get(start++);

			} else if (end == list.size()) {
				break;
			} 
			else {
				sum += list.get(end++);

			}
			if (N == sum)
				count++;
		}

		System.out.println(count);

	}
}
