package Greedy;

import java.util.Scanner;

public class P11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int [n];
		int count =0;
		
		for(int i = 0 ;i < n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i = n-1 ;i >= 0;i--) {
			if(m>=arr[i]) {
				count+=m/arr[i];
				m=m%arr[i];
			}
		}
		System.out.println(count);
		sc.close();
	}

}
