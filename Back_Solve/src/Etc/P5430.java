package Etc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P5430 {
	
	static StringBuilder sb = new StringBuilder(");
	
	static StringBuilder RD(String [] p , ArrayDeque<Integer> d1) {
		boolean ac = true; 
		
		
		for(int i = 0 ;i<p.length;i++) {
			if(p[i]=="R" ) {
				ac = !ac; // ���� ��ȯ, ��- �� / ��->��
				continue; 
			}
			if(p[i]=="D") {
				if(ac) {
					if(d1.size()==0) {
						sb.append("error\n");
						}
					else {
						d1.removeFirst(); // t�����Ͻ� �տ��� ����
					}
				}
				else if(!ac) {
					if(d1.size()==0) {
						sb.append("error\n");
						}
					else {
						d1.removeLast(); // f�����Ͻ� �ڿ��� ����
					}
				}
					
				}
				
			}
		for(int k = 0 ; k < d1.size();k++) {
			sb.append("[")
		}
		
		return sb;
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t  =sc.nextInt(); // test ����� ��

		for(int i = 0 ;  i< t;i++) {
			
			String  [] p =  sc.next().split(""); // �ҷ����� �Լ��� ����
			int n  = sc.nextInt(); // �迭, ������ ����
			String s = sc.next(); // String���� �־��� �迭
			s = s.substring(1,s.length()-1);
			String [] sarr = s.split(","); // �־��� s�� ���ڸ� ����� ����
			
			Deque<Integer> d1 = new ArrayDeque<>(); // �������� �־��� ���� duque
			for(int j = 0 ; j < n ; j++) {
				d1.add(Integer.parseInt(sarr[j]));
			}
			
		}
		
	}

}
