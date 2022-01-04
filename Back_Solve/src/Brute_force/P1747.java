package Brute_force;

import java.util.*;


public class P1747 {
		
	static boolean era(int x) {
		if(x == 1) {
			return false;
		}
		for(int i = 2 ; i < Math.sqrt(x)+1 ; i++) {
			if(x%i==0) { 
				return false;
			}
		}
				return true;
		}

	
	
	
	static boolean number(int x)  {
		String s = Integer.toString(x);
		if(s.equals(new StringBuffer(s).reverse().toString())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
    
	public static void main(String [] args) {
Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        for(int i = n; ; i++) {
            if(number(i) && era(i)) {
                System.out.println(i);
                break;
            }
        }    
	}

}
