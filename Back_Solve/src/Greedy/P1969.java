package Greedy;

import java.util.Scanner;

public class P1969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[][] arr = new String[n][m];

		String[] sarr = { "A", "C", "G", "T" }; // 사전순으로 배열 입력
		int num = 0; // 유전적거리

		StringBuilder sb = new StringBuilder(); // DNA 성분 추가를 위한 String 객체 선언

		// 주어진 문자열을 배열 안으로 입력
		for (int i = 0; i < n; i++) {
			String[] s = sc.next().split("");
			for (int j = 0; j < m; j++) {
				arr[i][j] = s[j];
			}
		}
		// 문자열 순환, 다만 좌에서 우의 순환이 아닌 위에서 아래로 가는 순환
		for (int j = 0; j < m; j++) {
			// 카운팅할 배열을 선언
			int[] count = new int[4];
			// 카운팅을 진행을 하면서 해당 문자가 나올경우 각 배열에 숫자 증가
			for (int i = 0; i < n; i++) {

				if (arr[i][j].equals("A")) {
					count[0]++;
				} else if (arr[i][j].equals("C")) {
					count[1]++;
				} else if (arr[i][j].equals("G")) {
					count[2]++;
				} else if (arr[i][j].equals("T")) {
					count[3]++;
				}
			}
			// max값 및 maIndex를 알기위한 변수 선언
			// 따로 사전순으로 배열하는 코드를 작성하는 것이 아닌 max값 조정 및 sarr 배열의 조정으로 카운팅 되게 선언
			int max = 0;
			int maxIndex = 0;
			for (int i = 0; i < count.length; i++) {
				if (max < count[i]) {
					max = count[i];
					maxIndex = i;
				}
			}

			// equals 메소드를 이용/ 만약 가장 많았던 문자와 값이 틀릴경우 num 증가
			for (int i = 0; i < n; i++) {
				if (!arr[i][j].equals(sarr[maxIndex])) {
					num++;
				}
			}
			// 해당 객체에 해당라인의 maxIndex의 값을 추가
			sb.append(sarr[maxIndex]);

		}
		// 출격
		System.out.println(sb);
		System.out.println(num);

	}
}
