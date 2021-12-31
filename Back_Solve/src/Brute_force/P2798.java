package Brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2798 {

	public static void ∫Ì∑¢¿Ë2() throws IOException {
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter
				(new OutputStreamWriter(System.out));
		String [] s =  br.readLine().split(" ");
		String [] sarr = br.readLine().split(" ");

		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		int [] arr = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] =  Integer.parseInt(sarr[i]);
		}
		int sum ;
		int x=0;
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1 ; j <n-1 ; j++ ) {
				for(int k = j+1 ; k <n; k++) {
					sum = arr[i]+arr[j]+arr[k];
					if( sum <= m && x< sum  ) {
						x = sum;
					}
						
						
						
					}
				}
			}
		bw.write(Integer.toString(x));
		bw.flush();
		bw.close();
		
	}
	public static void main(String[] args) throws IOException {
	
		∫Ì∑¢¿Ë2();

	}

}
