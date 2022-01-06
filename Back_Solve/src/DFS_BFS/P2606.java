package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 하나의 노드와 연결된 전체 노드를 탐방
 */


public class P2606 {
	// 필요한 배열들을 미리 선언
	static int [][] arr;
	static boolean check[];
	
	// 너비 우선 탐색 
	static void BFS(int num) {
		
		// BFS는 너비를 우선으로 살펴보므로 깊게 파고드는 형식이 아니기에 queue를 사용
		Queue<Integer> queue = new LinkedList<>();
		
		// 진행을 위해 처음 들어가는 번호는 true로 변경
		check[num] = true;
		queue.add(num);
		/*
		 * add / offer - remove / poll - element / peek 의 차이
		 * 자바 api에서 FIFO를 처리하기 위해서는 Queue를 사용할 수 있다.
		 * 이때 Queue에는 비슷한 기능을 하는 메소드들이 존재하는데 이것이 위에 적은 메소드들이다.
		 * 이 메소드들의 차이는 기능적인 차이보단 문제가 생기는 상황에서 예외값, 경고문을 던지는가? 
		 * 혹은 null / false 값을 변환하는 것이다.
		 */
		int count = 0 ; // 컴퓨터 수 체크
		
		while(!queue.isEmpty()) {
			// poll로 큐 제일 앞에 있던 숫자를 빼냄
			int x = queue.poll();
			
			// i는 1부터 배열의 크기까지 순환
			for(int i = 1 ; i < arr.length;i++) {
				if(arr[x][i] ==1 && check[i]!=true){
					queue.add(i);
					check[i]=true;
					count ++;
				}
			}
		}
		System.out.println(count);
		
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		//배열의 크기
		int init = sc.nextInt();
		//간선의 갯수
		int num = sc.nextInt();
		arr = new int [init+1][init+1];
		check = new boolean [init +1];
		
		for(int i = 1 ; i <= num ; i++) {
			int x = sc.nextInt();
			int y  = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		BFS(1);
		
	}
}
