package Etc;

import java.util.Arrays;
import java.util.Scanner;

public class P1990 {
	
	
	static boolean [] barr;
	static int []arr;
	
	static boolean 팰린드롬(int i) {
		
		String [] s1 = Integer.toString(i).split("");
		String [] s2 = new String [s1.length];
		
		for(int i1 = 0; i1 < s1.length;i1++) {
			s2[s1.length-i1]=s1[i1];
		}
		
		boolean flag = false;
		for(int j = 0 ;j<s1.length;j++) {
			if(s1[j].equals(s2[j])) {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		if(flag == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static void 소수(int [] arr) {
		for(int i = 2; i<arr.length;i++) {
			if(arr[i]==0) {
				continue;
			}
			for(int j=i*i;j<arr.length;j+=i) {
				arr[j]=0;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
	
		int n  = sc.nextInt();
		int m =  sc.nextInt();
		
		barr = new boolean[m+1];
		arr = new int [m+1];
		
		for(int  i = 0;i<=m;i++) {
			if(n<2) {
				arr[i] = 0;
			}
			else {
				arr[i]=i;
			}
		}
		소수(arr);
		Arrays.fill(barr, false);
		
		for(int i =n;i <=m;i++) {
			barr[i]=팰린드롬(i);
		}
		
		for(int z = n ; z<=m;z++) {
			if(barr[z]==true && arr[z]!=0) {
				sb.append(z + "\n");
			}
		}
		sb.append("-1");
		System.out.println(sb);
		
		
		
		

	}

}
