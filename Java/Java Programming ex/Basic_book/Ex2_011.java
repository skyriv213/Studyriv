package Solve;
import java.util.*;

public class Ex2_011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�(1-12)>>>");
		int m = sc.nextInt();
		if(m>=3 && m<=5)
			System.out.println("��");
		else if( m >=6 && m<=8)
		    System.out.println("����");
		else if( m >=9 && m<=11)
			System.out.println("����");
		else if( m >=12 && m<=2)
			System.out.println("�ܿ�");
		else
			System.out.println("���ڸ� �߸��Է��Ͽ����ϴ�.");
	sc.close();
	}

}
