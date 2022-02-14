package Shortest_Path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P5972 {
	static int n, m;
	static ArrayList<ArrayList<Node3>> g = new ArrayList<>();
	static int[] res;
	static boolean[] check;

	static void Dijkstra(int start) {
		PriorityQueue<Node3> q = new PriorityQueue<>();
		res[start] = 0;
		q.offer(new Node3(start, 0));
		while (!q.isEmpty()) {
			Node3 node = q.poll();
			int nodeIndex = node.index;
			int nodeWeight = node.weight;
			if (nodeIndex == n) {
				break;
			}
			if (!check[nodeIndex]) {
				check[nodeIndex] = true;
			}
			for(Node3 n1 : g.get(nodeIndex)) {
				if(!check[n1.index]&&nodeWeight+n1.weight<res[n1.index]) {
					res[n1.index] = nodeWeight+n1.weight;
					q.offer(new Node3(n1.index,res[n1.index]));
				}
			}
		}
		System.out.println(res[n]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 헛간의 갯수, 구하고자 하는 노드의 위치
		m = sc.nextInt(); // 간선의 갯수
		for (int i = 0; i <= n; i++) {
			g.add(new ArrayList<>());
		}
		res = new int[n + 1];
		Arrays.fill(res, Integer.MAX_VALUE);
		check = new boolean[n + 1];
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int w = sc.nextInt();
			g.get(s).add(new Node3(e, w));
			g.get(e).add(new Node3(s, w));
		}
		Dijkstra(1);
	}

}

class Node3 implements Comparable<Node3> {
	int index;
	int weight;

	Node3(int index, int weight) {
		this.index = index;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node3 o) {
		// TODO Auto-generated method stub
		return this.weight - o.weight;
	}
}
