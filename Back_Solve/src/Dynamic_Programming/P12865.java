package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;


public class P12865 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 물건의 갯수
		int g = sc.nextInt(); // 물건의 버틸수 있는 무게

		int [] w = new int [n+1]; // 무게 배열
		int [] v = new int [n+1]; // 가치 배열
		
		int [][]dp = new int[n+1][g+1];
		
		
		for(int i = 1 ; i < n ; i ++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			
		}
		
		for(int i = 1; i<=n;i++) {
			for(int j =1;j<=g;j++) {
				dp[i][j] = dp[i-1][j];
				if(j - w[i]>=0) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
				}
			}
		}
		
		System.out.println(dp[n][g]);
		
		
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

