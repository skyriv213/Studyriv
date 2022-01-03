package Recursive;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P2447{
	
	static char arr[][]; // ���� ���� �迭
    
	static void star(int x,int y,int n) { // �� ��� ���ȣ�� �Լ�
		
		int count =0; // ����� Ƚ���� ���ϱ� ���� ���
		
		if(n==1) { // ����Լ� ��������, n/3�� 1�� �Ǿ��� �� ���� ����ְ� �Լ��� ����
			arr[x][y] ="*";
			return;
		}
		
		for(int i=x;i<n+x;i+=n/3) { // ���޹��� x��ǥ ����; ���ҵ� n + x��ǥ ����; n/3 �� ����
			for(int j=y;j<n+y;j+=n/3) { // ���޹��� y��ǥ ����; ���ҵ� n+y����; n/3�� ����
		
				
				if(count == 4) { // 4��°�� 0���� �ʱ�ȭ �� �ѱ��.
					count = 0;
				}else { 
					star(i,j,n/3); // �����Ͽ� ���ȣ��, ��ǥ���� ���ڷ� �ѱ��.
					count++; // �� ��������� üũ
				}
			}
		}
	}
	
    public static void main(String[] args) throws NumberFormatException, IOException{
    	BufferedReader br = 
        		new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
        		new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine()); // 3�� ��� n �Է�
        
        arr = new char[n][n]; // n x n ũ���� �迭 ����
      
        for(int i = 0 ;i < n;i++) {
        	for(int j = 0 ; j< n ;j++) {
        		Arrays.fill(arr[i], ' ');
        	}
        }
        
        star(0,0,n); // n�� ũ��, x��ǥ, y��ǥ�� ����
        
        for(int i=0;i<n;i++) { // �� ��� �� ���
        	for(int j = 0 ;j <n;j++) {
        		bw.write(arr[i][j]);
        	}
        	bw.write('\n');
        }
       bw.flush();
       bw.close();
        
    }
}