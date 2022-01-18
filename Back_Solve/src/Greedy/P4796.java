package Greedy;

import java.util.Scanner;

public class P4796 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				for(int i = 1 ; ;i++) {
					int L = sc.nextInt();
					int P = sc.nextInt();
					int V = sc.nextInt();
								
					if(L==0 && P==0 && V==0) {
						break;
					}
					
					else {
						int x = (V/P)*L +Math.min(V%P ,L);

						System.out.println("Case "+i+": "+ x);
					}
				}
				sc.close();
	}

}
