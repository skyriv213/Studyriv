package ch06;

public class Gold extends Customer {

	double salesRatio;
	
	public Gold(int customerId, String customerName) {
		super(customerId, customerName);
		
		salesRatio =  0.1;
		bonusRatio = 0.02;
		customerGrade = "Gold";
		
		}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*salesRatio);
		
	}
	

}
