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

		// ���� ���� , ������ ���� ������ sum�� ������ ���̸� üũ�� count
		int min = 9999;
		int start = 0;
		int end = 0;
		int sum= 0;

		while (start <= n && end <= n) {
			// �������� ���� ���ǽ�
			if(sum >= s && min > end -start) {
				// �ּұ���
				min = end - start;
			}
			// sum�� s���� �������, end ����
			if(sum < s ) {
				sum += arr[end];
				end++;
			}
			// sum�� s���� Ŭ���
			else {
				// start�� ������ �÷��ְ�, �� ���� ���� ���ش�
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