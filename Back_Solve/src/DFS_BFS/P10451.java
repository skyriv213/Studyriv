package DFS_BFS;

import java.util.Scanner;

/*
java �ݺ��� while�� ����ϸ鼭 ���� �����ϴ� -->
while(variable --> 0) 
	= variable-- �� variable>0�� ���ĳ����� 
	�� 0���� ���ǰ��� ������ ���� Ŭ�������� ���� �ǹ�
*/

public class P10451 {
	static boolean[] check;
	static int[] arr;
	static int count;

	static void DFS(int num) {
		check[num] = true;

		int next = arr[num];

		if (!check[next]) {
			DFS(arr[num]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			arr = new int[n + 1];
			check = new boolean[n + 1];

			for (int j = 1; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			count = 0;
			for (int j = 1; j <
					arr.length; j++) {
				if (!check[j]) {
					DFS(j);
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
