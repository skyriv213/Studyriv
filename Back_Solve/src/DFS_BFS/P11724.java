package DFS_BFS;

import java.util.Scanner;

public class P11724 {
	
	static int [][] graph;
	static boolean [] check;
	
	
	// DFS �޼ҵ�
	static void DFS(int num) {
		// check[num]�� true�Ͻ� �׳� ���� �� ��ȯ
		if(check[num]) {
			return;
		}
		
		// true�� �� ���� �� �ݺ��� ����
		check[num]=true;
		for(int i = 1;i<graph.length;i++) {
			if(graph[num][i]==1) {
				DFS(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ������ ����
		int m = sc.nextInt(); // ������ ����
	
		// ������ �ε����� ���ϰ� �ϱ� ���� 1�� ���ؼ� ���
		graph = new int [n+1][n+1];
		check = new boolean [n+1];
		
		// ������� �׷��� �Է� �κ�
		for(int i = 1 ; i <=m;i++ ) {
			int x =sc.nextInt();
			int y =sc.nextInt();
			graph[x][y]=1;
			graph[y][x]=1;
		}
		
		// ����� ���� üũ ���� �� for �ݺ��� ����
		int count  =0 ;
		for(int i = 1; i <=n;i++) {
			// i�� ������ �Ǹ鼭 ����� �κ��� check �迭���� �̹� true�� �ɷ�����. 
			// �׷��Ƿ� check[]���� true�� �ƴ� �κ��� ��� ����� ��Ұ� ���� ���Ӱ� ���ִ� �κ��̶� �ǹ��̴�.
			// �̷� �κп��� DFS�� ����� �� count�� �ϳ��� ������Ų��.
			if(check[i]!=true) {
			DFS(i);
			count++;
			}
		}
		// ������ count�� ���
		System.out.println(count);
	}

}
