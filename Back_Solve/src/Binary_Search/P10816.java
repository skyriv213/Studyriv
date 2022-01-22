package Binary_Search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		// �ð� ������ ���� buffer ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		// �������� �־��� ������ ����� �ٲٱ� ���� �� �ִ������ �Է�
		int [] counting  =  new int [20000001];

		int n = Integer.parseInt(br.readLine());
		
		String [] s = br.readLine().split(" ");
				
		// ���ϰ��� �ϴ� �迭 �ε����� �� �߰�
		for(int i = 0 ; i < n;i++ ) {
			int x = Integer.parseInt(s[i]);
			counting[x+10000000]++;
			}
		
		int t = Integer.parseInt(br.readLine());
		
		int [] test = new int [t];
		
		String [] s1 = br.readLine().split(" ");
		
		// �ε��� ȣ���� ���� �迭
		for(int i = 0 ; i < t;i++) {
			test[i]= Integer.parseInt(s1[i]);
		}
	
		// �� �ε��� �迭�� ������ �ּҰ��� �ְ� ���� ���Ͽ� ��¤�
		for(int i = 0 ; i < test.length;i++) {
			bw.write(counting [test[i]+10000000] +" ");  
		}
		
		bw.flush();
		bw.close();
		
		
	}

}
