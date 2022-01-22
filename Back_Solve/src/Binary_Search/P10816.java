package Binary_Search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		// 시간 절약을 위해 buffer 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		// 문제에서 주어진 음수를 양수로 바꾸기 위해 각 최대범위를 입력
		int [] counting  =  new int [20000001];

		int n = Integer.parseInt(br.readLine());
		
		String [] s = br.readLine().split(" ");
				
		// 구하고자 하는 배열 인덱스에 값 추가
		for(int i = 0 ; i < n;i++ ) {
			int x = Integer.parseInt(s[i]);
			counting[x+10000000]++;
			}
		
		int t = Integer.parseInt(br.readLine());
		
		int [] test = new int [t];
		
		String [] s1 = br.readLine().split(" ");
		
		// 인덱스 호출을 위한 배열
		for(int i = 0 ; i < t;i++) {
			test[i]= Integer.parseInt(s1[i]);
		}
	
		// 각 인덱스 배열에 음수의 최소값을 넣고 수를 더하여 출력ㄴ
		for(int i = 0 ; i < test.length;i++) {
			bw.write(counting [test[i]+10000000] +" ");  
		}
		
		bw.flush();
		bw.close();
		
		
	}

}
