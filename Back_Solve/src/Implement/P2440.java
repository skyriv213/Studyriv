package Implement;

import java.util.Scanner;

public class P2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// �������� �־��� n �� �Է�
		int n = sc.nextInt();
		
		/*
		 *   ���� �ݺ��� ����
		 *		���� �ݺ����� �־��� n���� ���ڰ� �ϳ��� �پ��°��� ǥ��
		 *		���� �ݺ����� �־��� n�� ������ŭ *�� ���
		 */
		for(int i = n ;i >0;i--) {
			for(int j = i ; j > 0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
