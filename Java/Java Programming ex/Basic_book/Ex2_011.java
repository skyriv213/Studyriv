package Solve;
import java.util.*;

public class Ex2_011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하시오(1-12)>>>");
		int m = sc.nextInt();
		if(m>=3 && m<=5)
			System.out.println("봄");
		else if( m >=6 && m<=8)
		    System.out.println("여름");
		else if( m >=9 && m<=11)
			System.out.println("가을");
		else if( m >=12 && m<=2)
			System.out.println("겨울");
		else
			System.out.println("숫자를 잘못입력하였습니다.");
	sc.close();
	}

}
