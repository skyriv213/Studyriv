package Binary_Search;

/*
 * 이분탐색의 upper/lower의 경우에도 
 * 중간의 식을 구성하는 부분이 중요. 
 * 중간의 식 구성하는데 현재 어려움을 겪음 
 * 
 */


import java.util.Arrays;
import java.util.Scanner;

public class P1654 {
	
	
	public static void main(String [] args) {
		Scanner sc= new Scanner (System.in);
		
		int  k= sc.nextInt(); // 현재 주어진 랜선의 갯수
		 
		int n = sc.nextInt(); // 구하고자하는 랜선의 갯수
		
		int [] arr= new int [k]; 
		
		
		// 각 랜선의 길이를 입력
		for(int i = 0 ; i< k;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		// Bin 메소드에 배열과 길이를 넣어서 
		
		
		// 주어진 자료형의 크기로 인해 long으로 선언을 해준다
		long start = 1;
		long end =arr[arr.length-1];
		
		// 반복 시작
		while(start <=end) {
			// mid는 중간을 위해 중간값으로 계산
			long mid = (end+ start)/2;
			
			// 몇개의 선이 나오는지 체크하기 위한 변수
			long count = 0;
			
			// 반복문을 통해서 각 원소를 중간값으로 나눈 몫을 더해주기
			for(int i= 0;i<arr.length;i++) {
				count += arr[i]/mid;
			}
			
			
			// 만약 count가 n보다 크거나 작으면 시작값을 증가
			if(count >= n) {
				start = mid+1;
				
			}
			// 반대의 경우 마무리값을 감소
			else if(count <n) {
				end= mid-1;
			}
		}
		 // start의 경우 n과 크기가 같아질때까지 +1을 하기때문에 end값을 출력해야 원하는 값을 출력할 수 있다. 
		// 실제로 start 값을 출력하려고 하면 예제 입력시 201이 등장한다
		System.out.println(end);
	}
}
