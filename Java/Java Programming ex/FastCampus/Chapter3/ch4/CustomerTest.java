package ch4;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer Lee  =  new Customer(10010, "�̼���");
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showCustomerInfo());
		
		Vip kim = new Vip(10020, "������");
		kim.bonusPoint = 10000;
		System.out.println(kim.showCustomerInfo());
		
		
		int priceLee = Lee.calcPrice(10000);
		int pricekim = kim.calcPrice(10000);
		
		System.out.println(Lee.showCustomerInfo() + " ���ұݾ��� " + priceLee + "�� �Դϴ�");
		System.out.println(kim.showCustomerInfo() + " ���ұݾ��� " + pricekim + "�� �Դϴ�");
		
		Customer no  =  new Vip(10030, "������");
		no.bonusPoint = 10000;
		int priceno = no.calcPrice(10000);
		System.out.println(no.showCustomerInfo() + " ���ұݾ��� " + priceno + "�� �Դϴ�.");
		

	}

}

/*
 * @overriding �ֳ����̼�(annotation)
 * �ֳ����̼� = �ּ�
 * �����Ϸ����� Ư���� ������ �������ִ� ����
 * 
 * @Overriding  = �����ǵ� �޼ҵ��� ���� ����
 * 
 * @FunctionalInterface = �Լ��� �������̽���� ���� ����
 * 
 * @Deprecated = ���� �������� ������ ���� �� �ִ� ����, �޼ҵ忡 ����
 * 
 * @SuppressWarnig = Ư�� ��� ��Ÿ���� �ʵ��� ��
 * ex :  @SuppressWarning("deprecation")�� @Deprecarted�� ��Ÿ���� �ʵ��� ��
 * 
 * 
 * 
 * 
 */
