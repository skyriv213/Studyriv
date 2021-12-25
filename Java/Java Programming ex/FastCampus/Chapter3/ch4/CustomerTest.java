package ch4;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer Lee  =  new Customer(10010, "이순신");
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showCustomerInfo());
		
		Vip kim = new Vip(10020, "김유신");
		kim.bonusPoint = 10000;
		System.out.println(kim.showCustomerInfo());
		
		
		int priceLee = Lee.calcPrice(10000);
		int pricekim = kim.calcPrice(10000);
		
		System.out.println(Lee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다");
		System.out.println(kim.showCustomerInfo() + " 지불금액은 " + pricekim + "원 입니다");
		
		Customer no  =  new Vip(10030, "나몰라");
		no.bonusPoint = 10000;
		int priceno = no.calcPrice(10000);
		System.out.println(no.showCustomerInfo() + " 지불금액은 " + priceno + "원 입니다.");
		

	}

}

/*
 * @overriding 애노테이션(annotation)
 * 애노테이션 = 주석
 * 컴파일러에게 특별한 정보를 제공해주는 역할
 * 
 * @Overriding  = 재정의된 메소드라는 정보 제공
 * 
 * @FunctionalInterface = 함수형 인터페이스라는 정보 제공
 * 
 * @Deprecated = 이후 버전에서 사용되지 않을 수 있는 변수, 메소드에 사용됨
 * 
 * @SuppressWarnig = 특정 경고가 나타나지 않도록 함
 * ex :  @SuppressWarning("deprecation")는 @Deprecarted가 나타나지 않도록 함
 * 
 * 
 * 
 * 
 */
