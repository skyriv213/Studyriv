package Solve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Map<String , Integer> m = new HashMap<>();
		m.put("Java", 95);
		m.put("C++", 100);
		m.put("�˰���", 80);
		m.put("��ǻ�ͱ���", 70);
		m.put("�����ͱ���", 65);
		 
		while(true) {
		    System.out.println("�����̸�>>>");
		    String s = sc.next();
		    System.out.println(m.get(s));
		    if(s == "�׸�") {
		    	break;		
				}
			}
			
		}
		
		
		

	}


