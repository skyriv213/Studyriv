package Solve;

public class Ex4_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
class TV {
	String 제조사;
	int 년도, 크기;
	public TV(String 제조사, int 년도 , int 크기) {
		this.제조사 =  제조사;
		this.년도 =  년도;
		this.크기 = 크기;
		}
	public void show() {
		System.out.print(제조사 + "에서 만든 " + 년도 +"년형 " + 크기 + "인치 TV");		
	}
}
// static 모두가 함께 공유하는 자원
// 개인만 소유하는 개인만 소지하는 그런 자원