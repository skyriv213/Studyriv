package Solve;
import java.util.*;
public class Ex2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rx1 = 100;
		int ry1 = 100;
		int rx2 = 200; 
		int ry2 = 200;

		Scanner sc = new Scanner(System.in);
		System.out.println("x1,y1�� �Է��Ͻÿ�");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.println("x2,y2�� �Է��Ͻÿ�");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		if ((x1>= rx1 && x1 <= rx2) && (y1>=ry1 && y1<=ry2 ) && 
				(x2 >= rx1   && x2 <= rx2 ) && (y2 >= ry1 && y2 <=ry2)){
			System.out.println("���簢���� �浹�� �Ͼ���ʴ´�.");
		}
		else {
			System.out.println("���簢�� �浹�� �Ͼ��");
		}
		sc.close();
	}

}

