package Implement;

import java.util.Scanner;


// �־��� ���ڸ� �Է� �޾� ����� �� �� ����ϴ� �ڵ�
public class P4796 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// �־��� ���ڸ� �Է� ������ 0,0,0�� �Է¹����� ���ᰡ �Ǵ� ������ �ݺ����� �ۼ�
		for(int i = 1 ; ;i++) {
			
			// �־��� ���� 3�� , if������ 0,0,0 �� ������ ��� ���ᰡ �ǰ� break�� �ɾ��ش�.
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
						
			if(L==0 && P==0 && V==0) {
				break;
			}
			
			else {
				
				// ��¹��� �� x�� �������ش�.
				int x = (V/P)*L +Math.min(V%P ,L);
				// x�� ��� ���Ҷ� ���� �ް��� �Ⱓ�� �����ϴ� �Ⱓ�� ���� ���� ��� ���� �� �ִ� �Ⱓ�� ���ؼ� �ʱ����� ��Ҵ�.
				// ���Ŀ� �ް��� �Ⱓ�� �����ϴ� �Ⱓ�� �������� �������� ����Ҽ� �ִ� �Ⱓ �� ���� ���� �����ִ� ������ �����ߴ�.
				// min���� �����ִ� ������ L�� �״�� �����ִ� ���� �־��� �ް��� �Ⱓ�� �ʰ��� �� �ֱ� �����̴�.
				
				System.out.println("Case "+i+": "+ x);
			}
		}
		sc.close();
	}

}
