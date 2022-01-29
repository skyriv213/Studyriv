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
		// 배열을 정렬
		Arrays.sort(arr);
		
		
		int value =0;
		
		for(int i = n-1;i>=0;i--) {
			// 처음 두개는 기존의 큰 순서로 정렬이 되었기에 차례대로 더해주기
			if(i>n-3) {
				value += arr[i];
			}
			// 그 이후에는 큰값과 나온값을 더해주기
			else {
			value += arr[n-1]+arr[i];
			}
		}
		System.out.println(value);
	
		
		
	}

}
