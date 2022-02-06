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
		int min = Integer.MAX_VALUE;
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
				// end�� �ε��� ���� �����ְ� end ���� ��� �� �߰�
				sum += arr[end++];
			}
			// sum�� s���� Ŭ���
			else {
				// ���� ���� sum���� ���ְ� start�� ���� �ϳ� ����
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