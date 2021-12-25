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
		//stream을 생성을 하고 foreach로 하나씩 꺼내기 (람다식)
		//스트림의 경우 한번 사용하고나면 소멸, 지속적으로 메모리의 공간을 차지하는것이 아닌 계산이 필요한 한순간에만 메모리를 차지
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		
	}

}
