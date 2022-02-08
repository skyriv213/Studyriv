package Brute_force;

import java.util.Scanner;

public class P1182 {
	static int [] arr;
	static int n,m,count;
	
	static void DFS(int a , int b) {
		
		if(a==n) {
			if(b==m) {
				count++;
			}
			return;
		}
		// 각각 깊이를 정하고 파고 들어갈때 추가적으로 이제 더할지 말지 정하면서 DFS를 실행할 수 있다. 
		// 이러한 경우를 통해 각 경우의 수에 맞게 선택을 하여 더해진 값이 count 된다. 
		DFS(a+1,b+arr[a]);
		DFS(a+1, b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // 주어진 숫자의 갯수
		m = sc.nextInt(); // 목표값

		arr = new int[n];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		count  = 0 ;
		
		// 주어진 숫자 어느걸 더해서 목표값을 만들기만하면됨.
		// 기존의 연속된 숫자가 아닌 연속되지않아도 가능하다는 언급
		DFS(0,0);
		
		if(m==0) {
			// 만약 아무것도 선택을 하지 않는 경우를 빼줘야하기에 조건문 작성
			System.out.println(count-1);
		}
		else {
			System.out.println(count);
		}
		
	}

}
