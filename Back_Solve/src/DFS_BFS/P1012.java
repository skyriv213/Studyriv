package DFS_BFS;

import java.util.Scanner;

public class P1012 {
	static int m, n, k, count;
	static int[][] arr;
	static boolean[][] check;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void dfs(int x, int y) {
		check[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
				if (!check[nx][ny] && arr[nx][ny] == 1) {
					dfs(nx, ny);
				}
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int p = 0; p < t; p++) {
			count = 0;
			m = sc.nextInt();
			n = sc.nextInt();
			k = sc.nextInt();
			arr = new int[m+1][n+1];
			check = new boolean[m+1][n+1];

			for (int i = 0; i <k; i++) {
				
					int x = sc.nextInt();
					int y = sc.nextInt();
					arr[x][y] = 1;
				}
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] == 1 && check[i][j] != true) {
						dfs(i, j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}
