package DFS_BFS;
import java.util.Scanner;

public class P11403 {
	
	
	// 요점
	// i에서 j로 갈수 있는가?
	// i에서 k로, k에서 j로 갈 수 있는가?
	
	static int [][] arr, map;
	
	static void Floyd() {
		
		// 중간단계인 k가 먼저 밖에서 돌아야 한다.
		// 중간단계가 먼저 밖에서 순회를 하고 , 그에 맞춰서 출발지와 목적지가 돌아야한다.
		// 만약 중간단계인 k가 출발지와 목적지 사이에서 돌게 되면 출발지에서 출발지로 돌아오는 경우의수가 제외되는 경우가 존재한다.
		
		for(int  k =1 ; k < arr.length;k++) {
			for(int i =1; i< arr.length;i++) {
				for(int j =1; j<arr.length;j++ ) {
					if(arr[i][k]==1 && arr[k][j]==1) {
						arr[i][j]=1;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		map = arr = new int [n+1][n+1];
		
		for(int i = 1; i< arr.length;i++) {
			for(int j = 1 ; j < arr.length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Floyd();
		
		for(int i = 1; i< arr.length;i++) {
			for(int j = 1 ; j < arr.length;j++) {
			System.out.print(	arr[i][j] + " " );
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
