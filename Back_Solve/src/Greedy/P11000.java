package Greedy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P11000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		lecture [] lec = new lecture[n];
		PriorityQueue<Integer> p = new PriorityQueue<>();
		
		for(int i = 0 ; i <n;i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			lec[i]=new lecture(s,e);
		}
		// comparable 덕분에 정렬기준이 잡힘
		Arrays.sort(lec);
		
		// 정렬된 가장 처음값의 end값을 우선순위 큐에 저장
		p.offer(lec[0].end);
		
		// 반복문 시행, 만약 시작값이 우선순위 큐 가장 위의 값보다 크거나 같을시 우선 순위 큐 값의 가장 윗부분을 제거,
		// 만약 그게 아닐경우 end값을 입력, 이러한 경우로 사이즈를 늘려나가며 사이즈가 늘어가는 것은 사용하는 강의실의 갯수가 많아진다는것
		for(int i =1;i<n;i++) {
			if(lec[i].start>=p.peek()) {
				p.poll();
			}
			p.offer(lec[i].end);
			
		}
		System.out.println(p.size());

	}

}

class lecture implements Comparable<lecture> {
	int start, end;

	public lecture(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(lecture o) {
		// TODO Auto-generated method stub
		if (start == o.start) {
			return end - o.end;
		}
		return start - o.start;
	}

}