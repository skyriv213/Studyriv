package ch10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		
		System.out.println("�õ��� �մϴ�");
	}
	public void turnoff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	final public void run() {
		startCar();
		drive();
		stop();
		turnoff();
		
	}

}

/*
 * �߻�޼ҵ�
 * �޼ҵ��� ����κ� {} �� �����Ͽ� ����� �ް� �Ǵ� ���� �޼ҵ忡 ���������� ���Ǹ� ��Ű�� �� �� �ִ�. 
 * �̴� ����� �޴� Ŭ�������� �������̵带 ���� �����Ǹ� ����� �Ѵ�. 
 */
