package Etc;

import java.util.Scanner;

public class P2740 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] arr1 = new int [n][m];
		int [][] arr2  = new int [n][m];
		int [][] arr3 = new int [n][m];
		
		for(int i = 0;i<n;i++) {
			for(int j = 0 ; j<m;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0 ; j<m;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		int c = 0;
		int j ;
		for(int i = 0;i<n;i++) {
			for(j = 0 ; j<m;j++) {
				c=arr1[i][j]*arr2[i][j];
			}
			arr3[i][j] = c;
		}
		for(int i = 0;i<n;i++) {
			for(j = 0 ; j<m;j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
