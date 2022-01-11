package Implement;


// 주어진 숫자들을 약수로 갖는 문제

// 문제에서는 구하고자하는 n에 대한 1,n을 제외한 모든 약수를 준다고 했다.

// 따라서 주어진 숫자들중에 1,n다음으로 크고 작은 숫자들을 골라내서 그 두개를 곱하는 방식으로 접근하였다.

import java.util.Scanner;

public class P1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		
		// 약수들의 갯수
		int n = sc.nextInt();
		
		// 약수들 중 최대/최소값 구하기 위한 변수 섧정
		int max=0;
		int min = 999999;
		int [] arr = new int[n];
		
		// 배열에 약수들을 입력
		for(int i =0; i< arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		// 배열에서 if문을 통해 최대/최솟값 골라내기
		for(int i = 0 ; i< arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		
		}
		// max와 min을 곱하여 출력하기
		System.out.println(max*min);
		
	}

}
