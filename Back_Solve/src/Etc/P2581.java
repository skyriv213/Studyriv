package Etc;

import java.util.Scanner;

public class P2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int m =sc.nextInt(); // 시작
		int n = sc.nextInt(); // 끝
		int min = 10000;
		int sum = 0;
		
		int [] arr= new int [n+1];
		
		// 원소 입력
		for(int i = 2 ; i <=n;i++) {
			arr[i]=i;
		}
	
		
		// 에라토스테네스의 체 활용
		for(int i =2; i<= n;i++) {
			if(arr[i]==0) {
				continue;
			}
			for(int a = 2*i;a<=n;a+=i) {
				arr[a]= 0;
			}
		}
		
		// 반복문 실행
		for(int j = m ; j <=n;j++ ) {
				if(arr[j]!=0) {
					if(min>j) {
						min=j;
					}
				sum = sum + arr[j];
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}
		else {			
			System.out.println(sum);
			System.out.println(min);
		}
		sc.close();
		

	}
}
	
	