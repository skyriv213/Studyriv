package Implement;

import java.util.Scanner;

public class P2576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 7;
		
		int [] arr = new int [n];
		
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = sc.nextInt();			
		}
		
		int sum = 0 ;
		int min = 99999;
		for(int i = 0; i < arr.length;i++ ) {
			if(arr[i]%2!=0) {
				sum+=arr[i];
				if(min >arr[i]) {
					min = arr[i];
				}
			}
		}
		if(sum ==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
