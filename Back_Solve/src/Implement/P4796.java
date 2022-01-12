package Implement;

import java.util.Scanner;


// 주어진 숫자를 입력 받아 계산을 한 후 출력하는 코드
public class P4796 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 주어진 숫자를 입력 받으며 0,0,0을 입력받을시 종료가 되는 식으로 반복문을 작성
		for(int i = 1 ; ;i++) {
			
			// 주어진 숫자 3개 , if문으로 0,0,0 이 들어왔을 경우 종료가 되게 break를 걸어준다.
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
						
			if(L==0 && P==0 && V==0) {
				break;
			}
			
			else {
				
				// 출력문에 쓸 x를 선언해준다.
				int x = (V/P)*L +Math.min(V%P ,L);
				// x의 경우 구할때 먼저 휴가의 기간과 연속하는 기간의 나눈 후의 몫과 묵을 수 있는 기간을 곱해서 초기항을 잡았다.
				// 추후에 휴가의 기간과 연속하는 기간의 나눈후의 나머지와 사용할수 있는 기간 중 작은 쪽을 더해주는 식으로 접근했다.
				// min값을 구해주는 이유는 L을 그대로 더해주는 순간 주어진 휴가의 기간을 초과할 수 있기 때문이다.
				
				System.out.println("Case "+i+": "+ x);
			}
		}
		sc.close();
	}

}
