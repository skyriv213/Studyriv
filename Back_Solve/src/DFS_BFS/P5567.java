package DFS_BFS;

import java.util.Scanner;
import java.util.Stack;

public class P5567 {
	
	static int [][] graph;
	static boolean [] check;
	static int count ; // 결혼식에 초대하는 동기의 수
	
	
	// DFS로 접근
	static void DFS(int num,int depth) {
		// depth가 2와 같아지면 종료
		if(depth ==2) {
			return;
		}
		// 1부터 그래프의 크기까지 반복문 실행
		for(int i = 1 ; i < graph.length;i++) {
				// 그래프 상에서 서로 연관이 되어 1이 체크가 되어있으면 if문 실행
				if(graph[num][i]==1) {
					// 해당 숫자의 boolean 배열을 ture로 변경 후 DFS의 depth를 1 더한후 재귀
					check[i]= true;
					DFS(i,depth+1);

				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(); // 동기의 수
		int m =sc.nextInt(); // 리스트의 길이
		
		graph = new int [n+1][n+1];
		
		// BFS or DFS를 진행하면서 회전을 넣을 boolean 배열의 크기 정해주기 
		check = new boolean [n+1];
				
		for(int i = 1 ; i <=m ;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			graph [x][y] = 1;
			graph [y][x] = 1;
			
		}
		count  =0;
		DFS(1,0); // 상근이의 학번이 1이기에 1부터 시작
		for(int i = 2 ; i <=n;i++) {
			if(check[i]==true) {
				count++;
			}
		}
		// 본인의 값일 경우 true가 포함이 되니 1이 아닌 2부터 카운팅
		System.out.println(count);
	}
		
	}


