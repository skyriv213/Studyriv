package Dynamic_Programming;

import java.util.Scanner;

public class P9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int [] arr = new int[n];
		for(int i =0 ;i<n;i++) {
			arr[i]= sc.nextInt();

			}
		int []dp =new int [10+1];
	
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		// �������� �־��� n�� 11���� �����Ƿ� max���� 10
		// ���� dp�迭�� ũ��� 10+1�� ��� �ε����� �״�� ȣ���� �� �ֵ��� ��
		// dp�� ��� ������ ���� ����Ͽ� ���� �����ϴ� ������ ��κ�
		// ��Ģ���� ã�ƺ���
		// ��Ģ�����δ� ���� 3���� ���� ���� ���ϴ� ���� ���� �ȴ�.
		for(int i = 0 ; i <11;i++) {
		
			if(i>3) {
			dp[i] = dp[i-3] +dp[i-2]+dp[i-1];
		}
		}
		// ��¹� - arr�迭�� ���Ҹ� �ε����� �޾� ȣ��
		for(int i = 0 ; i < arr.length;i++) {
			System.out.println(dp[arr[i]]);
		}
	}

}
