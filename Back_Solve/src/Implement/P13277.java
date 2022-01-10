package Implement;

import java.math.BigInteger;
import java.util.Scanner;

public class P13277 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int 형의 데이터 제한을 넘어가는 숫자를 받기위해 java의 
		// BigInteger 클래스를 사용하여 표현하였다
		Scanner sc = new Scanner(System.in);
		BigInteger a =  new BigInteger(sc.next());
		BigInteger b =  new BigInteger(sc.next());
		System.out.println(a.multiply(b));
	}

}
