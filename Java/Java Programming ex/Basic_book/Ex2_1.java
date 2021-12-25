package Solve;
import java.util.*;


public class Ex2_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원화를 입력하시오(단위 원)");
		int b = sc.nextInt();
		double d = b/1100 ; 
		
		System.out.println(b + "원은 " + d + "$입니다.." );
		
		sc.close();
	
	}

}
