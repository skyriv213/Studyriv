package Solve;
import java.util.*;

public class Ex2_4 {
	int a, b, c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오 >>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && c>b && a>c) 
			System.out.println(c);
		else if(a>b && c>b && c>a)
			System.out.println(a);
		else if(b>a && c>a && c>b)
			System.out.println(b);
		
		sc.close();
	}

}
