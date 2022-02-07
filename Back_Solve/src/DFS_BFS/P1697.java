package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1697 {
	static int[] arr = new int[100001];
	static int start, goal;

	static void BFS() {
		Queue<Integer> q = new LinkedList<>();

		q.add(start);
		arr[start] = 1;

		while (!q.isEmpty()) {
			
			int p = q.poll();
			
			for (int i = 0; i < 3; i++) {
				int next;
				
				if (i == 0) {
					next = p + 1;
				} 
				else if (i == 1) {
					next = p - 1;
				}
				else {
					next = 2 * p;
				}
				if (next == goal) {
					System.out.println(arr[p]);
					return;
				}
				if (next > 0 && next < arr.length && arr[next] == 0) {
					q.add(next);
					arr[next] = arr[p]+1;
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		start = sc.nextInt();
		goal = sc.nextInt();

		if (start == goal) {
			System.out.println(0);
		} else {
			BFS();
		}
	}

}
