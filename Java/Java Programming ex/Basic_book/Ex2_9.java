package Solve;
import java.util.*;

public class Ex2_9 {
	double r;
	int comma1;
	int comma2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �߽��� �� ���� ���� �������� �Է��Ͻÿ�");
		int comma1 = sc.nextInt();
		int comma2 = sc.nextInt();
		double r =  sc.nextDouble();
		
		System.out.println("��ġ�ϴ� ���� ��ǥ�� �Է��Ͻÿ�>>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > comma1 - r && x < comma1 + r && y > comma2 - r 
				&& y < comma2 +r )
			System.out.println("�� �ȿ� ���� �����Ѵ�.");
		else
			System.out.println("�� �ȿ� �������� �ʴ´�.");
		

	}

}
