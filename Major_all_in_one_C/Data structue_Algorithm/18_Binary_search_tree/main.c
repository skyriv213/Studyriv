//이진 탐색 트리
//이진 탐색이 항상 동작하도록 구현하여 탐색속도를 극대화 시킨 자료구조
//이진 탐색 트리에서는 항상 부모 노드가 왼쪽 자식보다 크고, 오른쪽 자식보다는 작다.
//
//이진 탐색 트리에서는 한 번 확인할 때마다 보아야 하는 원소의 개수가 절반씩 줄어들기에 
//완전 이진 트리의 경우 탐색시간이 o(log n)의 시간 복잡도를 가진다.
//
//이진 탐색 트리에서 탐색을 할 때는 찾고자 하는 값이 부모 노드보다 작을 경우 왼쪽으로, 
//찾고자 하는 값이 부모 노드보다 클 경우 오른쪽 자식으로 이어나가며 방문하면 된다.

//완전 이진 트리(complete binary tree)란 데이터가 루트 노드부터 시작해서 자식노드가 왼쪽 , 오른쪽 차례대로 들어가는 구조를 의미

//트리를 사용하면 데이터를 처리함에 있어서 효율적
//트리에서 데이터의 개수가 n일때 배열과 마찬가지로 o(n)의 공간만이 소요
//삽입 및 삭제에 있어서 일반적인 경우 기존의 배열을 이용하는 방식보다 효율적
//ex : 데이터베이스 등 대용량 저장 및 검색 자료구조로 많이 활용
#include<stdio.h>
#include<stdlib.h>

// Node의 구조를 설정 , data와 각각의 왼쪽 오른쪽의 자식을 가지고 있는 형태이며 이를 Node로 정의
typedef struct {
	int data;
	struct Node* leftChild;
	struct Node* rightChild;
	
}Node;

// node에 데이터 및 노드를 설정하는 메소드
Node* insertNode(Node* root, int data) {
	if(root == NULL){
	root =(Node*)malloc(sizeof(Node));
	root->leftChild = root->rightChild = NULL;
	root->data = data;
	return root;
	}
	else {
		if (root->data > data) {
			root->leftChild = insertNode(root->leftChild, data);
		}
		else {
			root->rightChild = insertNode(root->rightChild, data);
		}
	}
	return root;
}


// 가장 작은 노드를 찾는 메소드 ( 왼쪽에 있을수록 부모 노드보다 작은 자식노드이므로 가장 왼쪽의 자식을 찾음)
Node* findMinNode(Node* root) {
	Node* node = root;
	while (node->leftChild != NULL) {
		node = node->leftChild;
	}
	return node;
}

// 가장 큰 노드를 찾는 메소드 ( 오른쪽에 위치하는 노드는 부모노드보다 큰 노드이므로 가장 오른쪽의 자식을 찾음)
Node* findMaxNode(Node* root) {
	Node* node = root;
	while (node->rightChild != NULL) {
		node = node->rightChild;
	}
	return node;
}

//노드의 위치에 따라 data를 찾는 메소드
Node* searchNode(Node* root, int data) {
	if (root ==  NULL) {
		return NULL;
	}
	if (root->data == data) {
		return root;
	}
	else if (root->data > data) {
		return searchNode(root->leftChild, data);

	}
	else {
		return searchNode(root->rightChild, data);
	}
}

// 전위순회 방식으로 순회를 하는 매소드
void preorder(Node* root) {
	if (root == NULL) {
		return;
	}
	printf("%d ", root->data);
	preorder(root->leftChild);
	preorder(root->rightChild);
}

// 노드를 지우는 메소드
Node* deleteNode(Node* root, int data) {
	Node* node = NULL;
	if (root == NULL) {
		return NULL;
	}
	if (root->data < data) {
		root->leftChild = deleteNode(root->leftChild, data);
	}
	else if (root->data > data) {
		root->rightChild = deleteNode(root->rightChild, data);
	}
	else {
		if (root->leftChild != NULL && root->rightChild != NULL) {
			node = findMinNode(root->rightChild);
			root->data = node->data;
			root->rightChild = deleteNode(root->rightChild, node->data);
		}
		else {
			node = (root->leftChild != NULL) ? root->leftChild : root->rightChild;
			free(root);
			return node;
		}
	}
	return root;
}


int main(void) {
	Node* root = NULL;
	root = insertNode(root, 30);
	root = insertNode(root, 17);
	root = insertNode(root, 48);
	root = insertNode(root, 5);
	root = insertNode(root, 23);
	root = insertNode(root, 37);
	root = insertNode(root, 50);
	root = deleteNode(root, 30);
	preorder(root);
	system("pause");
}