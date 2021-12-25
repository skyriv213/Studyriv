package ch04_functional_interface;

@FunctionalInterface

public interface MyNumber {
	int getMax(int num1, int num2);
}

/*
 * 함수형 인터페이스
 * 
 * 람다식을 선언하기 위한 인터페이스
 * 
 * 익명 함수와 매개 변수만으로 구현되므로 인터페이스는 단 하나의 메소드만을 선언
 * 
 * @FunctionalInterface @애노테이션(annotation) 함수형 인터페이스라는 의미, 내부의 여러 개의 메소드를 선언하면
 * 에러
 */