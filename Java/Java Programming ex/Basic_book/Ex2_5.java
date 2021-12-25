package Solve;
import java.util.*;

public class Ex2_5 {
	int a, b, c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형을 구성하는 3개의 변의 길이를 입력하라>>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ( a+b > c && a + c > b && b + c > a)
			System.out.println("삼각형이 됩니다");

	}

}
