/*
 * Ŭ�������� ����ϴ� ������ �ڷ����� �������̸�, �� ���(�޼ҵ�)�� ��� ������ ���
 * Ŭ������ �ڷ����� Ư������ �ʰ� ���� �ش� Ŭ������ ����� �� ������ �� �ֵ��� ����
 * 
 * ���� ���Ǵ� �ڷ����� ��ȯ�� �����Ϸ��� ���� �����ǹǷ� �������� ���α׷��� ���
 * �÷��� �����ӿ�ũ���� ���� ����� �Ǵ� ���̴�.
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
