package Binary_Search;

/*
 * �̺�Ž���� upper/lower�� ��쿡�� 
 * �߰��� ���� �����ϴ� �κ��� �߿�. 
 * �߰��� �� �����ϴµ� ���� ������� ���� 
 * 
 */


import java.util.Arrays;
import java.util.Scanner;

public class P1654 {
	
	
	public static void main(String [] args) {
		Scanner sc= new Scanner (System.in);
		
		int  k= sc.nextInt(); // ���� �־��� ������ ����
		 
		int n = sc.nextInt(); // ���ϰ����ϴ� ������ ����
		
		int [] arr= new int [k]; 
		
		
		// �� ������ ���̸� �Է�
		for(int i = 0 ; i< k;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		// Bin �޼ҵ忡 �迭�� ���̸� �־ 
		
		
		// �־��� �ڷ����� ũ��� ���� long���� ������ ���ش�
		long start = 1;
		long end =arr[arr.length-1];
		
		// �ݺ� ����
		while(start <=end) {
			// mid�� �߰��� ���� �߰������� ���
			long mid = (end+ start)/2;
			
			// ��� ���� �������� üũ�ϱ� ���� ����
			long count = 0;
			
			// �ݺ����� ���ؼ� �� ���Ҹ� �߰������� ���� ���� �����ֱ�
			for(int i= 0;i<arr.length;i++) {
				count += arr[i]/mid;
			}
			
			
			// ���� count�� n���� ũ�ų� ������ ���۰��� ����
			if(count >= n) {
				start = mid+1;
				
			}
			// �ݴ��� ��� ���������� ����
			else if(count <n) {
				end= mid-1;
			}
		}
		 // start�� ��� n�� ũ�Ⱑ ������������ +1�� �ϱ⶧���� end���� ����ؾ� ���ϴ� ���� ����� �� �ִ�. 
		// ������ start ���� ����Ϸ��� �ϸ� ���� �Է½� 201�� �����Ѵ�
		System.out.println(end);
	}
}
