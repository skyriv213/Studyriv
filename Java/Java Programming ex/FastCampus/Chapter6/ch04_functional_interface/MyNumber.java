package ch04_functional_interface;

@FunctionalInterface

public interface MyNumber {
	int getMax(int num1, int num2);
}

/*
 * �Լ��� �������̽�
 * 
 * ���ٽ��� �����ϱ� ���� �������̽�
 * 
 * �͸� �Լ��� �Ű� ���������� �����ǹǷ� �������̽��� �� �ϳ��� �޼ҵ常�� ����
 * 
 * @FunctionalInterface @�ֳ����̼�(annotation) �Լ��� �������̽���� �ǹ�, ������ ���� ���� �޼ҵ带 �����ϸ�
 * ����
 */