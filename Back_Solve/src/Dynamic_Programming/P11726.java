package Dynamic_Programming;

import java.util.Scanner;

public class P11726 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int dp [] = new int [n+2];
		
		dp[0] = 1 ;
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3;i <=n; i++) {
			dp[i] = (dp[i-2]+dp[i-1])%10007;
		}
	System.out.println(dp[n]);
	sc.close();
	}

}
// 수의 규칙과 경우의 수를 따져보면 피보나치와 같다.