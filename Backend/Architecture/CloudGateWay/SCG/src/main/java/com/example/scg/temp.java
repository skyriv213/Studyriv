package com.example.scg;

import java.util.*;
import java.io.*;

public class temp {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        s = br.readLine().split(" ");

        int[] num = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        int[] arr = new int[m];

        for (int i : num) {
            arr[i] += 1;
        }

        int res = 0;
        for (int i : num) {
            n -= arr[i];
            res += arr[i] * n;
        }
        System.out.println(res);

    }
}
