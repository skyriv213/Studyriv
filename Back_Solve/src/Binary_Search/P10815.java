package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class P10815 {
	
	static int [] arr;
	
	static int Binary(int num) {
		int start = 0 ;
		int end = arr.length-1;
		
		int mid ;
		while(start <=end) {
			mid =  (start + end)/2;
			
			if(arr[mid]== num) {
				return 1;
			}
			else if(arr[mid]<=num) {
				start =mid +1;
			}
			else if(arr[mid]>num) {
				end = mid-1;
			}
			
		}
		return 0;
	
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =  sc.nextInt();
		
		arr = new int [n];
		
		for(int i =0 ; i< n;i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		
		int t = sc.nextInt();
		int [] test = new int [t];
		for(int  i = 0 ; i< t;i++) {
			test[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < t;i++) {
			if(i==t-1) {
				System.out.print(Binary(test[i]));
			}
			else {
			System.out.print(Binary(test[i]) + " ");
			}
		}
	}
	
}
