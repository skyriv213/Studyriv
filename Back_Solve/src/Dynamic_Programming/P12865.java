package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;


public class P12865 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 물건의 갯수
		int k = sc.nextInt(); // 물건의 버틸수 있는 무게
		
		// 각 배열의 경우 인덱스를 편하게 하기위해 1씩 증가
		int [] w = new int [n+1]; // 무게 배열
		int [] v = new int [n+1]; // 가치 배열
		
		int [][]dp = new int[n+1][k+1]; // 물건의 갯수 / 물건의 무게 / 배열에 입력되는건 물건의 가치
		
		

		for(int i = 1 ; i <= n ; i ++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			
		}
		
	
		// i는 물건의 개수 , j는 버틸수 있는 물건의 무게 까지
		for(int i = 1; i<=n;i++) { 
			for(int j =1;j<=k;j++) {
				
				// 2차원 배열에서 물건의 무게일때 해당 가치를 입력해준다.
				dp[i][j] = dp[i-1][j];
				
				// 무게가 기존의 i번째 물건의 무게를 빼고도 남았을 경우
				
				if(j - w[i]>=0) {
					// 바로 위의 무게와 해당 무게 후 남은 무게의 가치인 v[i]와 
					// 이전의 행에서 그 무게의 값만큼 빼주면 나오는 값(해당 인덱스에서 나오는 값)을 더해준다. 그중에서 큰 값을 출력
					// max값으로 계속 호출을 하기에 위에값이 그대로 내려오는 경우도 있다.
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);

				}
			}
		}
		
		System.out.println(dp[n][k]);
		
		
		// 이전의 풀이 코드
//			for(int i = 0 ;i < n ; i ++) {
//			for(int j = i+1;j<n;j++) {
//				if(bag[i].getW()+bag[j].getW()<=g) {
//					dp[i]= bag[i].getV()+bag[j].getV();
//					if(dp[i]!=0) {
//						dp[i]= Math.max(dp[i], bag[i].getV()+bag[j].getV());
//					}
//				
//			}
//		}
//		}
		
		
//		int max = 0;
//		for(int x =0; x< n;x++ ) {
//			if(dp[x]>max) {
//				max =  dp[x];
//			}
//		}
//		System.out.println(max);
//		
//		
		
	}

}

