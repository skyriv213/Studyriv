package Dynamic_Programming;

import java.util.Scanner;

public class P1932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer [][] arr = new Integer [n][n];
		int [][] dp = new int [n][n];
	
		for(int i = 0; i <n;i++) {
			for(int j =0 ; j<i+1;j++ ) {
				dp[i][j]=arr[i][j] = sc.nextInt();
			}
		}
		
//		for(int i = 1; i <n+1;i++) {
//			for(int j =1 ; j<i+1;j++ ) {
//				System.out.print(arr[i][j]+" ");
//				
//			}
//			System.out.println();
//		}
		
		// 아래에서 위로 타고 올라가는 방식으로 접근
		// 아래의 행을 두대 비교를 하고 비교한 행 중에서 큰 숫자의 행을 고르고 기존 arr에서 더해준다.
		
		for(int x =n-1;x> 0;x--) {
			for(int y =0; y<x ;y++) {
				
				dp[x-1][y]= Math.max(dp[x][y], dp[x][y+1])+arr[x-1][y];
			}
		}
		
		System.out.println(dp[0][0]);
		
		
		
		
		sc.close();

	}

}
