package DFS_BFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class P1325 {
	
	static boolean[] check;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static int[] count;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// n = ��ǻ���� ��� , m�� ��ǻ���� ����, ��ǻ�Ͱ� ����Ǿ� �ִ� ��츦 �ǹ�
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		// �׷����� ��带 ����
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}

		// ���� ����
		for (int i = 0; i < m; i++) {
			String[] s1 = br.readLine().split(" ");
			int x = Integer.parseInt(s1[0]);
			int y = Integer.parseInt(s1[1]);
			
			graph.get(x).add(y);
		}
		
		count = new int[n + 1];

		// BFS ����
		for (int i = 1; i <= n; i++) {
			check = new boolean[n + 1];
			BFS(i);
		}

		// max �� ���ϱ�
		int max = 0;
		
		for (int i = 1; i <= n; i++) {
			max = Math.max(max, count[i]);
		}
		// max ���� ���Ͻ� ���
		for (int i = 1; i <=n;i++) {
			if (count[i]==max) {
				bw.write(i + " ");
			}
		}
		bw.flush();
		bw.close();

	}

	static void BFS(int num) {
		Queue<Integer> q = new LinkedList<>();

		q.add(num);

		check[num] = true;
	

		while (!q.isEmpty()) {
			int x = q.remove();
			for (int i : graph.get(x)) {
				if (!check[i]) {
					check[i] = true;
					q.add(i);
					count[i]++;

				}
			}
		}
	}

}
