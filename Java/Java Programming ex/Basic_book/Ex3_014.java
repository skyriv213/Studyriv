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
		m.put("알고리즘", 80);
		m.put("컴퓨터구조", 70);
		m.put("데이터구조", 65);
		 
		while(true) {
		    System.out.println("과목이름>>>");
		    String s = sc.next();
		    System.out.println(m.get(s));
		    if(s == "그만") {
		    	break;		
				}
			}
			
		}
		
		
		

	}


