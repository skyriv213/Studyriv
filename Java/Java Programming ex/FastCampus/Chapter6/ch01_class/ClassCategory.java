package ch01_class;

public class ClassCategory {

}
/*
 * 내부클래스란? 
 * 클래스 내부에 선언된 클래스, 이 클래스를 감싸고 있는 외부 클래스와 밀접한 연관이 있는 경우가 많다
 * 다른 외부 클래스에서 사용할 일이 거의 없는 경우에 내부 클래스를 선언해서 사용함
 * -중첩 클래스라고 함
 * 인스턴스 / 정적(static) / 지역(local) / 익명(anonymous) 내부 클래스가 존재한다.
 * 
 * 인스턴스 내부 클래스
 * 내부적으로 사용할 클래스를 선언(private로 선언하는 것을 권장)
 * 외부 클래스가 생성된 후 생성된다.
 * private이 아닌 내부 클래스는 다른 외부 클래스에서 생성할 수 있음.
 * OutClass outclass = new Outclass();
 * OutClass.Inclass inclass = OutClass.new InClass():
 * 
 */

/*
 * class OutClass{ private int num = 10; private static int sNum = 20; private
 * InClass inclass; public OutClass }
 */