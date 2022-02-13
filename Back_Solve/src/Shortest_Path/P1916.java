package Shortest_Path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1916 {
	static int n, m, a, b; // 도시의 갯수 , 버스의 갯수, 출발 도시번호, 도착 도시번호

	static ArrayList<ArrayList<Node11>> graph = new ArrayList<>();
	static int [] ans;
	static boolean []check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); //도시
		m = sc.nextInt(); // 버스
		// 도시(노드)에 따라 그래프 생성
		for(int i = 0 ; i<=n;i++) {
			graph.add(new ArrayList<Node11>());
			
		}
		// 길이를 표시할 배열에 integer max value 선언
		ans = new int[n+1];
		check = new boolean[n+1];
		Arrays.fill(ans, Integer.MAX_VALUE);
		
		// 차량개수에 따라 그래프에 노선 추가
		for(int i = 0 ;i < m;i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int w = sc.nextInt();
			graph.get(s).add(new Node11(e,w));
		}
		// 출발 도시번호 및 도착 도시번호
		a = sc.nextInt();
		b = sc.nextInt();
		Dijkstra(a);
		System.out.println(ans[b]);

	}
	
	static void Dijkstra(int start) {
		// 우선순위 큐 선언
		PriorityQueue<Node11> q = new PriorityQueue<>();
		
		ans[start] = 0 ;
		
		// 새로운 노드를 선언하면서 큐에 넣어주기
		q.offer(new Node11(start,0));
		
		while(!q.isEmpty()) {
			
			Node11 Node11 = q.poll();
			int Node11I = Node11.index;
			int Node11W = Node11.weight;
			if(Node11I == b) {
				break;
			}
			
			// 노드의 가중치가 현재 답을 기록하는 배열의 인덱스 값보다 크다면 그냥 무시하고 지나간다.
			if(!check[Node11I]) {
				check[Node11I]=true;
			}
			for(Node11 n: graph.get(Node11I)) {
				if(!check[n.index]&&Node11W + n.weight < ans[n.index]) {
					ans[n.index] = Node11W +n.weight;
					q.offer(new Node11(n.index,ans[n.index]));
				}
			}
		}
		
		
	}

}

class Node11 implements Comparable<Node11>{
	

	int index;
	int weight;

	public Node11(int index, int weight) {
		this.index = index;
		this.weight = weight;
	}
	@Override
	public int compareTo(Node11 o) {
		// TODO Auto-generated method stub
		return this.weight -o.weight;
	}
}