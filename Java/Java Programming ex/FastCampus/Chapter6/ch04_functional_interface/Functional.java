package ch04_functional_interface;

public class Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber gm = (x,y)->x+y;
		// 람다식 = 함수형 인터페이스 선언
		// 인터페이스의 구현을 바로 하여 호출
		System.out.println(gm.getMax(2, 3)); 
	}

}
