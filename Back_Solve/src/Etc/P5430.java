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
				ac = !ac; // 방향 전환, 앞- 뒤 / 뒤->앞
				continue; 
			}
			if(p[i]=="D") {
				if(ac) {
					if(d1.size()==0) {
						sb.append("error\n");
						}
					else {
						d1.removeFirst(); // t방향일시 앞에서 제거
					}
				}
				else if(!ac) {
					if(d1.size()==0) {
						sb.append("error\n");
						}
					else {
						d1.removeLast(); // f방향일시 뒤에서 제거
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
		
		int t  =sc.nextInt(); // test 경우의 수

		for(int i = 0 ;  i< t;i++) {
			
			String  [] p =  sc.next().split(""); // 불러오는 함수의 종류
			int n  = sc.nextInt(); // 배열, 숫자의 길이
			String s = sc.next(); // String으로 주어진 배열
			s = s.substring(1,s.length()-1);
			String [] sarr = s.split(","); // 주어진 s의 숫자만 남기는 과정
			
			Deque<Integer> d1 = new ArrayDeque<>(); // 문제에서 주어진 조건 duque
			for(int j = 0 ; j < n ; j++) {
				d1.add(Integer.parseInt(sarr[j]));
			}
			
		}
		
	}

}
