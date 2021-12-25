package ch10;

public class aicar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자율주행을 합니다");
		System.out.println("자동차가 스스로 방향을 바꿉니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("장애물 발견");
	}

}
