package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1062 {

	 static int n;
	    static int k;
	    static boolean[] visited;
	    static String[] SrtArr;
	    static int answer = 0;

	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        String[] input = br.readLine().split(" ");

	        n = Integer.parseInt(input[0]);
	        k = Integer.parseInt(input[1]);

	        visited = new boolean[26];
	        SrtArr = new String[n];

	        if (k < 5) {
	            System.out.println(0);
	            return;
	        } else if (k == 26) {
	            System.out.println(n);
	            return;
	        }

	        // ������ ������ϴ� �ܾ�  a�� �ƽ�Ű �ڵ�� 97�̹Ƿ� �� �ܾ��� �ƽ�Ű �ڵ忡�� 97�� �� ���� �迭�� �־��ش�
	        
	        visited['a' - 97] = true;
	        visited['n' - 97] = true;
	        visited['t' - 97] = true;
	        visited['i' - 97] = true;
	        visited['c' - 97] = true;

	        for (int i = 0; i < n; i++) {
	            String str = br.readLine().replaceAll("anta|tica", "");

	            SrtArr[i] = str;
	        }

	        check(0, 0);
	        System.out.println(answer);
	    }

	    static void check(int alpha, int count) {
	    	
	        if (count == k - 5) {
	            int x = 0;
	            for (int i = 0; i < n; i++) {
	                boolean flag = true;// ���� üũ�� ���� ���� ����

	                for (int j = 0; j < SrtArr[i].length(); j++) {
	                    /* ��������� ���ĺ��� �ִ� ��� */
	                    if (!visited[SrtArr[i].charAt(j) - 'a']) {
	                        flag = false;
	                        break;
	                    }
	                }
	                // ���� flag�� ���� true�� ������ �Ǵ� ��� x�� ++
	                if (flag) {
	                    x++;
	                }
	            }
	            // ������ ���� x�� ���߿� ū �� ��ȯ
	            answer = Math.max(x, answer);
	            return;
	        }
	        
	        for (int i = alpha; i < 26; i++) {
	            if (!visited[i]) {
	                visited[i] = true;
	                check(i, count + 1);
	                visited[i] = false;
	            }
	        }
	    }

	}
