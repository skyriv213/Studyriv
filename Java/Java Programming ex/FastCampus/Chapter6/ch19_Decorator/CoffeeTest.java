package ch19_Decorator;

public class CoffeeTest {
	public static void main(String [] args) {
		Coffee KenyaAmericano = new KenyaAmericano(); // Ŀ�� Ŭ������ �ɳ� �Ƹ޸�ī���� �̸��� ���� ��ü ���� / �̶� Ŭ������ Ŀ���� �ڽ��� �ɳ� �Ƹ޸�ī��� ����
		KenyaAmericano.brewing();
		System.out.println("------------------");
		
		Coffee KenyaLatte = new Latte(KenyaAmericano); 
		// Ŀ�Ƕ�� Ŭ������ �ɳĶ󶼶�� ��ü�� ����, �󶼴� ���ڷ������� ���, ���ڷ����ʹ� Ŀ���� ��� ���� Ŀ�Ƕ�� ��ü�� ������ �󶼷� ���𰡴�
		KenyaLatte.brewing(); // �� Ŭ������ brewing�� �޾����� ������ �߰�
		System.out.println("------------------");
		
		Mocha kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
		//���� Ŭ������ ������ ���ο� Ŭ������ �߰��Ͽ� ����� �߰���Ų��.�̶� �߰��� ����� ���ұ��� ������
		kenyaMocha.brewing();
		System.out.println("------------------");
		
		WhippedCream etiopiaWhippedMocha = 
				new WhippedCream(new Mocha(new Latte( new EtiopiaAmericano())));
		etiopiaWhippedMocha.brewing();
		System.out.println("------------------");

	}
}
