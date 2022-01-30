package Greedy;
/*  문제 접근방식
 * 총감독관의 수는 시험장마다 1명씩 필수 =  시험장의 갯수는 총감독관의 수
 * 총 감독관의 관리 범위인 b에 맞춰서 p가 커버가 되면 다음 시험장으로
 * 만약 인원이 관리 범위를 넘어가면 부 감독관의 입실
 * 한 교실에서 총/부 감독관의 범위를 넘어가면 이제 부감독관을 추가로 카운팅
 */

import java.io.*;
import java.util.Scanner;

public class P13458 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 시험장의 갯수
		int[] room = new int[n]; // 시험장의 갯수를 배열로
		for(int i = 0 ; i < n ; i ++) {
			room[i]=sc.nextInt();
		}
		int b = sc.nextInt(); // 총감독관 관리 가능 범위 수
		int c = sc.nextInt(); // 부감독관 관리 가능 범위 수

		long tot = n; // 데이터의 크기를 위해 long 변수로 선언
		
		for (int i = 0; i < room.length; i++) {
			// 각 방에 응시자의 수 입력
			room[i] -= b;
			
			if (room[i] > 0) {
				tot += room[i] / c;
				
				if (room[i] % c != 0) {
					tot++;
				}
			}
		}
		System.out.println(tot);
	}

}
