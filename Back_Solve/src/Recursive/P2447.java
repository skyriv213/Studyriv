package Recursive;

import java.util.Arrays;
import java.util.Scanner;

public class P2447 {

	static String arr[][];
	
	static void blank(int x,int y,int w,int n) {
		for(int i =0 ; i<x;i++) {
			for(int j = 0;j<y;j++) {
				// ��,���� ��ȯ
				if(i==w&&j==w|| i>w && i<w+(w-1) &&j>w && j<w+(w-1)) {
					arr[i][j]=" ";
				}
			}
		}
		x=
		
	}
	
		/*
		���� �������� ����
		���� �������� ������ ���� ���̰� 3�� ���簢������ �й�
		x�� N�� �Ǿ��� ��� �ٽ� x�� 0���� �ʱ�ȭ
		���ÿ� y�� ���ڹ��� ����
		y�� ���ڹ����� ������ ���¿��� �ٽ� x�� N�� �Ǿ��� ��� 
		�ٽ� y�� ����
		
		�߰��� N�� 3����� ������ �����ϴ� ��ǥ���� ������ ����
		
		�Ŀ� x�� y�� ���� N�� �Ǿ��� ��� �迭�� ���
		 */
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		arr= new String [N][N];
		
		Arrays.fill(arr, "*");
		int w=N/3; // ������� ����
		
		sc.close();
	}

}
