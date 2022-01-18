package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		// ����� �ε����� �� ����� �ð��� ���� �������ֱ� ���� map�� ���
		// hash�� ��� �ӵ��� ���� �����⿡ ���
		
		int [] n = new int[Integer.parseInt(br.readLine())];
		
		int a = 0;
		int b = 0;
		
		String [] s = br.readLine().split(" ");
		
		for(int i = 0 ; i < n.length; i++) {
			n[i] = (Integer.parseInt(s[i]));
		}
		Arrays.sort(n);
		b=0;
		for(int i =0; i < n.length;i++) {
			a+=n[i];
			b+=a;
		}
		//������ ������ �� ����� ���� �����ϴ� �ּ��� �ð��� ���̴�.
		bw.write(Integer.toString(b));
		bw.flush();
		bw.close();
		                                                                                                                                                                    

	}

}
