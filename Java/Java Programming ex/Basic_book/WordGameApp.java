package Solve;

import java.util.Scanner;

/*Class Player{
	
	public String getWordFromuser() {
		
	}
	
	public void checkSuccess() {
		
	}
	
}*/

public class WordGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ձ� ������ �����մϴ�.."+"\n"+"���ӿ� �����ϴ� �ο��� ����Դϱ�? >>>>");
		int n =  sc.nextInt();
		String [] name =  new String [n];
		for(int i = 0 ; i <n ; i++) {
			name[i]  = sc.next();
		}
		
		int l = (int)(Math.random()*n);
		System.out.print("������ "+(l+1)+"��°�� "+name[l]+"���� �����ϰڽ��ϴ�.");
		System.out.print("�����ϴ� �ܾ�� �����ΰ���?>>");
		String w = sc.next();
		
		
		

	}

}
