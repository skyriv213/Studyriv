package Binary_Search;

/*
 * 이진 탐색에서 활용되는 또다른 방법
 * 
 * 이진 탐색이 데이터 내부에서 특정값을 정확하게 찾는것이면 
 * Upper bound & Lower bound 이 두가지의 방식은 이진탐색에서 응용이 된 알고리즘이다.
 * 이 두개의 방식은 중복된 자료가 있을 때 사용이 가능한 방법이며 
 * lower의 경우 데이터 내부에서 k보다 같거나 큰 값이 있으면 리턴,
 * uppper는 k값보다 큰값이 나오면 위치를 리턴해준다
 * 
 */

public class Uppeer_Lower {
	
	// 먼저 우리가 흔히 아는 이진탐색의 방법이다
	static int BinarySearch(int [] arr, int k) {
		int start  = 0 ;
		int end = arr.length-1;
		int mid;
		
		while(start<=end) {
			mid = (start + end )/2;
			if(arr[mid]==k) {
				return arr[mid];
			}
			else if(k < arr[mid]) {
				end = mid-1;
			}
			else if(k>arr[mid]) {
				start = mid+1;
			}
			
		}
		return 0;
	}
	
	/*
	 * 다음은 lower bound
	 * 주어진 값보다 크거나 같은 갑이 처음으로 나오는 부분을 리턴
	 */
	static int LowerBound(int [] arr, int k) {
		int start = 0;
		int end = arr.length;
		while(start < end) {
			final int mid = start + (end-start)/2;
			if(k<=arr[mid]) {
				end = mid;
			}
			else {
				start = mid +1;
			}
		}
		return start;
	}
	
	/*
	 * upper bound 
	 * 
	 */
	
	static int UpperBound(int [] arr, int  k) {
		
		// 시작값을 받음
		int start =0 ;
		int end = arr.length;
		
		
		// 반복문 실행
		while(start < end) {
			final int mid  = start + (end- start)/2;
			
			// k가 배열의 중앙
			if(k >= arr[mid]) {
				start = mid +1;
			}
			else {
				end = mid;
			}
			
		}
		return start;
	}
	
}
