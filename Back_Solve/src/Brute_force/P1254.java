package Brute_force;

import java.util.Scanner;


public class P1254 {
	static int n ;
	
	static int 팰린드롬(String s) {
		// 주어진 문자 s가 equals를 통해 내용이 같은지를 파악
		// 문자가 같을 시 기존의 문자 길이 출력
		if(s.equals(new StringBuilder(s).reverse().toString())) {
				return s.length();
		}
		// 
		for(int i = 1 ;i < s.length();i++) {
			// StringBuildeer 객체를 생성한 후 s를 sb 객체로 치환
			StringBuilder sb = new StringBuilder(s);
			
			// subString 함수로 슬라이싱을 한 객체를 거꾸로 해서 붙여준다.
			sb.append(new StringBuilder(s.substring(0,i)).reverse());
			
			// 치환된 객체끼리의 값이 같은지 확인
			if(sb.toString().equals(sb.reverse().toString())) {
				return sb.length();
			}
		}
		return 1;
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력 받기
		String s = sc.next();
		
		
		System.out.println(팰린드롬(s));
		}
	}

	/*
	 * equals, == , hashcode
	 * 
	 * StringBuffer 
	 * 
	 * 
	 * return 0 , 1, -1
	 * main 메소드 안에서 0을 반환하면 운영체제로의 값을 반환 
	 *  = 해당함수 안에서 정상적으로 종료를 하고 운영체제로 기술한 값을 반환 및 함수를 벗어남
	 *  
	 * 따로 에러가 있을 시 1 or -1을 반환
	 * 운영체제의 상태에서 0을 true로 간주하며 성공적인 함수의 종료를 의미
	 * 다른 값을 반환하게 되면 다른 결과 혹은 에러를 알리는 함수의 상태를 의미한다.  
	 * 
	 * 
	 */