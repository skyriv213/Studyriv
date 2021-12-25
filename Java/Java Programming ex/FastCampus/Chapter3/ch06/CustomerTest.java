package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> clist =  new ArrayList<>();
		
		Customer ct = new Customer(10010, "0");

		Customer ck = new Gold(10011, "1");

		Customer cm = new Customer(10012, "2");

		Customer cs = new Vip(10013, "3");

		Customer cr = new Customer(10014, "4");

		clist.add(ct);
		clist.add(ck);
		clist.add(cm);
		clist.add(cs);
		clist.add(cr);
		
		/*for(Customer cu : clist) {
			System.out.println(cu.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer cu : clist) {
			int cost =  cu.calcPrice(price);
			System.out.println(cu.getCustomerName() + "님이 " + cost + "원을 지불하였습니다");
			System.out.println(cu.getCustomerName() + "님의 보너스 포인트는 " + cu.bonusPoint + "입니다");
		}*/
		if(cm instanceof Customer) {
			Customer vc  = (Customer)cm;
			System.out.println(cm.showCustomerInfo());
		}
		
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
 * instanceof = 주어진 변수가 원래 지정된 변수의 틀이 맞는가를 확인
 * ex : 손님 2가 골드인지 그냥 고객인지 / 만약 주어진 타입과 비교하려는 타입이 맞으면 true / 틀리면 false
 * 
 * 
 */
