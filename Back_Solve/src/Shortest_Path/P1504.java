package Shortest_Path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
 
class N5 implements Comparable<N5> {
    int e;
    int w;
 
    public N5(int e, int w) {
        this.e = e;
        this.w = w;
    }
 
    @Override
    public int compareTo(N5 o) {
        return w - o.w;
    }
 
}
 
public class P1504 {
    static int N, E;
    static ArrayList<ArrayList<N5>> a; // 인접리스트.
    static int[] res; // 시작점에서 각 정점으로 가는 최단거리.
    static boolean[] check; // 방문 확인.
    static final int INF = 200000000;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
 
        a = new ArrayList<>();
        res = new int[N + 1];
        check = new boolean[N + 1];
  
        for (int i = 0; i <= N; i++) {
            a.add(new ArrayList<>());
        }
 
        // 양방향 인접 리스트 구현.
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
 
            // s에서 e로 가는 w (가중치)
            a.get(s).add(new N5(e, w));
 
            // e에서 s로 가는 w (가중치)
            a.get(e).add(new N5(s, w));
        }
 
        // 반드시 거쳐야 하는 정점.
        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());
 
        // 1 -> v1 -> v2 -> N으로 가는 경우
        int res1 = 0;
        res1 += dijkstra(1, v1);
        res1 += dijkstra(v1, v2);
        res1 += dijkstra(v2, N);
 
        // 1 -> v2 -> v1 -> N으로 가는 경우
        int res2 = 0;
        res2 += dijkstra(1, v2);
        res2 += dijkstra(v2, v1);
        res2 += dijkstra(v1, N);
        
        
        int ans = 0;
        if(res1 >= INF && res2 >= INF) {
        	ans = -1;
        }
        else {
        	ans = Math.min(res1, res2);
        }
 
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
    // 다익스트라 알고리즘
    public static int dijkstra(int s, int e) {
    	// 매순간 새롭게 구간을 구해서 설정하기에 각 결과값 부분에 fill로 초기화를 해줘야함
        Arrays.fill(res, INF);
        Arrays.fill(check, false);
 
        PriorityQueue<N5> pq = new PriorityQueue<>();
        pq.offer(new N5(s, 0));
        res[s] = 0;
 
        while (!pq.isEmpty()) {
            N5 curN5 = pq.poll();
            int cur = curN5.e;
            
            // 지나지 않았으니 넣고 반복문 진행
            if (!check[cur]) {
                check[cur] = true;
 
                for (N5 N5 : a.get(cur)) {
                    if (!check[N5.e] && res[N5.e] > res[cur] + N5.w) {
                        res[N5.e] = res[cur] + N5.w;
                        pq.add(new N5(N5.e, res[N5.e]));
                    }
                }
            }
        }
 
        return res[e];
    }
}
