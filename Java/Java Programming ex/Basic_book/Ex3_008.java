package Solve;

import java.util.Scanner;

public class Ex3_008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("필요한 정수 몇개?>>");
		int n =  sc.nextInt();
		int a = (int)(Math.random()*10+1);
		int b = (int)(Math.random()*10+1);
		int s [][] = new int [a][b];
		for (int i = 0 ; i < s.length; i++) {
			
			for (int j = 0; j <s[i].length ; j++) {
				
				s[i][j]=(int)(Math.random()*100+1);
				
			}
		}
        for (int i = 0 ; i < s.length; i++) {
			
			for (int j = 0; j <s[i].length ; j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
				

	}

}
}