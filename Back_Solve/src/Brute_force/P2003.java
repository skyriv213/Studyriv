package Brute_force;

import java.util.ArrayList;
import java.util.Scanner;

public class P2003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //수의 갯수
		int m = sc.nextInt(); // 목표 수
		ArrayList<Integer> list = new ArrayList<>();
		
		// 수입력
		for(int i = 0 ;i< n;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		
		int start = 0 ; int end =0; int sum =0; int count = 0;
		
		while(true) {
			
			if(sum>=m) {
				sum -= list.get(start++);
			}
			else if(end==list.size()) {
				break;
			}
			else {
				sum+=list.get(end++);
			}
			if(sum==m) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
