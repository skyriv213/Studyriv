package Implement;


// �־��� ���ڵ��� ����� ���� ����

// ���������� ���ϰ����ϴ� n�� ���� 1,n�� ������ ��� ����� �شٰ� �ߴ�.

// ���� �־��� ���ڵ��߿� 1,n�������� ũ�� ���� ���ڵ��� ��󳻼� �� �ΰ��� ���ϴ� ������� �����Ͽ���.

import java.util.Scanner;

public class P1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		
		// ������� ����
		int n = sc.nextInt();
		
		// ����� �� �ִ�/�ּҰ� ���ϱ� ���� ���� ����
		int max=0;
		int min = 999999;
		int [] arr = new int[n];
		
		// �迭�� ������� �Է�
		for(int i =0; i< arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		// �迭���� if���� ���� �ִ�/�ּڰ� ��󳻱�
		for(int i = 0 ; i< arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		
		}
		// max�� min�� ���Ͽ� ����ϱ�
		System.out.println(max*min);
		
	}

}
