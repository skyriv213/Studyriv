package ch06;

public class Vip extends Customer {
	
	private int agentID;
	double salesRatio;
	
	/* 
	 * public Vip(){
	 * customerGrade = "VIP"; // �����߻�
	 * bonusPoint  = 0.05;
	 * salesRatio  = 0.1;
	 * 
	 * System.out.println("Vip() ������ ȣ��);
	 * 
	 */
	
	public Vip(int customerId, String customerName) {
		super(customerId,customerName);
		
		customerGrade = "Vip";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		//System.out.println("Vip(int,String) ������ ȣ��);
		
		
	}

	public int getAgentID() {
		return agentID;
	}

	// override
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + 
				"�̸�, ���ʽ� ����Ʈ�� "+ bonusPoint + "�Դϴ�";
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		price -= (int)(price*salesRatio);
		// (int)�� �ٿ��ִ� ������ ���� price�� salesRatio�� ������ ���� �Ҽ����� ǥ���� �� ���� �ֱ� ������ ������ ����ȯ�� �ϱ⶧���̴�.
		
		/*
		 * �ڵ�Ÿ�Ժ�ȯ�̸� ���� ��쿡�� ū Ÿ���� double�� �������� int�� �׳� ��ȯ�� ������ ����Ƿ�
		 * ĳ���� ������ ()�� ����Ͽ� ǥ���� ���־���. 
		 */
		return super.calcPrice(price);
	}
	
	
	


}
