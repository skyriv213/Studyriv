package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class P1920 {
	static int [] arr,arr3;
	// 목표한 이진탐색의 메소드
//	static int Binary_Search(int [] arr , int target) {
//		
//		// 순서를 구하기 위해 사전 변수 설정, 범위를 좁혀가며 탐색을 하기에 받아온 배열에서의 값을 이용.
//		int start = 0 ;
//		int end = arr.length -1;
//		int mid;
//		while(start <= end) {
//			mid = (start +end)/2; // 반복문 시작시 항상 mid값을 재정의 해줘야함, 안그러면 mid값은 고정된채로 존재하여 값이 출력이 안됨 
//
//			if(arr[mid]==target) {
//				return 1; // 찾는 값이 배열 안에 있다면 1을 출력하라는 문제의 조건
//			}
//			else if(arr[mid]<=target) {
//				start = mid + 1; // arr[mid]가 목표치보다 이하일시 중간값에 +1 한 값이 시작값으로 변하면서 탐색의 범위를 절반으로 감소
//			}
//			else {
//				end = mid - 1 ; // arr[mid]의 값이 목표값보다 높을 경우 끝값을 조정하여 값의 탐색범위 조절
//			}
//			
//		}
//		return 0; // 값을 찾을 수 없을 경우 반환값을 0으로 반환
//	}
	
	
	static void count(int n) {
		arr3 = new int [arr[arr.length-1]];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		// 배열의 크기과 배열을 입력받을 준비
		int n = sc.nextInt();
		arr = new int [n];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		// 이분탐색을 위한 배열의 숫자크기대로의 정렬, 이분탐색은 무조건 데이터가 먼저 정렬이 되어야함.
		Arrays.sort(arr);
		
		// Test케이스를 위한 수를 받기 위한 코드 선언
		int test = sc.nextInt(); // Test의 수
		int [] arr2 = new int [test];
		for(int i = 0 ; i < test ; i ++) {
			//target 값을 입력 받고 그 값을 출력 구문에 미리 지정해 놓은 메소드에 넣어 결과값 출력 
			arr2[i]= sc.nextInt();
		}
		for(int i = 0 ; i < test ; i++) {
			System.out.println(Binary_Search(arr,arr2[i]));
		}
		
		
		
	}
	

}
