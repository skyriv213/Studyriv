package Brute_force;

import java.util.Scanner;

public class P6603 {
	static int[] arr; // 고를 숫자를 넣어주는 배열
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
		// check 값 조절로 추후에 다시 재사용이 되어 호출될수 있도록 해줘야한다.
		for (int i = sta; i < arr.length; i++) {
			check[i] = true;
			// 시작값을 i값으로 받아줘서 변할수 있게 해줌
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
			// 정해진 배열에 숫자를 입력
			for (int i = 0; i < x; i++) {
				arr[i]= sc.nextInt();
			}
			
			DFS(0, 0);
			System.out.println();

		}
	}

}
