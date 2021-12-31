package Brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1436 {
	 
	static BufferedReader br = new BufferedReader
	    		(new InputStreamReader(System.in));
	 static BufferedWriter bw =  new BufferedWriter
	    		(new OutputStreamWriter(System.out));
	    
	
	public static void 종말의수(int n) throws IOException {
		
        int x = 0;
					
			for(int i =666 ; true ; i++ ) {
				String s =  Integer.toString(i);
			    if(s.contains("666")) {
			     	x++;
			}
			    
			    if(x == n) {
				   n=i;
			       break;
				   
			}
			
		}
			System.out.println(n);
			
		}
	public static void main(String [] args) throws NumberFormatException, IOException {
		int x = Integer.parseInt(br.readLine());
		종말의수(x);
	}
}