package Brute_force;

import java.util.Scanner;

public class P1182 {
	static int [] arr;
	static int n,m,count;
	
	static void DFS(int a , int b) {
		
		if(a==n) {
			if(b==m) {
				count++;
			}
			return;
		}
		// ���� ���̸� ���ϰ� �İ� ���� �߰������� ���� ������ ���� ���ϸ鼭 DFS�� ������ �� �ִ�. 
		// �̷��� ��츦 ���� �� ����� ���� �°� ������ �Ͽ� ������ ���� count �ȴ�. 
		DFS(a+1,b+arr[a]);
		DFS(a+1, b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // �־��� ������ ����
		m = sc.nextInt(); // ��ǥ��

		arr = new int[n];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		count  = 0 ;
		
		// �־��� ���� ����� ���ؼ� ��ǥ���� ����⸸�ϸ��.
		// ������ ���ӵ� ���ڰ� �ƴ� ���ӵ����ʾƵ� �����ϴٴ� ���
		DFS(0,0);
		
		if(m==0) {
			// ���� �ƹ��͵� ������ ���� �ʴ� ��츦 ������ϱ⿡ ���ǹ� �ۼ�
			System.out.println(count-1);
		}
		else {
			System.out.println(count);
		}
		
	}

}
