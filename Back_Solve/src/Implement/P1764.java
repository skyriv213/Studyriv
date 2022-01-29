package Implement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class P1764 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in );
		int n =  sc.nextInt();
		int m = sc.nextInt();
		
		HashSet <String> s = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
 		
		for(int i = 0 ; i < n ; i ++) {
			s.add(sc.next());
		}
		
		int count = 0 ;
		
		for(int  i = 0; i< m;i++) {
			String str =  sc.next();
			if(s.contains(str)) {
				list.add(str);
				count++;
			}
		}
		Collections.sort(list);
		System.out.println(count);
		for(int i = 0 ; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}

}
