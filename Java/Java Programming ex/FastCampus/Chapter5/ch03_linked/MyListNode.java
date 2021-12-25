/*
 * linkedlist
 * ������ ������ Ÿ���� ������ ���� �����ϴ� �ڷ� ����
 * �ڷḦ �����ϴ� ��忡�� �ڷ�� �ٸ� ��Ҹ� ����Ű�� ��ũ(������)����
 * �ڷᰡ �߰��� �� ��常ŭ�� �޸𸮸� �Ҵ� �ް� ���� ����� ��ũ�� ����
 * ���� ����Ʈ�� i��° ��Ҹ� ã�� �� �ɸ��� �ð��� ����� ������ ���
 */
package ch03_linked;

public class MyListNode {

	private String data;       // �ڷ�
	public MyListNode next;    // ���� ��带 ����Ű�� ��ũ
	
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


