package ch08_geneuse;


public class Point<T, V> {
	
	T x;
	V y;
	
	Point(T x, V y){ // 타입은 각각 T,V이며 이자리에 상황에 따라 맞는 데이터 변수가 들어간다. 
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
