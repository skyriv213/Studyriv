package DFS_BFS;
import java.util.Scanner;

public class P11403 {
	
	
	// ����
	// i���� j�� ���� �ִ°�?
	// i���� k��, k���� j�� �� �� �ִ°�?
	
	static int [][] arr, map;
	
	static void Floyd() {
		
		// �߰��ܰ��� k�� ���� �ۿ��� ���ƾ� �Ѵ�.
		// �߰��ܰ谡 ���� �ۿ��� ��ȸ�� �ϰ� , �׿� ���缭 ������� �������� ���ƾ��Ѵ�.
		// ���� �߰��ܰ��� k�� ������� ������ ���̿��� ���� �Ǹ� ��������� ������� ���ƿ��� ����Ǽ��� ���ܵǴ� ��찡 �����Ѵ�.
		
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
