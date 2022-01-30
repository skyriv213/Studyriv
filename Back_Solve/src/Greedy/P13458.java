package Greedy;
/*  ���� ���ٹ��
 * �Ѱ������� ���� �����帶�� 1�� �ʼ� =  �������� ������ �Ѱ������� ��
 * �� �������� ���� ������ b�� ���缭 p�� Ŀ���� �Ǹ� ���� ����������
 * ���� �ο��� ���� ������ �Ѿ�� �� �������� �Խ�
 * �� ���ǿ��� ��/�� �������� ������ �Ѿ�� ���� �ΰ������� �߰��� ī����
 */

import java.io.*;
import java.util.Scanner;

public class P13458 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // �������� ����
		int[] room = new int[n]; // �������� ������ �迭��
		for(int i = 0 ; i < n ; i ++) {
			room[i]=sc.nextInt();
		}
		int b = sc.nextInt(); // �Ѱ����� ���� ���� ���� ��
		int c = sc.nextInt(); // �ΰ����� ���� ���� ���� ��

		long tot = n; // �������� ũ�⸦ ���� long ������ ����
		
		for (int i = 0; i < room.length; i++) {
			// �� �濡 �������� �� �Է�
			room[i] -= b;
			
			if (room[i] > 0) {
				tot += room[i] / c;
				
				if (room[i] % c != 0) {
					tot++;
				}
			}
		}
		System.out.println(tot);
	}

}
