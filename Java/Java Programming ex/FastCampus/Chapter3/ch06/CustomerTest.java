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
			System.out.println(cu.getCustomerName() + "���� " + cost + "���� �����Ͽ����ϴ�");
			System.out.println(cu.getCustomerName() + "���� ���ʽ� ����Ʈ�� " + cu.bonusPoint + "�Դϴ�");
		}*/
		if(cm instanceof Customer) {
			Customer vc  = (Customer)cm;
			System.out.println(cm.showCustomerInfo());
		}
		
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
 * instanceof = �־��� ������ ���� ������ ������ Ʋ�� �´°��� Ȯ��
 * ex : �մ� 2�� ������� �׳� ������ / ���� �־��� Ÿ�԰� ���Ϸ��� Ÿ���� ������ true / Ʋ���� false
 * 
 * 
 */
