package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class P12845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i = 0 ; i < n ;i++) {
			arr[i] = sc.nextInt();
		} 
		// �迭�� ����
		Arrays.sort(arr);
		
		
		int value =0;
		
		for(int i = n-1;i>=0;i--) {
			// ó�� �ΰ��� ������ ū ������ ������ �Ǿ��⿡ ���ʴ�� �����ֱ�
			if(i>n-3) {
				value += arr[i];
			}
			// �� ���Ŀ��� ū���� ���°��� �����ֱ�
			else {
			value += arr[n-1]+arr[i];
			}
		}
		System.out.println(value);
	
		
		
	}

}
