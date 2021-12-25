package ch06;

public class Customer {
	
	protected int customerId;
	protected String customerName, customerGrade ;
	int bonusPoint; // default�� ����
	double bonusRatio; 
	
	/*
	 * public Customer(){
	 * customerGrade =  "Silver";
	 * bonusRatio = 0.01;
	 * 
	 * Systme.out.println("Customer() ������ ȣ��);
	 */
	
	public Customer(int customerId,  String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		
		customerGrade  = "Silver";
		bonusRatio = 0.01;
		// System.out.println("Customer(int, String) ������ ȣ��);
	
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + 
				"�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�";
	}

}
