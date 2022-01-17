package Dynamic_Programming;

import java.util.Scanner;

public class P15989 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int n  = sc.nextInt();
		
		int [] arr = new int[n];
		
		int max = 0;
		
		for(int i = 0 ; i < n ; i ++) {
			arr[i] =  sc.nextInt();
			
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		
		
		int [][] dp = new int [max+1][4];
		dp[1][1] =1; // 1
		dp[2][1] =1; // 1+1
		dp[2][2] =1; // 2
		dp[3][1] =1; // 1+1+1
		dp[3][2] =1; // 1+2
		dp[3][3] =1; // 3
		
		
		// 점화식을 구하기
		for(int i =4;i<=max;i++) {
			dp[i][1] = dp[i-1][1];
			dp[i][2] = dp[i-2][1]+dp[i-2][2];
			dp[i][3] = dp[i-3][1]+dp[i-3][2]+dp[i-3][3];
		}
		
		// 구한 점화식을 통해 기존 arr[i]를 인덱스로 넣어서 값을 더해서 출력하기
		for(int i = 0;i<arr.length;i++) {
			System.out.println(dp[arr[i]][1]+dp[arr[i]][2]+dp[arr[i]][3]);
			
		}
		
		
		
	}

}
