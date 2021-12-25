package ch04_Stack;
/*
 * 선입후출의 구조, ex: 프링글스, 가장 먼저 들어온 값은 아래에 배치되고 그 뒤로 
 * 들어오는 값(push)은 이제 들어온 값의 위로 쌓여진다. 추후에 값을 삭제(pop)하면 위에 들어온 값부터
 * 빠져나오기에 선입후출 구조라 한다. 
 */

import ch02_Array.MyArray; // 기존에 작성한 Array 클래스를 import하여 사용

public class MyArrayStack {
	// 변수 top과 객체 arrayStack를 선언
	int top;
	MyArray arrayStack; 
	
	public MyArrayStack()
	{ // 주어진 입력값이 없는 경우의 생성자
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size)
	{
		// size라는 변수가 주어진 생성자
		arrayStack = new MyArray(size);
		//MyArray에서 size를 넣은 객체를 생성
	}
	
	public void push(int data)
	{
		if(isFull()){
			System.out.println("stack is full");
			return;
			// 주어진 배열이 가득 채워진 경우 stack 객체는 다 채워졌다고 표기
		}
		
		arrayStack.addElement(data); // 아닐 경우 addElement(data) 메소드호출
		top++; // count 해주는 top의 갯수는 증가
	}
	
	public int pop()
	{
		if (top == 0){
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		// top이 0인경우 이미 stack이 비워졌다고 표시
		return arrayStack.removeElement(--top);
		// removeElement 메소드를 기존 top의 갯수에서 -1을 하면서 진행
		
	}
	
	public int peek()
	{
		if (top == 0){
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(top-1); // stack의 가장 상단의 값을 출력한다.
	}
	
	public int getSize()
	{
		return top; // top의 갯수가 size이다. 
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