package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;


public class P12865 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ������ ����
		int k = sc.nextInt(); // ������ ��ƿ�� �ִ� ����
		
		// �� �迭�� ��� �ε����� ���ϰ� �ϱ����� 1�� ����
		int [] w = new int [n+1]; // ���� �迭
		int [] v = new int [n+1]; // ��ġ �迭
		
		int [][]dp = new int[n+1][k+1]; // ������ ���� / ������ ���� / �迭�� �ԷµǴ°� ������ ��ġ
		
		

		for(int i = 1 ; i <= n ; i ++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			
		}
		
	
		// i�� ������ ���� , j�� ��ƿ�� �ִ� ������ ���� ����
		for(int i = 1; i<=n;i++) { 
			for(int j =1;j<=k;j++) {
				
				// 2���� �迭���� ������ �����϶� �ش� ��ġ�� �Է����ش�.
				dp[i][j] = dp[i-1][j];
				
				// ���԰� ������ i��° ������ ���Ը� ���� ������ ���
				
				if(j - w[i]>=0) {
					// �ٷ� ���� ���Կ� �ش� ���� �� ���� ������ ��ġ�� v[i]�� 
					// ������ �࿡�� �� ������ ����ŭ ���ָ� ������ ��(�ش� �ε������� ������ ��)�� �����ش�. ���߿��� ū ���� ���
					// max������ ��� ȣ���� �ϱ⿡ �������� �״�� �������� ��쵵 �ִ�.
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);

				}
			}
		}
		
		System.out.println(dp[n][k]);
		
		
		// ������ Ǯ�� �ڵ�
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

