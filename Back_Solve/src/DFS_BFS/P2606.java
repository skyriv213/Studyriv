package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * �ϳ��� ���� ����� ��ü ��带 Ž��
 */


public class P2606 {
	// �ʿ��� �迭���� �̸� ����
	static int [][] arr;
	static boolean check[];
	
	// �ʺ� �켱 Ž�� 
	static void BFS(int num) {
		
		// BFS�� �ʺ� �켱���� ���캸�Ƿ� ��� �İ��� ������ �ƴϱ⿡ queue�� ���
		Queue<Integer> queue = new LinkedList<>();
		
		// ������ ���� ó�� ���� ��ȣ�� true�� ����
		check[num] = true;
		queue.add(num);
		/*
		 * add / offer - remove / poll - element / peek �� ����
		 * �ڹ� api���� FIFO�� ó���ϱ� ���ؼ��� Queue�� ����� �� �ִ�.
		 * �̶� Queue���� ����� ����� �ϴ� �޼ҵ���� �����ϴµ� �̰��� ���� ���� �޼ҵ���̴�.
		 * �� �޼ҵ���� ���̴� ������� ���̺��� ������ ����� ��Ȳ���� ���ܰ�, ����� �����°�? 
		 * Ȥ�� null / false ���� ��ȯ�ϴ� ���̴�.
		 */
		int count = 0 ; // ��ǻ�� �� üũ
		
		while(!queue.isEmpty()) {
			// poll�� ť ���� �տ� �ִ� ���ڸ� ����
			int x = queue.poll();
			
			// i�� 1���� �迭�� ũ����� ��ȯ
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
		//�迭�� ũ��
		int init = sc.nextInt();
		//������ ����
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
