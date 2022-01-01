package Brute_force;

import java.util.Scanner;


public class P1254 {
	static int n ;
	
	static int �Ӹ����(String s) {
		// �־��� ���� s�� equals�� ���� ������ �������� �ľ�
		// ���ڰ� ���� �� ������ ���� ���� ���
		if(s.equals(new StringBuilder(s).reverse().toString())) {
				return s.length();
		}
		// 
		for(int i = 1 ;i < s.length();i++) {
			// StringBuildeer ��ü�� ������ �� s�� sb ��ü�� ġȯ
			StringBuilder sb = new StringBuilder(s);
			
			// subString �Լ��� �����̽��� �� ��ü�� �Ųٷ� �ؼ� �ٿ��ش�.
			sb.append(new StringBuilder(s.substring(0,i)).reverse());
			
			// ġȯ�� ��ü������ ���� ������ Ȯ��
			if(sb.toString().equals(sb.reverse().toString())) {
				return sb.length();
			}
		}
		return 1;
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� �Է� �ޱ�
		String s = sc.next();
		
		
		System.out.println(�Ӹ����(s));
		}
	}

	/*
	 * equals, == , hashcode
	 * 
	 * StringBuffer 
	 * 
	 * 
	 * return 0 , 1, -1
	 * main �޼ҵ� �ȿ��� 0�� ��ȯ�ϸ� �ü������ ���� ��ȯ 
	 *  = �ش��Լ� �ȿ��� ���������� ���Ḧ �ϰ� �ü���� ����� ���� ��ȯ �� �Լ��� ���
	 *  
	 * ���� ������ ���� �� 1 or -1�� ��ȯ
	 * �ü���� ���¿��� 0�� true�� �����ϸ� �������� �Լ��� ���Ḧ �ǹ�
	 * �ٸ� ���� ��ȯ�ϰ� �Ǹ� �ٸ� ��� Ȥ�� ������ �˸��� �Լ��� ���¸� �ǹ��Ѵ�.  
	 * 
	 * 
	 */