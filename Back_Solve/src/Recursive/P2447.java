package Recursive;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P2447{
	
	static char arr[][]; // 별을 찍을 배열
    
	static void star(int x,int y,int n) { // 별 찍기 재귀호출 함수
		
		int count =0; // 재귀의 횟수를 정하기 위해 사용
		
		if(n==1) { // 재귀함수 종료조건, n/3이 1이 되었을 땐 별을 찍어주고 함수를 종료
			arr[x][y] ="*";
			return;
		}
		
		for(int i=x;i<n+x;i+=n/3) { // 전달받은 x좌표 시작; 분할된 n + x좌표 까지; n/3 씩 증가
			for(int j=y;j<n+y;j+=n/3) { // 전달받은 y좌표 시작; 분할된 n+y까지; n/3씩 증가
		
				
				if(count == 4) { // 4번째면 0으로 초기화 후 넘긴다.
					count = 0;
				}else { 
					star(i,j,n/3); // 분할하여 재귀호출, 좌표값을 인자로 넘긴다.
					count++; // 몇 번찍었는지 체크
				}
			}
		}
	}
	
    public static void main(String[] args) throws NumberFormatException, IOException{
    	BufferedReader br = 
        		new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
        		new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine()); // 3의 배수 n 입력
        
        arr = new char[n][n]; // n x n 크기의 배열 생성
      
        for(int i = 0 ;i < n;i++) {
        	for(int j = 0 ; j< n ;j++) {
        		Arrays.fill(arr[i], ' ');
        	}
        }
        
        star(0,0,n); // n의 크기, x좌표, y좌표를 전달
        
        for(int i=0;i<n;i++) { // 별 찍기 판 출력
        	for(int j = 0 ;j <n;j++) {
        		bw.write(arr[i][j]);
        	}
        	bw.write('\n');
        }
       bw.flush();
       bw.close();
        
    }
}