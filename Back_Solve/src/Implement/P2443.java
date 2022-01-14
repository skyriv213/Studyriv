package Implement;

import java.util.Scanner;

public class P2443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j =0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =n-1;i>0;i--) {
			for(int j =n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j = i*2-1;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
