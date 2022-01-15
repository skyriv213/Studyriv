package Dynamic_Programming;

import java.util.Scanner;

public class P11727 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// dp[0] /[n]���� �������ؼ� dp�迭�� ���̸� �÷��� ����Ѵ�.
		int dp [] = new int [n+2];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 3;
		
		for(int i = 3;i <=n; i++) {
			// ��ȭ���� ���� �� �̸� �ƿ��� n���� dp ���ϱ�
			// ������ 1�� �����ʹ� �ٸ��� 2*2�������� ����� ���� ���ܼ� ���� �� �þ��.
			dp[i] = (2*dp[i-2]+dp[i-1])%10007;
		}
	System.out.println(dp[n]);
	sc.close();
	}

}
