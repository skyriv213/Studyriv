package Dynamic_Programming;

import java.util.Scanner;

public class P14501 {
	public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      
      // ���� �� �� �ִ� ����
      int n =  sc.nextInt();
       
      int time [] = new int [n+1]; // �ð��� �����ϴ� �迭
      int pay [] = new int[n+1]; // �ݾ��� �����ϴ� �迭
      int dp  [] = new int [n+2]; // ���� �ݾ��� �����ϱ����� dp�迭/ 0~���� ����+1�ϱ����� ������ ����
      							// ����� �������� �������� �����°��̱⿡ n+1+1
      // ������ �ð��� ���� �迭�� �� ����
      for(int i = 1 ; i <= n;i++){
        time[i] = sc.nextInt();
        pay[i] = sc.nextInt();
      }
      
      
      // �ݺ����� ����
      // ��ȭ���� �����θ� ����ϴ� +�� ������������ �ڿ������� �����ϴ� ��ĵ� �����غ���
      
      for(int i = n ;i>0;i--) {
    	  if(i+time[i]>n+1) {
    		  // ��¥�� ���� n�� �Ѿ�� ��� ������ ���Ҹ� �����´�
    		  dp[i] = dp[i+1];
    	  }
    	  // ������ �ð��� ���� �迭�� pay�� ���� ���� �׸��� ���� ���� ���߿� �� ū �κ��� ����Ѵ�.
    	  else {
    		  dp[i]= Math.max(dp[i+1],dp[i+time[i]]+pay[i]);
    		      	  }
      }
      
      
      System.out.println(dp[1]);
      
 
  }

}

