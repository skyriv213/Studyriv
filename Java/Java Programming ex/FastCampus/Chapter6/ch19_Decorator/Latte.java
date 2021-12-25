package ch19_Decorator;

public class Latte extends Decorator {
	
	public Latte(Coffee coffee) {
		super(coffee); // Decorator의 생성자를 호출 , Decorator의 생성자 Decorator(Coffee coffee)를 호출

	}

	@Override
	public void brewing() {
		// TODO Auto-generated method stub
		super.brewing();
		System.out.println("Addding Milk");
	}
	
}
