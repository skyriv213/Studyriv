package ch06;

public class Vip extends Customer {
	
	private int agentID;
	double salesRatio;
	
	/* 
	 * public Vip(){
	 * customerGrade = "VIP"; // 오류발생
	 * bonusPoint  = 0.05;
	 * salesRatio  = 0.1;
	 * 
	 * System.out.println("Vip() 생성자 호출);
	 * 
	 */
	
	public Vip(int customerId, String customerName) {
		super(customerId,customerName);
		
		customerGrade = "Vip";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		//System.out.println("Vip(int,String) 생성자 호출);
		
		
	}

	public int getAgentID() {
		return agentID;
	}

	// override
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 "+ bonusPoint + "입니다";
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		price -= (int)(price*salesRatio);
		// (int)를 붙여주는 이유는 기존 price에 salesRatio를 곱해준 값이 소수점이 표현이 될 수도 있기 떄문에 데이터 형변환을 하기때문이다.
		
		/*
		 * 자동타입변환이며 위의 경우에는 큰 타입인 double을 작은형인 int로 그냥 변환시 오류가 생기므로
		 * 캐스팅 연산자 ()을 사용하여 표현을 해주었다. 
		 */
		return super.calcPrice(price);
	}
	
	
	


}
