package Solve;

public class Ex3_013 {
	
	public static void check369(int x) {
	    int a = x/10;
	    int b = x%10;
		
		if(a == 3 || a == 6 || a==9 ) {
		    if(b == 3 || b==6 ||b==9) {
			System.out.println(x+" ¹Ú¼ö Â¦Â¦");
		    }
		    else {
		    	System.out.println(x+ " ¹Ú¼ö Â¦");
		    }
		}
		else if(b == 3 || b==6 ||b==9) {
	    	System.out.println(x+ " ¹Ú¼ö Â¦");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 100 ;  i++) {
			check369(i);
			
		}

	}

}
