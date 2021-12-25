package ch10;

public class manual extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 조작합니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("브레이크 밟아");
	}

}
