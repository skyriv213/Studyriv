package Solve;
import java.util.*;

public class Ex2_2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("2�ڸ��� ������ �Է��Ͻÿ�(10~99)>>>");
		int a = sc.nextInt();
		int b = a/10;
		int c = a%10;
		if (b==c) {
			System.out.println("���� �ڸ� ���ڿ� ���� �ڸ����ڰ� �����մϴ�.");
		}
		else {
			 System.out.println("���� �ڸ� ���ڿ� ���� �ڸ������� ���� Ʋ���ϴ�");
			}
		
		
		
     sc.close();
	}

}
