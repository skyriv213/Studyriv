package ch03_linked;

public class MyLinkedList {

	private MyListNode head;
	int count;
	
	public MyLinkedList()
	{
		head = null;
		count = 0;
	}
	
	public MyListNode addElement( String data )
	{
		
		MyListNode newNode; // MyListNode Ŭ������ ��ü�� ����
		
		if(head == null){  //�� ó���϶�, head�� ��������� ��� 
			newNode = new MyListNode(data); // newNode�� ���� NyListNode�� data�� �� ������ ����
			head = newNode; // head �� ���� newNode�� ���ٰ� ����
		}
		else{ // head�� ��������� ���� ���
			newNode = new MyListNode(data); // newNode�� ���� �����Ͱ� �Էµ� ����� �����ڷ� ����
			MyListNode temp = head; //temp ����� ���� head�� �����ϴٰ� ����
			while(temp.next != null)  //�� �ڷ� ����  tmep.next�� null�� �ƴҰ����� �ݺ�
				temp = temp.next; // temp�� ���� temp.next�� ����Ŵ
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data )
	{
		int i; // position�� ���ϰ� ���ϰ� ã������ i����
		MyListNode tempNode = head; // �Ͻ����� ���� head�� ���ٰ� ����
		MyListNode newNode = new MyListNode(data); // newNode�� ��� ������ ����Ͽ� ����
		
		if(position < 0 || position > count ){ // position�� 0���� �۰ų� count�� ��� ���
			System.out.println("�߰� �� ��ġ ���� �Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null;
		}
		
		if(position == 0){  //�� ������ ���� ���
			newNode.next = head;
			head = newNode;
		}
		else{
			MyListNode preNode = null;	// ������尡 ����� �������
			for(i=0; i<position; i++){ // position���� ���������� �ݺ�
				preNode = tempNode; // ������ ���� �ӽ� ���� ���ٰ� ���
				tempNode = tempNode.next; // �׸��� ������ temp����� ���� ���� temp���� ���ٰ� ����, �̷��� �������� 
				
			}
			newNode.next = preNode.next; // �ݺ����� ������ newNode�� ���� ���� ����� ���� �����ϴٰ� ����
			preNode.next = newNode; // ��������� ���� ���� ����� ���·� newNode�� �����ϴٰ� ����
		}
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		if(position >= count ){
			System.out.println("���� �� ��ġ �����Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null;
		}
		
		if(position == 0){  //�� ���� �����ϴ�
			head = tempNode.next;// head ��ü�� ���� ���� �����ϴٰ� ����
		}
		else{
			for(i=0; i<position; i++){
				preNode = tempNode; // preNode�� �������� ���ٰ� ����
				tempNode = tempNode.next; // temp��带 ���� ���� ���ٰ� ����
			}
			preNode.next = tempNode.next; // position�� �������� �ݺ����� ����� ��������� �ӽó���� ���� ���������µ� �̶� ���� null�� �ȴ�.
		}
		count--; // ��ü�� ���� �����ִ� count�� �پ���. 
		System.out.println(position + "��° �׸� �����Ǿ����ϴ�.");
		
		return tempNode;
	}
	
	public String getElement(int position) // ���ϴ� ���Ҹ� ã�� �޼ҵ�
	{
		int i; // position�� ��ġ�� ã�� ���� ���� i����
		MyListNode tempNode = head; // �ӽó�带 �ص�� ����
		 
		if(position >= count ){ // �־��� �������� ��ü ��ü�� ������ ū ���, error�� ���
			System.out.println("�˻� ��ġ ���� �Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return new String("error");
		}
		
		if(position == 0){  //�� �� ���

			return head.getData(); // �ٷ� head�� data�� ���
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next; //i�� position�� �������� �������� �ݺ�
			
		}
		return tempNode.getData(); // �ش� tempNode�� data�� ���
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("�˻� ��ġ ���� �Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null;
		}
		
		if(position == 0){  //�� �� ���

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll() // head�� null ������ �����ϰ� �̷��� count�� ���� 0���� �ؼ� �˻� �Ұ�
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count; // LinkedList�� ũ�⸦ �˾ƺ��� �޼ҵ� , count�� ��ȯ�Ѵ�. int�� �޼ҵ�� int���� ��ȯ�Ѵ� .
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("����� ������ �����ϴ�.");
			return;
		} // count�� 0�ϰ��
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	/*
	 * temp�� head�� ����ְ� temp�� null�� �ƴҶ����� �ݺ�
	 * ���������� temp�� data���� �����ϸ�, ������ �Ѵ�.
	 */
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
		// LinkedList�� ������ִ��� Ȯ��, �־��� head���� null�� ��� �� �ڿ� ����Ʈ���� ���Ұ� ����. null�� ������ t/f�� �Ǻ�
	}
	
}




