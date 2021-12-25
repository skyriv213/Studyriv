/*
 * 클래스에서 사용하는 변수의 자료형이 여러개이며, 그 기능(메소드)은 모두 동일한 경우
 * 클래스의 자료형을 특정하지 않고 추후 해당 클래스를 사용할 때 지정할 수 있도록 선언
 * 
 * 실제 사용되는 자료형의 변환은 컴파일러에 의해 검증되므로 안정적인 프로그래밍 방식
 * 컬렉션 프레임워크에서 많이 사용이 되는 중이다.
 * 
 */

package ch06_Generic;

public class GenericPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString(){
		return material.toString();
	}

}
