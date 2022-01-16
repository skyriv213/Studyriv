package Etc;

import java.util.Scanner;

public class P2609 {
	
	static int GCD(int p, int q) {
		
		if(q==0) {
			return p;
		}
		return GCD(q,p%q);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(GCD(a,b));
		System.out.println(a*b/GCD(a,b));
	}

}
