package ch19_Decorator;

public class WhippedCream extends Decorator {

	public WhippedCream(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void brewing() {
		// TODO Auto-generated method stub
		super.brewing();
		System.out.println("Adding WhippedCream");
	}

	
	
}
