package Data_Structure;

import java.util.HashSet;
import java.util.Scanner;

public class P1269 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		 
		// set ����
		HashSet <Integer> a1 = new HashSet<>();
		HashSet <Integer> b1 = new HashSet<>();
		
		// a ���տ� �� �Է�
		for(int i = 0 ;i< a ;i++) {
			int x = sc.nextInt();
			a1.add(x);
		}
		
		// b ���տ� �� �Է�
		for(int  i = 0 ;i< b;i++) {
			int y =  sc.nextInt();
			b1.add(y);
		}
		
		int count =0;
		for(int i :b1) {
			if(!a1.contains(i)) {
				count++;
			}
		}
		for(int i :a1) {
			if(!b1.contains(i)) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
