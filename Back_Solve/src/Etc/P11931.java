package Etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P11931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(
				new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		
		int []arr = new int [x];
		for(int i  =0 ; i < x; i ++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for(int  i =  arr.length-1;i>=0;i--) {
			bw.write(arr[i] + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
