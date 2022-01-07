package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P1260 {
	static int [][] arr;
	static boolean check1 [];
	static boolean check2 [];
	
	static void BFS(int num) {
		Queue <Integer> q = new LinkedList<>();
		
		check1[num] =true;
		q.add(num);
		while(!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x + " ");

			for(int  i = 1; i < arr.length;i++) {
				if(arr[x][i]==1&&check1[i]!=true) {
					q.add(i);
					check1[i]=true;
				}
			}
		}
	}
	
	static void DFS(int num) {
		Stack <Integer> s = new Stack<>();
		s.push(num);
		check2[num] = true;
		System.out.print(num+ " ");
		
		while(!s.isEmpty()) {
			for(int i = 1 ;i <arr.length;i++) {
				if(arr[num][i]==1 && check2[i] !=true) {
					s.push(i);
					check2[i]=true;
					DFS(i);
				}
			}
			s.pop();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ���(����)�� ����
		int m = sc.nextInt(); // ������ ����
		int V = sc.nextInt(); // Ž���� ������ ����� ��ȣ
		
		arr = new int [N+1][N+1];
		check1 = new boolean [N+1];
		check2 = new boolean [N+1];
		
		// ���� �迭
		for(int i = 1 ; i <= m;i++) {
			int x =  sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		DFS(V);
		System.out.println();
		BFS(V);
		
	}

}
