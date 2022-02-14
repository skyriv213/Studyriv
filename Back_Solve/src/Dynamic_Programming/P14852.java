package Dynamic_Programming;

import java.math.BigInteger;
import java.util.Scanner;

public class P14852 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		
		BigInteger [] dp = new BigInteger[n+1];
		
		dp[0]=new BigInteger("0");
		dp[1]=new BigInteger("2");
		dp[2]=new BigInteger("7");
		if(n>2) {
			for(int i=3;i<=n;i++) {
				dp[i]= dp[i-1].multiply(new BigInteger("3"));
				dp[i]= dp[i].add(new BigInteger("1"));
			}
		}
		System.out.println(dp[n].remainder(new BigInteger("1000000007")));
				
		
		
	}

}
