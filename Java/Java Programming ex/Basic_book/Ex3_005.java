package Solve;
import java.util.*;

public class Ex3_005 {
	
	// �迭 a�� �����ϰ� ũ�⸦ 10���� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[10];
		Scanner sc = new Scanner(System.in);
		//��ĳ���� ��ü sc�� ����
		System.out.println("���� ���� 10���� �Է��Ͻÿ�");
		for(int i = 0;  i<10; i++) {
			 a[i] = sc.nextInt();
			//for ���� ���ư��鼭 ��ĳ�ʷκ��� ���� �Է¹޾� i�� �ε����� ���� �κп� �ϳ��� ����
		}
		System.out.println("3�� �����???");
		for(int j = 0; j < a.length; j++) {
			if( a[j] % 3 ==0) {
				//j�� �̿��Ͽ� �ϳ��� ��ȯ�ϰ� �������� 0�� ���� �̾Ƴ���. 
				System.out.println(a[j] + "");
				
			}
				
		}
		sc.close();
	}

}
