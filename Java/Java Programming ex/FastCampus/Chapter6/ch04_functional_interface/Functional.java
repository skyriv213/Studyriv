package ch04_functional_interface;

public class Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber gm = (x,y)->x+y;
		// ���ٽ� = �Լ��� �������̽� ����
		// �������̽��� ������ �ٷ� �Ͽ� ȣ��
		System.out.println(gm.getMax(2, 3)); 
	}

}
