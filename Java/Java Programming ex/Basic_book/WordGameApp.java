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
		System.out.print("끝말잇기 게임을 시작합니다.."+"\n"+"게임에 참가하는 인원은 몇명입니까? >>>>");
		int n =  sc.nextInt();
		String [] name =  new String [n];
		for(int i = 0 ; i <n ; i++) {
			name[i]  = sc.next();
		}
		
		int l = (int)(Math.random()*n);
		System.out.print("시작은 "+(l+1)+"번째인 "+name[l]+"부터 시작하겠습니다.");
		System.out.print("시작하는 단어는 무엇인가요?>>");
		String w = sc.next();
		
		
		

	}

}
