package Implement; // ���� ������

import java.util.Scanner;

public class P2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		//�������� ���� ���� ����
		int x = 3;
		int y = 4;
		int count;

		    for (int i = 0; i < x; i++) {
		      //count�� �ݺ��� ������ ������ �ʱ�ȭ
		    	count = 0;

		      for (int j = 0; j < y; j++) {
		    	  // 
		        int num = sc.nextInt();

		        if(num == 0) {
		          count++;
		        }
		      }
		      	if (count == 1) {
		          System.out.println("A");
		        } 
		      	else if (count == 2) {
		          System.out.println("B");
		        } 
		      	else if (count == 3) {
		          System.out.println("C");
		        } 
		      	else if (count == 4) {
		          System.out.println("D");
		        }
		      	else if(count == 0) {
			          System.out.println("E");

		    }
		
	}

}
}
