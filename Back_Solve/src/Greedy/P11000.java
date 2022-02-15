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
		// comparable ���п� ���ı����� ����
		Arrays.sort(lec);
		
		// ���ĵ� ���� ó������ end���� �켱���� ť�� ����
		p.offer(lec[0].end);
		
		// �ݺ��� ����, ���� ���۰��� �켱���� ť ���� ���� ������ ũ�ų� ������ �켱 ���� ť ���� ���� ���κ��� ����,
		// ���� �װ� �ƴҰ�� end���� �Է�, �̷��� ���� ����� �÷������� ����� �þ�� ���� ����ϴ� ���ǽ��� ������ �������ٴ°�
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