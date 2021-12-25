package Solve;
import java.util.*;

public class Ex2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("점을 입력하시오>>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if ((100<=a && a<=200) && (100<=b && b<=200))
			System.out.println("("+a+","+b+")는 사각형 안에  있습니다.");
		else
			System.out.println("사각형 안에 없습니다.");

	}

}
