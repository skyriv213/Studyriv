package Etc;

import java.io.IOException;
import java.util.Scanner;

public class P1735 {
	
	static int GCD(int p, int q) {
		
		if(q==0) {
			return p;
		}
		return GCD(q,p%q);
	}
	
	public static void main(String[] args) throws IOException {
		  	Scanner sc= new Scanner(System.in);
			int a = sc.nextInt();
	        int b =sc.nextInt();
	        int c = sc.nextInt();
	        int d = sc.nextInt();

	        int numerator = a * d + b * c;
	        int denominator = b * d;
	        
	        int mod = GCD(numerator, denominator);
	        numerator /= mod;
	        denominator /= mod;

	        System.out.println(numerator + " " + denominator );
	    
	        sc.close();
	}

}
