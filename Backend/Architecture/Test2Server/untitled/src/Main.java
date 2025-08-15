//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.io.*;
import java.util.*;


// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int n,a,b;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[][] arr = new int[26][26];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();

            a= (int) temp.charAt(0);
            b = (int) temp.charAt(temp.length()-1);

        }
    }

}
