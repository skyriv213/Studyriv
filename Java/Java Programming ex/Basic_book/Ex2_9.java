package Solve;
import java.util.*;

public class Ex2_9 {
	double r;
	int comma1;
	int comma2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 중심인 두 점과 원의 반지름을 입력하시오");
		int comma1 = sc.nextInt();
		int comma2 = sc.nextInt();
		double r =  sc.nextDouble();
		
		System.out.println("위치하는 점의 좌표를 입력하시오>>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > comma1 - r && x < comma1 + r && y > comma2 - r 
				&& y < comma2 +r )
			System.out.println("원 안에 점이 존재한다.");
		else
			System.out.println("원 안에 존재하지 않는다.");
		

	}

}
