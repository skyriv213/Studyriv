package Solve;

public class Ex4_004 {

	public static void main(String[] args) {
		rect r = new rect(2,2,8,7);
		rect s = new rect(5,5,6,6);
		rect t = new rect(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) 
			System.out.println("t�� r�� �����մϴ�");
		if(t.contains(s))
			System.out.println("t�� s�� �����մϴ�");
			

	}

}
class rect{
	
	private static int a,b,c,d;
	
	public rect() {} // �⺻������
	
	public rect(int a, int b, int c, int d) { //�Ű����� ������
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public void show() {
		System.out.println("�簢���� ���̴�"+rect.square());
	//	Systme.out.println("("+  )
	}
	public static int square() {
		return (c-b)*(d-a);
	}
	public boolean contains(rect r) {
		if(a >= rect.a && b >= rect.b && c >= rect.c && d>=rect.d)
			return true;
		else {
			return false;
		}
				}
			}
		
		
	

