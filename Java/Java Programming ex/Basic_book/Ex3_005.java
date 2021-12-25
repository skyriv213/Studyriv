package Solve;
import java.util.*;

public class Ex3_005 {
	
	// 배열 a를 선언하고 크기를 10으로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[10];
		Scanner sc = new Scanner(System.in);
		//스캐너의 객체 sc를 선언
		System.out.println("양의 정수 10개를 입력하시오");
		for(int i = 0;  i<10; i++) {
			 a[i] = sc.nextInt();
			//for 문이 돌아가면서 스캐너로부터 수를 입력받아 i의 인덱스를 가진 부분에 하나씩 저장
		}
		System.out.println("3의 배수는???");
		for(int j = 0; j < a.length; j++) {
			if( a[j] % 3 ==0) {
				//j를 이용하여 하나씩 소환하고 나머지가 0인 수를 뽑아낸다. 
				System.out.println(a[j] + "");
				
			}
				
		}
		sc.close();
	}

}
