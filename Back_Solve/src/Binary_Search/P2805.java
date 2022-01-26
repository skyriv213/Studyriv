package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class P2805 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int  n = sc.nextInt(); // 나무의 갯수
		int  k = sc.nextInt(); // 가져가고자 하는 높이
		
		int [] arr = new int [n]; // 입력받는 높이
		
		
		
		// 자르고자 하는 주어진 높이의 최소값은 1이다.
		long start =1;
		
		// 높이의 최댓값 파악
		long end = 0;

		long mid,count;
		
		for(int i = 0 ;i <n ; i++) {
			arr[i] = sc.nextInt();
			if(end<arr[i]) {
				end=arr[i];
			}
		}
		
		// start와 end의 값으로 반복문의 반복 빈도를 결정
		while(start <=end) {
			
			mid = (start+end)/2;
			
			count = 0;
			
			for(int i = 0; i < n;i++) {
				if(arr[i]>=mid) {
					count+=arr[i]-mid;
				}
			}
			// count가 원하는 높이를 넘어가면 시작점을 증가
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
