package Solve;
import java.util.*;

public class Ex2_5 {
	int a, b, c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� �����ϴ� 3���� ���� ���̸� �Է��϶�>>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ( a+b > c && a + c > b && b + c > a)
			System.out.println("�ﰢ���� �˴ϴ�");

	}

}
