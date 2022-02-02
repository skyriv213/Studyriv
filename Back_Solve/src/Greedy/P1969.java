package Greedy;

import java.util.Scanner;

public class P1969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[][] arr = new String[n][m];

		String[] sarr = { "A", "C", "G", "T" }; // ���������� �迭 �Է�
		int num = 0; // �������Ÿ�

		StringBuilder sb = new StringBuilder(); // DNA ���� �߰��� ���� String ��ü ����

		// �־��� ���ڿ��� �迭 ������ �Է�
		for (int i = 0; i < n; i++) {
			String[] s = sc.next().split("");
			for (int j = 0; j < m; j++) {
				arr[i][j] = s[j];
			}
		}
		// ���ڿ� ��ȯ, �ٸ� �¿��� ���� ��ȯ�� �ƴ� ������ �Ʒ��� ���� ��ȯ
		for (int j = 0; j < m; j++) {
			// ī������ �迭�� ����
			int[] count = new int[4];
			// ī������ ������ �ϸ鼭 �ش� ���ڰ� ���ð�� �� �迭�� ���� ����
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
			// max�� �� maIndex�� �˱����� ���� ����
			// ���� ���������� �迭�ϴ� �ڵ带 �ۼ��ϴ� ���� �ƴ� max�� ���� �� sarr �迭�� �������� ī���� �ǰ� ����
			int max = 0;
			int maxIndex = 0;
			for (int i = 0; i < count.length; i++) {
				if (max < count[i]) {
					max = count[i];
					maxIndex = i;
				}
			}

			// equals �޼ҵ带 �̿�/ ���� ���� ���Ҵ� ���ڿ� ���� Ʋ����� num ����
			for (int i = 0; i < n; i++) {
				if (!arr[i][j].equals(sarr[maxIndex])) {
					num++;
				}
			}
			// �ش� ��ü�� �ش������ maxIndex�� ���� �߰�
			sb.append(sarr[maxIndex]);

		}
		// ���
		System.out.println(sb);
		System.out.println(num);

	}
}
