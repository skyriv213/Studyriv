package ch19_Decorator;

public class CoffeeTest {
	public static void main(String [] args) {
		Coffee KenyaAmericano = new KenyaAmericano(); // 커피 클래스에 케냐 아메리카노라는 이름을 가진 객체 생성 / 이때 클래스는 커피의 자식인 케냐 아메리카노로 선언
		KenyaAmericano.brewing();
		System.out.println("------------------");
		
		Coffee KenyaLatte = new Latte(KenyaAmericano); 
		// 커피라는 클래스에 케냐라떼라는 객체를 선언, 라떼는 데코레이터의 상속, 데코레이터는 커피의 상속 따라서 커피라는 객체로 선언후 라떼로 선언가능
		KenyaLatte.brewing(); // 라떼 클래스의 brewing을 받았으니 우유가 추가
		System.out.println("------------------");
		
		Mocha kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
		//기존 클래스에 각각의 새로운 클래스를 추가하여 기능을 추가시킨다.이때 추가된 기능의 역할까지 오버라
		kenyaMocha.brewing();
		System.out.println("------------------");
		
		WhippedCream etiopiaWhippedMocha = 
				new WhippedCream(new Mocha(new Latte( new EtiopiaAmericano())));
		etiopiaWhippedMocha.brewing();
		System.out.println("------------------");

	}
}
