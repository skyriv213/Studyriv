package Shortest_Path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class P1753 {
	static final int inf = Integer.MAX_VALUE;

	static ArrayList<ArrayList<Node>> graph = new ArrayList<>();

	static int[] ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// ���, ����, ���� ����� ��ȣ �Է�
		String[] s = br.readLine().split(" ");
		int start = Integer.parseInt(br.readLine());

		// �׷��� ��带 ����
		for (int i = 0; i < Integer.parseInt(s[0]) + 1; i++) {
			graph.add(new ArrayList<Node>());
		}

		// �ִܰŸ� ǥ�� ���̺�
		ans = new int[Integer.parseInt(s[0]) + 1];
		// �迭 �ʱ�ȭ
		Arrays.fill(ans, inf);
		// �Է°��� ���� �׷��� �ʱ�ȭ
		for (int i = 0; i < Integer.parseInt(s[1]); i++) {
			String[] t = br.readLine().split(" ");
			graph.get(Integer.parseInt(t[0])).add(new Node(Integer.parseInt(t[1]), Integer.parseInt(t[2])));
		}
		dijkstra(start);

		for (int i = 1; i < ans.length; i++) {
			if (ans[i] == inf) {
				bw.write("INF");
				bw.newLine();
			} else {
				bw.write(String.valueOf(ans[i]));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();

	}

	static void dijkstra(int index) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		ans[index] = 0;
		// ó�� �ڱ� �ڽ��� ���� �� �ڱ� �ڽ��� ���� 0�̹Ƿ� 0���� �־��ش�.
		pq.offer(new Node(index, 0));

		
		while (!pq.isEmpty()) {
			// Queue���� ��� ������
			Node node = pq.poll();
			// ����� �������� ������ ���� �������ֱ�
			int ni = node.index;
			int dis = node.distance;
			// �ҷ��� ���� ans���� Ŭ ��� �ٷ� ���� �κ����� �Ѿ��
			if (dis > ans[ni]) {
				continue;
			}
			// �ݺ��� �������� �� �׷����� ��带 Ž��
			for (Node n : graph.get(ni)) {
				// ���࿡ �Ÿ��� ����� �Ÿ��� �������� ����� �迭�� ������ ���� ��� �� ���� ��ü�Ѵ�.
				if (dis + n.distance < ans[n.index]) {
					ans[n.index] = dis + n.distance;
					// �׸��� �ش� ���� ��带 Queue�� �־��ش�. �־��ٶ� �ش簪�� �Ÿ� ����ġ�� ans���� �־��ش�
					pq.offer(new Node(n.index, ans[n.index]));
				}
			}
		}
	}

}

// Ŭ������ �����ؼ� node ��ü�� ������ش�.
class Node implements Comparable<Node> {
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.distance, o.distance);
	}

	int index, distance;

	Node(int index, int distance) {
		this.distance = distance;
		this.index = index;
	}

}