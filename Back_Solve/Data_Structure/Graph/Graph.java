package Graph;

import java.util.ArrayList;




class ListGraph{
	private ArrayList<ArrayList<Integer>> listGraph;
	
	
	// ������
	public ListGraph(int initsize) {
		this.listGraph = new ArrayList<ArrayList<Integer>>(); // �׷��� ����
		for(int i = 0 ; i <initsize+1 ;i++) {
			listGraph.add(new ArrayList<Integer>());
		}
	}
	
	
	public ArrayList<ArrayList<Integer>> getGraph() {
		return this.listGraph;
	}
	
	// Ư�� �ε����� ���� ��� return 
	public ArrayList<Integer> getNode(int i){
		return this.listGraph.get(i);
	}
	
	// ���� �߰� �����
	public void put(int x,int y) {
		listGraph.get(x).add(y);
		listGraph.get(y).add(x);
	}
	
	// ���� �߰� �ܹ���
	public void SinglePut(int x,int y) {
		listGraph.get(x).add(y);
	}
	
	// �׷��� ���
	public void showGraphList() {
		for(int i = 1 ; i < listGraph.size();i++) {
			System.out.print("����" + i + "�� ���� ����Ʈ(�������� �����)");
			for(int  j = 0 ; j <listGraph.get(i).size();j++) {
				System.out.print(" -> " + listGraph.get(i).get(j));
			}
			System.out.println();
		}
	}
}

public class Graph {
	public static void main(String [] args) {
		int initsize = 6;
		ListGraph adjList = new ListGraph(initsize);
		
		adjList.put(1, 2);
		adjList.put(1, 3);
		adjList.put(2, 3);
		adjList.put(2, 4);
		adjList.put(3, 4);
		adjList.put(3, 5);
		adjList.put(4, 5);
		adjList.put(4, 6);
		
		adjList.showGraphList();
		
		
	}
}
