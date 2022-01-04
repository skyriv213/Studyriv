package Etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class P1990 {
		
	static BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(
			new OutputStreamWriter(System.out));

	static void number(int x) throws IOException {
		String s = Integer.toString(x);
		if(s.equals(new StringBuffer(s).reverse().toString())) {
			bw.write(Integer.toString(x) + "\n");
		}
		
	}
	
	public static void main(String [] args) throws IOException {
		
		String [] s = br.readLine().split(" ");
				
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		// �迭�� ũ��� b���� ��ƾ��ϹǷ� ũ�⸦ ����
		boolean [] arr1 = new boolean [b+1];
		
		//�ʱⰪ�� ���δ� true�� ����
		Arrays.fill(arr1, true);
		// 0,1�� üũ�������� �����̹Ƿ� false�� ����
		arr1[0] = arr1[1]= false;
		
		// �����佺�׳׽��� ü ����
		for(int i = 2 ; i <= b;i++) {
			// false�Ͻ� ������ üũ�����ʰ� �ٷ� �Ѿ��
			if(arr1[i]==false) {
				continue;
			}
			// false üũ ���ֱ�
			for(int  j = i*2;j<=b;j+=i) {
				arr1[j]=false;
			}
			if(arr1[i]==true && i>=a) {
				number(i);
			}
		}
		
		bw.write(Integer.toString(-1));
		bw.flush();
		bw.close();
	
		

	}

}
