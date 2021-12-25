package ch19_Decorator;

public class Latte extends Decorator {
	
	public Latte(Coffee coffee) {
		super(coffee); // Decorator�� �����ڸ� ȣ�� , Decorator�� ������ Decorator(Coffee coffee)�� ȣ��

	}

	@Override
	public void brewing() {
		// TODO Auto-generated method stub
		super.brewing();
		System.out.println("Addding Milk");
	}
	
}
