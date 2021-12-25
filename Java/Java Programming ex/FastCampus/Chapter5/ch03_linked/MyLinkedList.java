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
		
		MyListNode newNode; // MyListNode 클래스의 객체를 선언
		
		if(head == null){  //맨 처음일때, head가 비워져있을 경우 
			newNode = new MyListNode(data); // newNode의 값은 NyListNode의 data가 들어간 값으로 선언
			head = newNode; // head 의 값은 newNode와 같다고 선언
		}
		else{ // head가 비워져있지 않을 경우
			newNode = new MyListNode(data); // newNode의 값을 데이터가 입력된 경우의 생성자로 선언
			MyListNode temp = head; //temp 노드의 값은 head와 동일하다고 선언
			while(temp.next != null)  //맨 뒤로 가서  tmep.next가 null이 아닐경우까지 반복
				temp = temp.next; // temp의 값은 temp.next를 가르킴
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data )
	{
		int i; // position과 비교하고 정하고 찾기위해 i선언
		MyListNode tempNode = head; // 일시적인 노드는 head와 같다고 선언
		MyListNode newNode = new MyListNode(data); // newNode의 경우 생성자 사용하여 선언
		
		if(position < 0 || position > count ){ // position이 0보다 작거나 count를 벗어난 경우
			System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞으로 들어가는 경우
			newNode.next = head;
			head = newNode;
		}
		else{
			MyListNode preNode = null;	// 이전노드가 비워져 있을경우
			for(i=0; i<position; i++){ // position보다 작을떄까지 반복
				preNode = tempNode; // 이전의 노드는 임시 노드와 같다고 명령
				tempNode = tempNode.next; // 그리고 들어오는 temp노드의 값은 다음 temp노드와 같다고 선언, 이러한 과정으로 
				
			}
			newNode.next = preNode.next; // 반복문이 끝나면 newNode의 값은 이전 노드의 값과 동일하다고 선언
			preNode.next = newNode; // 이전노드의 값은 이제 비워진 상태로 newNode와 동일하다고 선언
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
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞을 삭제하는
			head = tempNode.next;// head 객체를 다음 노드와 동일하다고 선언
		}
		else{
			for(i=0; i<position; i++){
				preNode = tempNode; // preNode를 다음노드와 같다고 선언
				tempNode = tempNode.next; // temp노드를 다음 노드와 같다고 선언
			}
			preNode.next = tempNode.next; // position과 같아져서 반복문이 종료시 이전노드의 임시노드의 값과 동일해지는데 이때 값은 null이 된다.
		}
		count--; // 개체의 수를 세어주는 count는 줄어든다. 
		System.out.println(position + "번째 항목 삭제되었습니다.");
		
		return tempNode;
	}
	
	public String getElement(int position) // 원하는 원소를 찾는 메소드
	{
		int i; // position의 위치를 찾기 위해 변수 i선언
		MyListNode tempNode = head; // 임시노드를 해드로 선언
		 
		if(position >= count ){ // 주어진 포지션이 전체 객체의 수보다 큰 경우, error를 출력
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0){  //맨 인 경우

			return head.getData(); // 바로 head의 data를 출력
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next; //i가 position과 같아지기 전까지만 반복
			
		}
		return tempNode.getData(); // 해당 tempNode의 data를 출력
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll() // head를 null 값으로 변경하고 이러한 count의 값을 0으로 해서 검색 불가
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count; // LinkedList의 크기를 알아보는 메소드 , count를 반환한다. int형 메소드로 int값을 반환한다 .
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		} // count가 0일경우
		
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
	 * temp를 head로 잡아주고 temp가 null이 아닐때까지 반복
	 * 지속적으로 temp의 data값을 선언하며, 진행을 한다.
	 */
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
		// LinkedList가 비워져있는지 확인, 주어진 head값이 null일 경우 그 뒤에 리스트에도 원소가 없다. null의 유무로 t/f를 판별
	}
	
}




