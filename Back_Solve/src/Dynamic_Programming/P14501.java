package Dynamic_Programming;

import java.util.Scanner;

public class P14501 {
	public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      
      // 일을 할 수 있는 요일
      int n =  sc.nextInt();
       
      int time [] = new int [n+1]; // 시간을 지정하는 배열
      int pay [] = new int[n+1]; // 금액을 저장하는 배열
      int dp  [] = new int [n+2]; // 최종 금액을 저장하기위한 dp배열/ 0~기존 요일+1일까지의 저장을 위해
      							// 상담의 마무리는 다음날에 끝나는것이기에 n+1+1
      // 각각의 시간과 페이 배열에 값 저장
      for(int i = 1 ; i <= n;i++){
        time[i] = sc.nextInt();
        pay[i] = sc.nextInt();
      }
      
      
      // 반복문의 시작
      // 점화식을 앞으로만 계산하는 +를 생각하지말고 뒤에서부터 접근하는 방식도 생각해보자
      
      for(int i = n ;i>0;i--) {
    	  if(i+time[i]>n+1) {
    		  // 날짜가 기존 n에 넘어가는 경우 기존의 원소를 가져온다
    		  dp[i] = dp[i+1];
    	  }
    	  // 기존의 시간의 더한 배열과 pay를 더한 가격 그리고 이전 행의 값중에 더 큰 부분을 출력한다.
    	  else {
    		  dp[i]= Math.max(dp[i+1],dp[i+time[i]]+pay[i]);
    		      	  }
      }
      
      
      System.out.println(dp[1]);
      
 
  }

}

