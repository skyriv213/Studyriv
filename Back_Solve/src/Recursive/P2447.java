package Recursive;

import java.util.Arrays;
import java.util.Scanner;

public class P2447 {

	static String arr[][];
	
	static void blank(int x,int y,int w,int n) {
		for(int i =0 ; i<x;i++) {
			for(int j = 0;j<y;j++) {
				// 행,열을 순환
				if(i==w&&j==w|| i>w && i<w+(w-1) &&j>w && j<w+(w-1)) {
					arr[i][j]=" ";
				}
			}
		}
		x=
		
	}
	
		/*
		행을 기준으로 시작
		행을 기준으로 각각의 변의 길이가 3인 정사각형으로 분배
		x가 N이 되었을 경우 다시 x는 0으로 초기화
		동시에 y의 숫자범위 증가
		y의 숫자범위가 증가한 상태에서 다시 x가 N이 되었을 경우 
		다시 y를 증가
		
		중간에 N의 3등분의 범위에 존재하는 좌표에는 공백이 존재
		
		후에 x와 y의 값이 N이 되었을 경우 배열을 출력
		 */
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		arr= new String [N][N];
		
		Arrays.fill(arr, "*");
		int w=N/3; // 비워지는 공간
		
		sc.close();
	}

}
