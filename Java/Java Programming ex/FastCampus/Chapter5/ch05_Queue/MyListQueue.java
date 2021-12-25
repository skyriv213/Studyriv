/*
 * ��ȣǥ ����, ���Լ��� ����
 * ������ stack�� �迭�� ���� ������ Queue�� Linkedlist�� �����Ͽ� ����
 */

package ch05_Queue;
import ch03_linked.MyLinkedList;
import ch03_linked.MyListNode;

interface IQueue{ // �������̽��� ���� ���� �޼ҵ带 ���� ����
	public void enQueue(String data);
	public String deQueue();
	public void printAll();
}

public class MyListQueue extends MyLinkedList implements IQueue{
	// MyLinkedList�� ��� �ް� , IQueue�� �������̽� �Ѵ�. 

	MyListNode front;
	MyListNode rear;
		
	// MyListNode�� �հ� �ڸ� ����
	
	public MyListQueue()
	{ // �־��� ������ ���� ����� ��ü�� ������, �հ� �ڸ� null������ ��ġ
		front = null;
		rear = null;
	}
	
	public void enQueue(String data)
	{ // enQueue ,  �־��� ������ ���� �߰��ϴ� �޼ҵ� 
		MyListNode newNode; // newNode��� ��ü�� ���� ����
		if(isEmpty())  //ó�� �׸�
		{ // isEmpty()�� ���� true�� ����
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
	
	public String deQueue() // �տ������� ���Ҹ� ����
	{
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return null;
		}
		String data = front.getData(); // data = front.getdata�� �ϸ� front�� front�� �������� �Ѿ��. 
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