package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class P1920 {
	static int [] arr,arr3;
	// ��ǥ�� ����Ž���� �޼ҵ�
//	static int Binary_Search(int [] arr , int target) {
//		
//		// ������ ���ϱ� ���� ���� ���� ����, ������ �������� Ž���� �ϱ⿡ �޾ƿ� �迭������ ���� �̿�.
//		int start = 0 ;
//		int end = arr.length -1;
//		int mid;
//		while(start <= end) {
//			mid = (start +end)/2; // �ݺ��� ���۽� �׻� mid���� ������ �������, �ȱ׷��� mid���� ������ä�� �����Ͽ� ���� ����� �ȵ� 
//
//			if(arr[mid]==target) {
//				return 1; // ã�� ���� �迭 �ȿ� �ִٸ� 1�� ����϶�� ������ ����
//			}
//			else if(arr[mid]<=target) {
//				start = mid + 1; // arr[mid]�� ��ǥġ���� �����Ͻ� �߰����� +1 �� ���� ���۰����� ���ϸ鼭 Ž���� ������ �������� ����
//			}
//			else {
//				end = mid - 1 ; // arr[mid]�� ���� ��ǥ������ ���� ��� ������ �����Ͽ� ���� Ž������ ����
//			}
//			
//		}
//		return 0; // ���� ã�� �� ���� ��� ��ȯ���� 0���� ��ȯ
//	}
	
	
	static void count(int n) {
		arr3 = new int [arr[arr.length-1]];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		// �迭�� ũ��� �迭�� �Է¹��� �غ�
		int n = sc.nextInt();
		arr = new int [n];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		// �̺�Ž���� ���� �迭�� ����ũ������ ����, �̺�Ž���� ������ �����Ͱ� ���� ������ �Ǿ����.
		Arrays.sort(arr);
		
		// Test���̽��� ���� ���� �ޱ� ���� �ڵ� ����
		int test = sc.nextInt(); // Test�� ��
		int [] arr2 = new int [test];
		for(int i = 0 ; i < test ; i ++) {
			//target ���� �Է� �ް� �� ���� ��� ������ �̸� ������ ���� �޼ҵ忡 �־� ����� ��� 
			arr2[i]= sc.nextInt();
		}
		for(int i = 0 ; i < test ; i++) {
			System.out.println(Binary_Search(arr,arr2[i]));
		}
		
		
		
	}
	

}
