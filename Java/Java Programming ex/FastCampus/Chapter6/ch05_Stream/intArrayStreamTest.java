package ch05_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class intArrayStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5};
		
		for(int num:arr) {
			System.out.println(num);
		}
		
		System.out.println();
		IntStream is = Arrays.stream(arr);

		is.forEach(n->System.out.println(n));
		//stream�� ������ �ϰ� foreach�� �ϳ��� ������ (���ٽ�)
		//��Ʈ���� ��� �ѹ� ����ϰ��� �Ҹ�, ���������� �޸��� ������ �����ϴ°��� �ƴ� ����� �ʿ��� �Ѽ������� �޸𸮸� ����
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		
	}

}
