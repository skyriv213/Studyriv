package Etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class P1990 {
		
	static BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(
			new OutputStreamWriter(System.out));

	static void number(int x) throws IOException {
		String s = Integer.toString(x);
		if(s.equals(new StringBuffer(s).reverse().toString())) {
			bw.write(Integer.toString(x) + "\n");
		}
		
	}
	
	public static void main(String [] args) throws IOException {
		
		String [] s = br.readLine().split(" ");
				
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		// 배열의 크기는 b까지 담아야하므로 크기를 지정
		boolean [] arr1 = new boolean [b+1];
		
		//초기값은 전부다 true로 지정
		Arrays.fill(arr1, true);
		// 0,1은 체크하지않을 예정이므로 false로 지정
		arr1[0] = arr1[1]= false;
		
		// 에라토스테네스의 체 설정
		for(int i = 2 ; i <= b;i++) {
			// false일시 과정을 체크하지않고 바로 넘어가기
			if(arr1[i]==false) {
				continue;
			}
			// false 체크 해주기
			for(int  j = i*2;j<=b;j+=i) {
				arr1[j]=false;
			}
			if(arr1[i]==true && i>=a) {
				number(i);
			}
		}
		
		bw.write(Integer.toString(-1));
		bw.flush();
		bw.close();
	
		

	}

}
