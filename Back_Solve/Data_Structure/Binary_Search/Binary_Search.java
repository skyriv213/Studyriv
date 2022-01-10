package Binary_Search;

import java.util.Scanner;

public class Binary_Search {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		
		int n =  sc.nextInt();
		
		int [] arr = new int [n];
		
		for(int i = 0 ;i< arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		// binary search 
		int start = 0 ; 
		int end =  arr.length-1;
		int mid = (end +start)/2;
		int target = 0; // �ڵ带 �����ϱ� ���� �ӽð�, ���Ŀ� ����Ž���� �� ��� target�� ���ϴ� ��ǥ���� �Է�
		while(end-start >=0) {
			// ���������� ���� ������ ���� 0���� ũ�ų� �������������� �ݺ�
		
			if(arr[mid] ==target) {
				return mid;
			}
			else if(arr[mid]<=target) {
				start = mid +1; // arr[mid]�� target���� ���� ��� start�� ���� 1 ����
			}
			else {
				end = mid -1; // �ݴ��� ��� end ���� 1 ����
			}
			mid = (end +start)/2;
			
		}
		return -1; // ���̽��� ã�� �� ���� ���...
		
	}

}
/*
 * �̺� Ž�� 
 * ���ĵǾ� �־�� �Ѵٴ� ������ �ִ�.
 * 
 * ���� �Ǿ��ִ� �迭���� �����͸� ã���� �õ��� �� ��,
 * ���� Ž��ó�� ó������ ������ �ϳ��� ��� �����͸� üũ�Ͽ� ���� ã�� ���� �ƴ϶�  
 * Ž�� ������ ���ݾ� �������鼭 ã�ư��� Search ����̴�.
 * 
 */