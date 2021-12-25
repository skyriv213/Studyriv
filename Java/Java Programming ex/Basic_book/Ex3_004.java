package Solve;
// 꼭 다시 풀어보기
// 중첩문은 프로그램의 구조를 복잡하게 만드므로 2중 또는 3중의 구조로만 하는것이 좋다. 

import java.util.*;

public class Ex3_004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자 알파벳 하나를 입력하시오 >>>");
		String a = sc.next(); // 문자열 읽기 
		char c = a.charAt(0);
		
		for(int i = 0; i < c - 'a' ; i++) {
			for(char j =  'a'; j <= c-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}

/*
* continue문은 반복문을 빠져나가지 않은면서 즉시 다음 반복으로 넘어가고자 할깨 사용
* continue; → 이런식으로 사용이 된다.
* for문에서 continue는 반복 후 작업으로 판단
* while 혹은 do-while의 경우는 조건식을 검사하는 과정으로 처리된다. 
* 
* break; 이런식으로 사용
* 하나의 반복문을 즉시 벗어날 때 사용한다.
* 실행시 현재의 반복문을 벗어나 실행이 계쏙된다.
* break의 경우 하나의 반복문만 벗어나기에 중첩 반복의 경우 안쪽 반복문에서 break 문이
* 실행이 되면 안쪽 반복문만 벗어나게 된다. 바깥쪽 반복문은 실행이 유지가 된다.
* 
* while 문을 만들다보면 벗어나는 조건이 까다로운 경우도 많기 떄문에 조건식을 작성하느라
* 대부분의 학생들이 애를 먹음. while 문에서 빠져 나오는 코드를 작성하는 저자의 노하우
* 
* if문을 사용하여 사용. while 문에 true값을 주어서 무한반복이 생기게 처음에 작성을 한다.
* while문을 벗어나는 조건을 if문으로 코딩한다.
* 
*/
