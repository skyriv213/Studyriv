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
		int target = 0; // 코드를 진행하기 위한 임시값, 추후에 이진탐색을 쓸 경우 target에 원하는 목표값을 입력
		while(end-start >=0) {
			// 종료조건은 끝과 시작의 차가 0보다 크거나 같아질때까지만 반복
		
			if(arr[mid] ==target) {
				return mid;
			}
			else if(arr[mid]<=target) {
				start = mid +1; // arr[mid]가 target보다 작을 경우 start의 값을 1 증가
			}
			else {
				end = mid -1; // 반대의 경우 end 값을 1 감소
			}
			mid = (end +start)/2;
			
		}
		return -1; // 케이스를 찾을 수 없을 경우...
		
	}

}
/*
 * 이분 탐색 
 * 정렬되어 있어야 한다는 조건이 있다.
 * 
 * 정렬 되어있는 배열에서 데이터를 찾으려 시도를 할 때,
 * 순차 탐색처럼 처음부터 끝까지 하나씩 모든 데이터를 체크하여 값을 찾는 것이 아니라  
 * 탐색 범위를 절반씩 좁혀가면서 찾아가는 Search 방법이다.
 * 
 */