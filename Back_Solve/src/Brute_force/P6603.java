package Brute_force;

import java.util.Scanner;

public class P6603 {
	static int[] arr; // �� ���ڸ� �־��ִ� �迭
	static boolean[] check;

	static void DFS(int sta, int dep) {
		if (dep == 6) {
			for (int i = 0; i < arr.length; i++) {
				if (check[i]) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();

		}
		// check �� ������ ���Ŀ� �ٽ� ������ �Ǿ� ȣ��ɼ� �ֵ��� ������Ѵ�.
		for (int i = sta; i < arr.length; i++) {
			check[i] = true;
			// ���۰��� i������ �޾��༭ ���Ҽ� �ְ� ����
			DFS(i + 1, dep + 1);
			check[i] = false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			if (x == 0) {
				break;
			}
			arr = new int[x];
			check = new boolean[x];
			// ������ �迭�� ���ڸ� �Է�
			for (int i = 0; i < x; i++) {
				arr[i]= sc.nextInt();
			}
			
			DFS(0, 0);
			System.out.println();

		}
	}

}
