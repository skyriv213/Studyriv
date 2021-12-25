package ch04_Stack;
/*
 * ���������� ����, ex: �����۽�, ���� ���� ���� ���� �Ʒ��� ��ġ�ǰ� �� �ڷ� 
 * ������ ��(push)�� ���� ���� ���� ���� �׿�����. ���Ŀ� ���� ����(pop)�ϸ� ���� ���� ������
 * ���������⿡ �������� ������ �Ѵ�. 
 */

import ch02_Array.MyArray; // ������ �ۼ��� Array Ŭ������ import�Ͽ� ���

public class MyArrayStack {
	// ���� top�� ��ü arrayStack�� ����
	int top;
	MyArray arrayStack; 
	
	public MyArrayStack()
	{ // �־��� �Է°��� ���� ����� ������
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size)
	{
		// size��� ������ �־��� ������
		arrayStack = new MyArray(size);
		//MyArray���� size�� ���� ��ü�� ����
	}
	
	public void push(int data)
	{
		if(isFull()){
			System.out.println("stack is full");
			return;
			// �־��� �迭�� ���� ä���� ��� stack ��ü�� �� ä�����ٰ� ǥ��
		}
		
		arrayStack.addElement(data); // �ƴ� ��� addElement(data) �޼ҵ�ȣ��
		top++; // count ���ִ� top�� ������ ����
	}
	
	public int pop()
	{
		if (top == 0){
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		// top�� 0�ΰ�� �̹� stack�� ������ٰ� ǥ��
		return arrayStack.removeElement(--top);
		// removeElement �޼ҵ带 ���� top�� �������� -1�� �ϸ鼭 ����
		
	}
	
	public int peek()
	{
		if (top == 0){
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(top-1); // stack�� ���� ����� ���� ����Ѵ�.
	}
	
	public int getSize()
	{
		return top; // top�� ������ size�̴�. 
	}
	
	public boolean isFull()
	{
		if(top == arrayStack.ARRAY_SIZE){
			return true;
		}
		else return false;
	}
	
	public boolean isEmpty()
	{
		if (top == 0){
			return true;
		}
		else return false;
	}
	
	public void printAll()
	{
		arrayStack.printAll();
	}
}