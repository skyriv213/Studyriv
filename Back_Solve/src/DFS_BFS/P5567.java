package DFS_BFS;

import java.util.Arrays;
import java.util.Scanner;

public class P5567 {
	
	static boolean check(int [][]arr
		return false;) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(); // 동기의 수
		int m =sc.nextInt(); // 리스트의 길이
		
		int [][] graph = new int [n+1][n+1];
		
		for(int i = 1; i <=n;i++) {
			Arrays.fill(graph[i],0);
		}
		
		boolean [] tf = new boolean [n+1];
	
		
		for(int i = 1 ; i <=m ;i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			graph [x][y] = 1;
			graph [y][x] = 1;
			
		}
		for(int i = 1 ; i < graph.length;i++) {
			for(int  j = 1 ; j <graph[i].length;j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
		
	}


