package Etc;

import java.util.Scanner; 

public class P1934 {
	static int GCD(int a, int b) {
		int r = a%b;
		if(r==0) {
			return b;
		}
		else {
			return GCD(b,r);
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = GCD(a,b);
			
			System.out.println(a*b/x);
			
		}
	}
}
/*
유클리드 호제법
- 두 양의 정수, 혹은 두 다항식의 최대 공약수를 구하는 방법.
GCD(A,B) = GCD(B,R)
a,b의 최대공약수는 b,r의 최대 공약수와 같으며 r = 0 일시 최대 공약수는 b가 된다.
이때 a는 b보다 큰 수를 기준으로 두며
r은 a%b이다.
*/
