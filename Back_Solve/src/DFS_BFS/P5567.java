package DFS_BFS;

import java.util.Scanner;
import java.util.Stack;

public class P5567 {
	
	static int [][] graph;
	static boolean [] check;
	static int count ; // ��ȥ�Ŀ� �ʴ��ϴ� ������ ��
	
	
	// DFS�� ����
	static void DFS(int num,int depth) {
		// depth�� 2�� �������� ����
		if(depth ==2) {
			return;
		}
		// 1���� �׷����� ũ����� �ݺ��� ����
		for(int i = 1 ; i < graph.length;i++) {
				// �׷��� �󿡼� ���� ������ �Ǿ� 1�� üũ�� �Ǿ������� if�� ����
				if(graph[num][i]==1) {
					// �ش� ������ boolean �迭�� ture�� ���� �� DFS�� depth�� 1 ������ ���
					check[i]= true;
					DFS(i,depth+1);

				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(); // ������ ��
		int m =sc.nextInt(); // ����Ʈ�� ����
		
		graph = new int [n+1][n+1];
		
		// BFS or DFS�� �����ϸ鼭 ȸ���� ���� boolean �迭�� ũ�� �����ֱ� 
		check = new boolean [n+1];
				
		for(int i = 1 ; i <=m ;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			graph [x][y] = 1;
			graph [y][x] = 1;
			
		}
		count  =0;
		DFS(1,0); // ������� �й��� 1�̱⿡ 1���� ����
		for(int i = 2 ; i <=n;i++) {
			if(check[i]==true) {
				count++;
			}
		}
		// ������ ���� ��� true�� ������ �Ǵ� 1�� �ƴ� 2���� ī����
		System.out.println(count);
	}
		
	}


