package Etc;

import java.math.BigInteger;
import java.util.Scanner;

public class P2417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BigInteger big = new BigInteger(sc.next());
		
		long a = big.longValue();
		
		long x = (long) Math.sqrt(a);
		
		System.out.print(x);
	}

}

