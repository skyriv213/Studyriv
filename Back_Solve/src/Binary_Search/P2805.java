package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class P2805 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int  n = sc.nextInt(); // ������ ����
		int  k = sc.nextInt(); // ���������� �ϴ� ����
		
		int [] arr = new int [n]; // �Է¹޴� ����
		
		
		
		// �ڸ����� �ϴ� �־��� ������ �ּҰ��� 1�̴�.
		long start =1;
		
		// ������ �ִ� �ľ�
		long end = 0;

		long mid,count;
		
		for(int i = 0 ;i <n ; i++) {
			arr[i] = sc.nextInt();
			if(end<arr[i]) {
				end=arr[i];
			}
		}
		
		// start�� end�� ������ �ݺ����� �ݺ� �󵵸� ����
		while(start <=end) {
			
			mid = (start+end)/2;
			
			count = 0;
			
			for(int i = 0; i < n;i++) {
				if(arr[i]>=mid) {
					count+=arr[i]-mid;
				}
			}
			// count�� ���ϴ� ���̸� �Ѿ�� �������� ����
			if(count >=k) {
				start= mid + 1;
			}
			
			else if(count<k){
				end =mid-1;
				}
				
			}
		
		System.out.println(start);
		
		
	
	}

}
