package DFS_BFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class P2178 {

	static int[] dx = { 1, -1, 0, 0 }; // x방향 배열
	static int[] dy = { 0, 0, 1, -1 }; // y방향 배열
	static int[][] arr;
	static boolean[][] check;
	
	static int n,m;

	static void find(int x,int y) {
		
		
		// int형 배열을 입력 받는 queue를 선언
		Queue <int []> q = new LinkedList<>();
		q.add(new int [] {x,y});
		
		while(!q.isEmpty()) {
			int [] tr= q.poll();
			int nx = tr[0];
			int ny = tr[1];
			
			for(int i  =0 ; i < 4;i++) {
				int tx = nx +dx[i];
				int ty = ny +dy[i];
				
				if(tx <0 ||ty <0|| tx>=n ||ty>=m) {
					continue;
				}
				if(check[tx][ty]|| arr[tx][ty]==0) {
					continue;
				}
				q.add(new int[] {tx,ty});
				arr[tx][ty] = arr[nx][ny]+1;;
				check[tx][ty] = true;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);

		arr = new int[n][m];

		// 배열 선언 및 배열 값 입력
		for (int i = 0; i < n; i++) {
			String[] s1 = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(s1[j]);
			}
		}

		check = new boolean[n][m];
		check[0][0] = false;
		find(0, 0);
		System.out.println(arr[n-1][m-1]);
	}

}
