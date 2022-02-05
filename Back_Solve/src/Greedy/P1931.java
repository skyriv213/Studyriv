package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1931 {	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int[n][2];
		
		int count = 0; // ȸ�ǽ� ����
		
		int time = 0; // ȸ�ǽð��� ���� 
		
		for(int i = 0 ; i <  n ;i++) {
			arr[i][0]= sc.nextInt(); //����
			arr[i][1]= sc.nextInt(); //��
		}
		
		// ������ ������ ����
		Comparator<int[]> com = new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				// ������ �ð��� ���ٸ� ù��°�� �������� �������� ������ ���ش�.
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}
				return o1[1]-o2[1];
			}
			
		};
		
		Arrays.sort(arr,com);
		
		// 
		for(int i = 0;i<n;i++) {
			if(time<=arr[i][0]) {
				time = arr[i][1];
				count++;
			}
		
		}
		System.out.println(count);
	}

}
