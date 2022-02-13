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
		// 노드, 간선, 시작 노드의 번호 입력
		String[] s = br.readLine().split(" ");
		int start = Integer.parseInt(br.readLine());

		// 그래프 노드를 생성
		for (int i = 0; i < Integer.parseInt(s[0]) + 1; i++) {
			graph.add(new ArrayList<Node>());
		}

		// 최단거리 표시 테이블
		ans = new int[Integer.parseInt(s[0]) + 1];
		// 배열 초기화
		Arrays.fill(ans, inf);
		// 입력값에 따라 그래프 초기화
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
		// 처음 자기 자신을 넣을 때 자기 자신의 값은 0이므로 0값을 넣어준다.
		pq.offer(new Node(index, 0));

		
		while (!pq.isEmpty()) {
			// Queue에서 노드 꺼내기
			Node node = pq.poll();
			// 노드의 성분으로 각각의 변수 선언해주기
			int ni = node.index;
			int dis = node.distance;
			// 불러온 값이 ans보다 클 경우 바로 다음 부분으로 넘어간다
			if (dis > ans[ni]) {
				continue;
			}
			// 반복문 실행으로 각 그래프의 노드를 탐색
			for (Node n : graph.get(ni)) {
				// 만약에 거리와 노드의 거리를 더했을때 결과값 배열의 값보다 작을 경우 그 값을 대체한다.
				if (dis + n.distance < ans[n.index]) {
					ans[n.index] = dis + n.distance;
					// 그리고 해당 값의 노드를 Queue에 넣어준다. 넣어줄때 해당값의 거리 가중치는 ans값을 넣어준다
					pq.offer(new Node(n.index, ans[n.index]));
				}
			}
		}
	}

}

// 클래스를 선언해서 node 객체를 만들어준다.
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