package Dynamic_Programming;

import java.util.Scanner;

public class P2579 {
	static int[] arr ;
	static Integer [] dp ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr = new int[n+1];
		dp = new Integer [n+1];
		
		
		for(int i = 1 ; i <= n;i++) {
			arr[i] = sc.nextInt();
		}
		dp[0]=arr[0]=0;
		dp[1]=arr[1];
		
		if(n>=2) {
			dp[2]=arr[1]+arr[2];
		}
		
		for(int i =3 ;i<=n;i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3]+arr[i-1]) +arr[i];
		}
		
		
		System.out.println(dp[n]);
		
	}

}
