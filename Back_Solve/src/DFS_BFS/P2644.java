package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2644 {

	static int[] count;
	static int[][] arr;
	static boolean[] check;
	static int a, b, n;

	static void BFS(int a, int c) {
		Queue<Integer> q = new LinkedList<>();

		q.add(a);
		check[a] = true;
		
		while (!q.isEmpty()) {
			int x = q.poll();
			if (x == c) {
				break;
			}
			for (int i = 1; i <= n; i++) {
				if (arr[x][i] == 1 && !check[i]) {
					q.add(i);
					check[i] = true;
					count[i] = count[x]+1;
				}

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 사람의 수
		a = sc.nextInt();
		b = sc.nextInt(); // 구하고자 하는 사람의 관계
		int m = sc.nextInt(); // 간선의 수

		arr = new int[n + 1][n + 1];
		check = new boolean[n + 1];
		count = new int[n + 1];
		
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		BFS(a, b);
		if (count[b] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(count[b]);
		}

	}

}
