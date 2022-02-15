package DFS_BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P2667 {
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	static int n;

	static int[][] arr; // 아파트
	static boolean[][] check; // 순회를 했는지 유무

	static int count; // 아파트의 점수
	static int sco = 0; // 단지의 갯수

	static ArrayList<Integer> score = new ArrayList<>();

	static void DFS(int x, int y) {
		check[x][y] = true;
		if (arr[x][y] == 1) {
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
					if (arr[nx][ny] == 1 && check[nx][ny] != true) {
						DFS(nx, ny);
						count++;
						
					}
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n][n];
		check = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String[] s = sc.next().split("");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(s[j]);
				check[i][j] = false;
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!check[i][j] && arr[i][j] == 1) {
					count = 1;
					DFS(i, j); // count의 갯수는 안에서 ++
					list.add(count);
				}	
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int  i =0;i< list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
