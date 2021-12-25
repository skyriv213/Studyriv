package Solve;

public class Ex3_010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0 ;
		int [][] arr = new int [4][4];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length;j++) {
				if(count != 10) {
				    arr[i][j] = (int)(Math.random()*10+1);
				    count ++;
				}
				else if(count ==10) {
					arr[i][j] = 0;
				}
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
