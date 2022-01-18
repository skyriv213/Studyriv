package Dynamic_Programming;

import java.util.Scanner;

public class P2193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		long [] dp = new long[91];
		
		// 이친수의 점화식은 dp[i] = dp [i-1] +dp[i-2] 이다.
		dp[1]=1;
		dp[2]=1;
		
		for(int i = 3; i <dp.length;i++) {
			dp[i] =  dp[i-1]+dp[i-2];
		}
		System.out.println((long)dp[n]);

	}

}
