package Dynamic_Programming;

import java.util.Scanner;

public class P11727 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// dp[0] /[n]까지 생각을해서 dp배열의 길이를 늘려서 계산한다.
		int dp [] = new int [n+2];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 3;
		
		for(int i = 3;i <=n; i++) {
			// 점화식을 구한 후 이를 아용해 n까지 dp 구하기
			// 기존의 1번 문제와는 다르게 2*2사이즈의 블록이 새로 생겨서 수가 더 늘어났다.
			dp[i] = (2*dp[i-2]+dp[i-1])%10007;
		}
	System.out.println(dp[n]);
	sc.close();
	}

}
