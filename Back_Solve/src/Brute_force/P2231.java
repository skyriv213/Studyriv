package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231{
	public static void ������(int N) {
		
		
		int result  = 0 ;
		for(int i = 0; i < N; i++) {
			int number = i;
			int sum = 0;	// �� �ڸ��� �� ���� 
			
			while(number != 0) {
				sum += number % 10;	// �� �ڸ��� ���ϱ�
				number /= 10;
			}
			
			// i ���� �� �ڸ��� �������� ���� ��� (�����ڸ� ã���� ���) 
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);

		
	}
	
	public static void main(String [] args) throws NumberFormatException, IOException {
	BufferedReader br  = new BufferedReader
			(new InputStreamReader(System.in));
		
		������(Integer.parseInt(br.readLine()));	
	}

}
