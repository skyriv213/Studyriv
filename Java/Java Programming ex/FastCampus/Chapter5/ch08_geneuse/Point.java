package ch08_geneuse;


public class Point<T, V> {
	
	T x;
	V y;
	
	Point(T x, V y){ // Ÿ���� ���� T,V�̸� ���ڸ��� ��Ȳ�� ���� �´� ������ ������ ����. 
		this.x = x;
		this.y = y;
	}
	
	public  T getX() {
			return x;
	}

	public V getY() {
		return y;
    }
}
