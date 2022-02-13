package Shortest_Path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1916 {
	static int n, m, a, b; // ������ ���� , ������ ����, ��� ���ù�ȣ, ���� ���ù�ȣ

	static ArrayList<ArrayList<Node11>> graph = new ArrayList<>();
	static int [] ans;
	static boolean []check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); //����
		m = sc.nextInt(); // ����
		// ����(���)�� ���� �׷��� ����
		for(int i = 0 ; i<=n;i++) {
			graph.add(new ArrayList<Node11>());
			
		}
		// ���̸� ǥ���� �迭�� integer max value ����
		ans = new int[n+1];
		check = new boolean[n+1];
		Arrays.fill(ans, Integer.MAX_VALUE);
		
		// ���������� ���� �׷����� �뼱 �߰�
		for(int i = 0 ;i < m;i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int w = sc.nextInt();
			graph.get(s).add(new Node11(e,w));
		}
		// ��� ���ù�ȣ �� ���� ���ù�ȣ
		a = sc.nextInt();
		b = sc.nextInt();
		Dijkstra(a);
		System.out.println(ans[b]);

	}
	
	static void Dijkstra(int start) {
		// �켱���� ť ����
		PriorityQueue<Node11> q = new PriorityQueue<>();
		
		ans[start] = 0 ;
		
		// ���ο� ��带 �����ϸ鼭 ť�� �־��ֱ�
		q.offer(new Node11(start,0));
		
		while(!q.isEmpty()) {
			
			Node11 Node11 = q.poll();
			int Node11I = Node11.index;
			int Node11W = Node11.weight;
			if(Node11I == b) {
				break;
			}
			
			// ����� ����ġ�� ���� ���� ����ϴ� �迭�� �ε��� ������ ũ�ٸ� �׳� �����ϰ� ��������.
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