package ch10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		
		System.out.println("시동을 켭니다");
	}
	public void turnoff() {
		System.out.println("시동을 끕니다.");
	}
	final public void run() {
		startCar();
		drive();
		stop();
		turnoff();
		
	}

}

/*
 * 추상메소드
 * 메소드의 몸통부분 {} 을 생략하여 상속을 받게 되는 하위 메소드에 강제적으로 정의를 시키게 할 수 있다. 
 * 이는 상속을 받는 클래스에서 오버라이드를 통해 재정의를 해줘야 한다. 
 */
