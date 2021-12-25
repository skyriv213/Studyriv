package Solve;
import java.util.*;

public class Ex2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99사이의 정수를 입력하시오>>");
		int var = sc.nextInt();
		int a = var/10;
		int b = var%10;
		
		 if((a==3||a==6||a==9)&&(b==3||b==6||b==9))

			   System.out.println("박수짝짝");

			  else if((a==3||a==6||a==9)&&(b!=3||b!=6||b!=9))

			   System.out.println("박수짝");

			  else if((a!=3||a!=6||a!=9)&&(b==3||b==6||b==9))

			   System.out.println("박수짝");

			  else

			   System.out.println("아무것도 아니에요");
	
      sc.close();
	}

}
