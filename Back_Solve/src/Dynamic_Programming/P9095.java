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
		
		// 문제에서 주어진 n은 11보다 작으므로 max값이 10
		// 따라서 dp배열의 크기는 10+1로 잡고 인덱스를 그대로 호출할 수 있도록 함
		// dp의 경우 이전의 값을 사용하여 답을 도출하는 문제가 대부분
		// 규칙성을 찾아보자
		// 규칙성으로는 이전 3개의 항의 합이 원하는 항의 값이 된다.
		for(int i = 0 ; i <11;i++) {
		
			if(i>3) {
			dp[i] = dp[i-3] +dp[i-2]+dp[i-1];
		}
		}
		// 출력문 - arr배열의 원소를 인덱스로 받아 호출
		for(int i = 0 ; i < arr.length;i++) {
			System.out.println(dp[arr[i]]);
		}
	}

}
