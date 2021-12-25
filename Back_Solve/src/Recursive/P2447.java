package Recursive;

import java.util.Arrays;
import java.util.Scanner;

public class P2447 {
	
	static char arr[][];
	
	static int recursive(int a, int b, int n) {
		
		for(int i = a;i<=b;i++) {
			
		}
		return recursive(a,b,n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		arr= new char [N][N];
		Arrays.fill(arr, " ");
		int b = N/N+1;
		recursive(0,b,N);
	}

}
