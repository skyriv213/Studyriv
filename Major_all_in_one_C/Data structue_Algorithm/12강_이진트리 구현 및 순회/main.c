// ���� Ʈ��
// �����͸� �̿��Ͽ� �����ϸ� ȿ������ ������ ������ �����ϴ�
// ����Ʈ���� ���� �� ��ȸ
// �����͸� �ϳ��� �湮�ϴ� ����� ��ǥ������ 3���� ����
// 1. ���� ��ȸ ( �ڱ� �ڽ��� ��� -> ���� �ڽ��� �湮 -> ������ �ڽ��� �湮)
// 2. ���� ��ȸ ( ���� �ڽ��� �湮 -> �ڱ� �ڽ��� ��� -> ������ �ڽ��� �湮) 
// 3. ���� ��ȸ ( ���� �ڽ��� �湮 -> ������ �ڽ��� �湮 - > �ڱ� �ڽ��� ���)

#include <stdio.h>
#include <stdlib.h>

typedef struct {
	int data;  // �����Ͱ� ���� �ڸ� 
	struct Node* leftChild;
	struct Node* riightChild;
} Node;


Node* initNode(int data, Node* leftChild, Node* rightChild) {
	Node* node = (Node*)malloc(sizeof(Node));
	node->data = data;
	node->leftChild = leftChild;
	node->riightChild = rightChild;
	return node;
}

// ���� ��ȸ
void preorder(Node* root) {
	if (root) {
		printf("%d ", root->data);
		preorder(root->leftChild);
		preorder(root->riightChild);
	}
}

// ���� ��ȸ
void inorder(Node* root) {
	if (root) {
		inorder(root->leftChild);
		printf("%d ", root->data);
		inorder(root->riightChild); 
	}
}


// ���� ��ȸ
void postorder(Node* root) {
	if (root) {
		postorder(root->leftChild);
		postorder(root->riightChild);
		printf("%d ", root->data);
	}
}

int main(void) {
	Node* n7 = initNode(50, NULL, NULL);
	Node* n6 = initNode(37, NULL, NULL);
	Node* n5 = initNode(23, NULL, NULL);
	Node* n4 = initNode(5, NULL, NULL);
	Node* n3 = initNode(48, n6, n7);
	Node* n2 = initNode(17, n4, n5);
	Node* n1 = initNode(30, n2, n3);

	preorder(n1);
	printf("\n");
	inorder(n1);
	printf("\n");
	postorder(n1);
	printf("\n");

	system("pause");
	return 0;

}





// ȭ��ǥ ������
// ���� ������ ���� ������ ��Ծ ������
//
// ->  ȭ��ǥ ������
//
// ����ü ������ ���� ����ü ������ ���� �����ϰ� ���ش�.
//
//
// typedef struct {
//	 int data;
// }A;
//
// �� ���� ����ü�� ����Ϸ���,
//
// A a1 = { 1 }; or A * a = (A*)malloc(sizeof(A)); �̷����� �����Ҵ��� �ؾ���
//
// ����ü ������ �ȿ� �ִ� data ������ �����Ϸ���
//
// int testdata = (a*)data; �̷������� ������ �ؾ��Ѵ�.(a1�� �׳� a1.data)
//
// �׷����� a->data;�� ���� ����ϸ� �ش� �ּ� ���� data��� ������ �����ϴ� �Ͱ� ����.

