package Brute_force;

import java.util.Scanner;

public class P1527 {

		
	//if ���� ���� t/f ����
	static boolean check(long num) {
		
		// ������ false�� ����
		boolean ck = false;

		// 0���� ���������� �ݺ�
		while (num>0) {
			// ������ ���� ���� 4�� 7�� �ƴϸ� ���� �� �� false ��ȯ
			if (num % 10 != 4 && num % 10 != 7) {
				ck = false;
				break;
			}
			// ���� 4�� 7�� ��� num�� ���� 10���� ���� ������ ����, �� true ��ȯ
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
		// count ���
		System.out.println(count);
	}
}
