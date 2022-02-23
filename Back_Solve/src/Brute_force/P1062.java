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

	        // 무조건 배워야하는 단어  a의 아스키 코드는 97이므로 각 단어의 아스키 코드에서 97을 뺀 값을 배열에 넣어준다
	        
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
	                boolean flag = true;// 값의 체크를 위한 변수 선언

	                for (int j = 0; j < SrtArr[i].length(); j++) {
	                    /* 배우지않은 알파벳이 있는 경우 */
	                    if (!visited[SrtArr[i].charAt(j) - 'a']) {
	                        flag = false;
	                        break;
	                    }
	                }
	                // 만약 flag의 값이 true가 유지가 되는 경우 x값 ++
	                if (flag) {
	                    x++;
	                }
	            }
	            // 기존의 값과 x의 값중에 큰 값 반환
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
