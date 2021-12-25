package ch11;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Calc ca = new CompleteCalc();
		System.out.println(ca.add(x,y));
		System.out.println(ca.divide(x,y));
		System.out.println(ca.subtract(x,y));
		System.out.println(ca.times(x,y));
		
		CompleteCalc ca1 =  new CompleteCalc();
		ca1.shhowInfo();

	}

}
