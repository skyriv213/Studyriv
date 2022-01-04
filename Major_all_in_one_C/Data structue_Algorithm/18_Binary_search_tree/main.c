//���� Ž�� Ʈ��
//���� Ž���� �׻� �����ϵ��� �����Ͽ� Ž���ӵ��� �ش�ȭ ��Ų �ڷᱸ��
//���� Ž�� Ʈ�������� �׻� �θ� ��尡 ���� �ڽĺ��� ũ��, ������ �ڽĺ��ٴ� �۴�.
//
//���� Ž�� Ʈ�������� �� �� Ȯ���� ������ ���ƾ� �ϴ� ������ ������ ���ݾ� �پ��⿡ 
//���� ���� Ʈ���� ��� Ž���ð��� o(log n)�� �ð� ���⵵�� ������.
//
//���� Ž�� Ʈ������ Ž���� �� ���� ã���� �ϴ� ���� �θ� ��庸�� ���� ��� ��������, 
//ã���� �ϴ� ���� �θ� ��庸�� Ŭ ��� ������ �ڽ����� �̾���� �湮�ϸ� �ȴ�.

//���� ���� Ʈ��(complete binary tree)�� �����Ͱ� ��Ʈ ������ �����ؼ� �ڽĳ�尡 ���� , ������ ���ʴ�� ���� ������ �ǹ�

//Ʈ���� ����ϸ� �����͸� ó���Կ� �־ ȿ����
//Ʈ������ �������� ������ n�϶� �迭�� ���������� o(n)�� �������� �ҿ�
//���� �� ������ �־ �Ϲ����� ��� ������ �迭�� �̿��ϴ� ��ĺ��� ȿ����
//ex : �����ͺ��̽� �� ��뷮 ���� �� �˻� �ڷᱸ���� ���� Ȱ��
#include<stdio.h>
#include<stdlib.h>

// Node�� ������ ���� , data�� ������ ���� �������� �ڽ��� ������ �ִ� �����̸� �̸� Node�� ����
typedef struct {
	int data;
	struct Node* leftChild;
	struct Node* rightChild;
	
}Node;

// node�� ������ �� ��带 �����ϴ� �޼ҵ�
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


// ���� ���� ��带 ã�� �޼ҵ� ( ���ʿ� �������� �θ� ��庸�� ���� �ڽĳ���̹Ƿ� ���� ������ �ڽ��� ã��)
Node* findMinNode(Node* root) {
	Node* node = root;
	while (node->leftChild != NULL) {
		node = node->leftChild;
	}
	return node;
}

// ���� ū ��带 ã�� �޼ҵ� ( �����ʿ� ��ġ�ϴ� ���� �θ��庸�� ū ����̹Ƿ� ���� �������� �ڽ��� ã��)
Node* findMaxNode(Node* root) {
	Node* node = root;
	while (node->rightChild != NULL) {
		node = node->rightChild;
	}
	return node;
}

//����� ��ġ�� ���� data�� ã�� �޼ҵ�
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

// ������ȸ ������� ��ȸ�� �ϴ� �żҵ�
void preorder(Node* root) {
	if (root == NULL) {
		return;
	}
	printf("%d ", root->data);
	preorder(root->leftChild);
	preorder(root->rightChild);
}

// ��带 ����� �޼ҵ�
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