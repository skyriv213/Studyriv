package Etc;

import java.util.Scanner; 

public class P13241 {
	static long GCD(long a, long b) {
		long r = a%b;
		if(r==0) {
			return b;
		}
		else {
			return GCD(b,r);
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
			long a = sc.nextLong();
			long b = sc.nextLong();
			long x = GCD(a,b);
			
		
		System.out.println((long)a*b/x);
	}
}

