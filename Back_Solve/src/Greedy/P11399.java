package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		// 사람의 인덱스와 그 사람의 시간을 각자 연결해주기 위해 map을 사용
		// hash의 경우 속도가 가장 빠르기에 사용
		
		int [] n = new int[Integer.parseInt(br.readLine())];
		
		int a = 0;
		int b = 0;
		
		String [] s = br.readLine().split(" ");
		
		for(int i = 0 ; i < n.length; i++) {
			n[i] = (Integer.parseInt(s[i]));
		}
		Arrays.sort(n);
		b=0;
		for(int i =0; i < n.length;i++) {
			a+=n[i];
			b+=a;
		}
		//문제의 조건은 각 사람이 돈을 인출하는 최소의 시간의 합이다.
		bw.write(Integer.toString(b));
		bw.flush();
		bw.close();
		                                                                                                                                                                    

	}

}
