package DFS_BFS;

import java.util.Scanner;

public class P2667 {
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	static int[][] arr;
	
	static int count = 0 ;
	
	static void main
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		arr = new int[n + 1][n + 1];
		for(int i = 1; i <=n;i++) {
			for(int j = 1 ;j <=n;j++) {
				arr[i][j]=1;
			}
		}
		DFS();
		
	}

}
