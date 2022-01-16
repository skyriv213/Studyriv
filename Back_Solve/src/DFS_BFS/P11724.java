package DFS_BFS;

import java.util.Scanner;

public class P11724 {
	
	static int [][] graph;
	static boolean [] check;
	
	
	// DFS 메소드
	static void DFS(int num) {
		// check[num]이 true일시 그냥 종료 및 반환
		if(check[num]) {
			return;
		}
		
		// true로 값 지정 및 반복문 선언
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
		int n = sc.nextInt(); // 정점의 갯수
		int m = sc.nextInt(); // 간선의 갯수
	
		// 정점의 인덱스를 편하게 하기 위해 1을 더해서 계산
		graph = new int [n+1][n+1];
		check = new boolean [n+1];
		
		// 인접행렬 그래프 입력 부분
		for(int i = 1 ; i <=m;i++ ) {
			int x =sc.nextInt();
			int y =sc.nextInt();
			graph[x][y]=1;
			graph[y][x]=1;
		}
		
		// 요소의 갯수 체크 변수 및 for 반복문 선언
		int count  =0 ;
		for(int i = 1; i <=n;i++) {
			// i가 진행이 되면서 연결된 부분은 check 배열에서 이미 true로 걸러진다. 
			// 그러므로 check[]에서 true가 아닌 부분의 경우 연결된 요소가 없는 새롭게 모여있는 부분이란 의미이다.
			// 이런 부분에서 DFS를 재실행 및 count를 하나씩 증가시킨다.
			if(check[i]!=true) {
			DFS(i);
			count++;
			}
		}
		// 갯수인 count를 출력
		System.out.println(count);
	}

}
