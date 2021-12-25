/*
 * 번호표 생각, 선입선출 구조
 * 이전의 stack을 배열로 선언 했으니 Queue를 Linkedlist로 선언하여 구현
 */

package ch05_Queue;
import ch03_linked.MyLinkedList;
import ch03_linked.MyListNode;

interface IQueue{ // 인터페이스로 먼저 만들 메소드를 먼저 선언
	public void enQueue(String data);
	public String deQueue();
	public void printAll();
}

public class MyListQueue extends MyLinkedList implements IQueue{
	// MyLinkedList를 상속 받고 , IQueue를 인터페이스 한다. 

	MyListNode front;
	MyListNode rear;
		
	// MyListNode로 앞과 뒤를 선언
	
	public MyListQueue()
	{ // 주어진 변수가 없을 경우의 객체의 생성자, 앞과 뒤를 null값으로 배치
		front = null;
		rear = null;
	}
	
	public void enQueue(String data)
	{ // enQueue ,  주어진 데이터 값을 추가하는 메소드 
		MyListNode newNode; // newNode라는 객체를 새로 생성
		if(isEmpty())  //처음 항목
		{ // isEmpty()의 값이 true면 진행
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else
		{
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + " added");
	}
	
	public String deQueue() // 앞에서부터 원소를 삭제
	{
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return null;
		}
		String data = front.getData(); // data = front.getdata로 하며 front는 front의 다음으로 넘어간다. 
		front = front.next;
		if( front == null ){ 
			rear = null;
		}
		return data;
	}
	
	public void printAll()
	{
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		MyListNode temp = front;
		while(temp!= null){
			System.out.print(temp.getData() + ",");
			temp = temp.next;
		}
		System.out.println();
	}
}