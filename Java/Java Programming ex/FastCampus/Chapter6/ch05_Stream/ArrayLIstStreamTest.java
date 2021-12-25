package ch05_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class ArrayLIstStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> sList = new ArrayList<String>();
		sList.add("kim");
		sList.add("lee");
		sList.add("min");
		sList.add("park");

		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		//�÷��ǵ��� ���δ� ��Ʈ�� ȣ�� ����
		//���ٽ��� �͸�Ŭ������ ������ �����ϴ�.
		
		sList.stream().sorted().forEach(s->System.out.print(s + " "));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n+ " "));
		System.out.println();
		sList.stream().filter(s->s.length()>=4).forEach(s->System.out.println(s));
	}

}
