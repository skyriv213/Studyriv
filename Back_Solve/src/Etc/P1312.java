package Etc;

import java.util.Scanner;

public class P1312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		a %=b;
		for(int i = 0 ; i <n-1;i++) {
			a*=10;
			a%=b;
		}
		a*=10;
		
		System.out.println(a/b);
	}

}
