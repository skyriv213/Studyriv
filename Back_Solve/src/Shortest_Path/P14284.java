package Shortest_Path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P14284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 배열 선언
		ArrayList<ArrayList<Node2>> g = new ArrayList<>();
		int[] res = new int[n += 1];
		Arrays.fill(res, Integer.MAX_VALUE);
		boolean[] check = new boolean[n + 1];
		
		for(int i =0 ; i<=n;i++) {
			g.add(new ArrayList<>());
		}
		
		// 그래프 생성
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int w = sc.nextInt();
			g.get(s).add(new Node2(e,w));
			g.get(e).add(new Node2(s,w));
		}
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		PriorityQueue<Node2> q = new PriorityQueue<>();
		res[start]= 0 ;
		q.offer(new Node2(start,0));
		while(!q.isEmpty()) {
			Node2 n2 = q.poll();
			int Index = n2.index;
			int Weight = n2.weight;
			if(Index == end) {
				break;
			}
			if(!check[Index]) {
				check[Index]=true;
			}
			for(Node2 n1 : g.get(Index)) {
				if(!check[n1.index]&& Weight+n1.weight<res[n1.index]) {
					res[n1.index] = Weight+n1.weight;
					q.offer(new Node2(n1.index, res[n1.index]));
				}
			}
		}
		System.out.println(res[end]);

	}

}

class Node2 implements Comparable<Node2> {

	int index;
	int weight;

	public Node2(int index, int weight) {
		this.index = index;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node2 o) {
		// TODO Auto-generated method stub
		return this.weight - o.weight;
	}
}
