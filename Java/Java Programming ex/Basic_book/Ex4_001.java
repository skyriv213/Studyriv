package Solve;

public class Ex4_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
class TV {
	String ������;
	int �⵵, ũ��;
	public TV(String ������, int �⵵ , int ũ��) {
		this.������ =  ������;
		this.�⵵ =  �⵵;
		this.ũ�� = ũ��;
		}
	public void show() {
		System.out.print(������ + "���� ���� " + �⵵ +"���� " + ũ�� + "��ġ TV");		
	}
}
// static ��ΰ� �Բ� �����ϴ� �ڿ�
// ���θ� �����ϴ� ���θ� �����ϴ� �׷� �ڿ�