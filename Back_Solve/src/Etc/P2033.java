package Etc;

import java.util.Scanner;

public class P2033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble(); 
        int k = 1;
        for(int i=10; true; i*=10) {
            if(x > i) {
                int pow = (int)Math.pow(10, k);
                x /= pow;
                x = Math.round(x);
                x *= pow;
            } else break;
            k++;
        }
        System.out.println((int)x);
        sc.close();
}
}
