package Brute_force;

/*
 * �߱����� ������ ����
 * �������� �־��� ���� ���� 15, 28, 19 �� ��� ���� ���� �������� �ǹ��Ѵ�.
 * ���� ������ Ǯ �� � ���� ã�ư��� ������ �ڵ�ȭ��Ű�� �ȴ�.
 * --------------------------------------------------
 * �� �־��� ���ڵ��� �־��� ���� ������ ���� ���� �������̴�. ���� �� ���� �̸� ���༭ ����� �ϸ�
 * �������� 0�� �ȴ�.
 */

import java.util.Scanner;

public class P1476 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int e = sc.nextInt(); // 15�� ���� ������
		int s = sc.nextInt(); // 28�� ���� ������
		int m = sc.nextInt(); // 19�� ���� ������

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
