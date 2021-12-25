package ch08_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArrayIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int [] arr= {1,2,3,4,5}; try { for(int i = 0; i<=arr.length;i++) {
		 * System.out.println(arr[i]); } } catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println(e.getMessage()); System.out.println(e.toString()); }
		 * System.out.println("here!!!"); FileInputStream fis;
		 * 
		 * try { fis = new FileInputStream("c.txt"); System.out.println("read"); try {
		 * fis.close(); } catch(IOException e) { e.printStackTrace(); } }
		 * catch(FileNotFoundException e) { e.printStackTrace(); }
		 * System.out.println("end");
		 */
		 AutoCloseObj obj = new AutoCloseObj();
	    	try (obj){
				throw new Exception();
			}catch(Exception e) {
				System.out.println("예외 부분 입니다");
			}

		
	}
	

}
