/*
 * linkedlist
 * 동잃한 데이터 타입을 순서에 따라 관리하는 자료 구조
 * 자료를 저장하는 노드에는 자료와 다른 요소를 가리키는 링크(포인터)존재
 * 자료가 추가될 때 노드만큼의 메모리를 할당 받고 이전 노드의 링크로 연결
 * 연결 리스트의 i번째 요소를 찾을 때 걸리는 시간은 요소의 개수에 비례
 */
package ch03_linked;

public class MyListNode {

	private String data;       // 자료
	public MyListNode next;    // 다음 노드를 가리키는 링크
	
	public MyListNode(){
		data = null;
		next = null;
	}
	
	public MyListNode(String data){
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link){
		this.data = data;
		this.next = link;
	}
	
	public String getData(){
		return data;
	}
}


