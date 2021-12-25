package Solve;

public class Ex3_007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [10];
		double sum = 0 ;
		for (int i = 0 ; i < a.length; i++) {
			a[i]=  (int)(Math.random()*10+1);
			sum += a[i];
		}
		System.out.println("Æò±ÕÀº "+sum/10);

	}

}
