package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1931 {	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int[n][2];
		
		int count = 0; // 회의실 갯수
		
		int time = 0; // 회의시간을 변수 
		
		for(int i = 0 ; i <  n ;i++) {
			arr[i][0]= sc.nextInt(); //시작
			arr[i][1]= sc.nextInt(); //끝
		}
		
		// 정렬의 기준을 포함
		Comparator<int[]> com = new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				// 끝나는 시간이 같다면 첫번째를 기준으로 오름차순 정렬을 해준다.
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}
				return o1[1]-o2[1];
			}
			
		};
		
		Arrays.sort(arr,com);
		
		// 
		for(int i = 0;i<n;i++) {
			if(time<=arr[i][0]) {
				time = arr[i][1];
				count++;
			}
		
		}
		System.out.println(count);
	}

}
