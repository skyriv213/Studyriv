//AVL Tree
//- ������ ������ ����Ʈ��(Binary Search Tree)�� �ǹ�
//- ���� ���� Ʈ���� �˻��� �־  O(log N)�� �ð� ���⵵�� ����
//- ������ ���� �������� Ư�� ���� Ʈ���� ���� ���� Ʈ���� ����� ���¸� �����ϵ��� ���ش�.
//
//- �����μ�(Balance Factor)��� ������ �̿�
//	- ���� �μ�  = | ���� �ڽ� ���� - ������ ���� �ڽ�|
//	- ���� �μ��� 2 �̻��� ��� ������ �ִٰ� �Ǵ�
//
//- ��� ��忡 ���� ���� �μ��� -1, 0 +1�� Ʈ���� �ǹ��Ѵ�
//- ���� �μ��� �� �� ������ �ش����� ���� ��� 'ȸ��(Rotation)'�� ���� Ʈ���� �籸���ؾ� ��
//
//- �� 4���� ���Ŀ� ���Ͽ� ������ ���� �� �ִ�. ���� �μ��� ������ ��带 x��� ���� �� 4���� ������ �Ʒ��� ����
//	- LL���� : x�� ���� �ڽ��� ���ʿ� �����ϴ� ���
//	- LR���� : x�� ���� �ڽ��� �����ʿ� �����ϴ� ���
//	- RR���� : x�� ������ �ڽ��� �����ʿ� �����ϴ� ���
//	- RL���� : x�� ������ �ڽ��� ���ʿ� �����ϴ� ���
//
//AVL Ʈ���� �� ���� '�����μ�'�� ����ϱ� ���� �������� �ڽ��� ����(height) ���� ������


#include <stdio.h>
#include<stdlib.h>

int getMax(int a, int b) {
	if (a > b) {
		return a;
	}
	return b;
}

// Node ���� 
typedef struct {
	int data;
	int height; // AVLƮ���� �����μ� ����� ���� ���� ��, ���̸� �����ؾ� �ð� ���⵵�� ������ �� ����
	struct Node* leftChild;
	struct Node* rightChild;
} Node;

// Node�� ���� ���̰��� ��ȯ
// node�� ���� ���ٸ� 0�� ��ȯ�ϰ� �ƴҰ�� node�� ���� height ����
int getHeight(Node* node) {
	if (node == NULL) {
		return 0;
	}
	return node->height;
}

// ��� ���� ȸ���� ������ ���Ŀ� ���̸� �ٽ� ���
// ���� �ڽ��� ���̿� ������ �ڽ��� ���̰� �� ū ���� ã�� +1�� �ϴ°�
void setHeight(Node* node) {
	node->height = 
		getMax(getHeight(node->leftChild), getHeight(node->rightChild)) + 1;
}


// �����μ��� ���ϴ� �޼ҵ�
int getDifference(Node* node) {
	if (node == NULL) {
		return 0;
	}
	Node* leftChild = node->leftChild;;
	Node* rightChild = node->rightChild;
	return getHeight(leftChild) - getHeight(rightChild);
}

// AVL Ʈ���� LLȸ��
Node* rotateLL(Node* node) {
	Node* leftChild = node->leftChild;
	node->leftChild = leftChild->rightChild;
	leftChild->rightChild = node;
	setHeight(node); // ȸ�� ���Ŀ� ���̸� �ٽ� ���
	return leftChild; // leftChild�� ���Ŀ� setHeight() ����
}

// AVL Ʈ���� RRȸ��
Node* rotateRR(Node* node) {
	Node* rightChild = node->rightChild;
	node->rightChild = rightChild->leftChild;
	rightChild->leftChild = node;
	setHeight(node); // ȸ�� ���Ŀ� ���̸� �ٽ� ���
	return rightChild; // rightChild�� ���Ŀ� setHeight() ����
}

// AVL Ʈ���� LRȸ�� 

Node* rotateLR(Node* node) {
	Node* leftChild = node->leftChild;
	node->leftChild = ratateRR(leftChild);
	setHeight(node->leftChild); // ȸ�� ���Ŀ� ���̸� �ٽ� ���
	return rotateLL(node); // �ش� ���� ���Ŀ� setHeight() ����
}


Node* rotateRL(Node* node) {
	Node* rightChild = node->rightChild;
	node->rightChild = ratateLL(rightChild);
	setHeight(node->rightChild); // ȸ�� ���Ŀ� ���̸� �ٽ� ���
	return rotateRR(node); // �ش� ���� ���Ŀ� setHeight() ����
}
//--------------------------------------------------------------------------------------------------------
//AVL Ʈ���� �������
//
//- AVL Ʈ���� �������� �� ��尡 '���� �� ��'���� ����Ǿ�� �մϴ�. '����'������ �ҿ�Ǵ� �ð� ���⵵��
//O(log N)�̸�, �� Ʈ���� �������� ���� �ÿ� ��ġ�� ��� ��忡 ���Ͽ� ����ȴٴ� ������ o(1)�� �ð����⵵�� �����ؾ��Ѵ�.


Node* balance(Node* node) {
	int difference = getDifference(node);
	if (difference >= 2) {
		if (getDifference(node->leftChild) >= 1) {
			node = rotateLL(node);
		}
		else {
			node = rotateLR(node);
		}
	}
	else if (difference <= -2) {
		if (getDifference(node->rightChild) <= -1) {
			node = rotateRR(node);
		}
		else {
			node = rotateRL(node);
		}
		setHeight(node); // ȸ�� ���Ŀ� ���� ���
		return node;

	}
}

//--------------------------------------------------------------------------------------------------------

//����
//-�Ϲ����� ���� Ž�� Ʈ���� ����ϴ�. �ٸ� ���� �ÿ� ��ġ�� ��� ��忡 ���Ͽ� ���� ��⸦ �������־���ϴ� Ư¡�� �ִ�.

Node* insetnode(Node* node, int data) {
	if (!node) {
		node = (Node*)malloc(sizeof(Node));
		node->data = data;
		node->height = 1;
		node->leftChild = node->rightChild = NULL;
	}
	else if (data < node->data) {
		node->leftChild = insetnode(node->leftChild, data);
		node = balance(node);
	}
	else if (data > node->data) {
		node->rightChild = insetnode(node->rightChild, data);
		node = balance(node);
	}
	else {
		printf("������ �ߺ��� �߻��߽��ϴ�.\n");
	}
	return node;
}
//--------------------------------------------------------------------------------------------------------
//���
//-���ԵǴ� ������ ����� ���캸�� ���� �߿��ϹǷ�, Ʈ�� ������ ������ ���� �� �� �ִ� ������� ����ؾ���
//�Ϲ������� Ʈ���� �ʺ� ���̺��� ũ�ٴ� ������ ���ι������� ����ϴ� �Լ��� ������ �� �ֽ��ϴ�.

Node* root = NULL;

void display(Node* node, int level) {
	if (node != NULL) {
		display(node->rightChild, level + 1);
		printf("\n");
		if (node == root) {
			printf("Root : ");
		}
		for (int i = 0; i < level && node != root; i++) {
			printf("    ");
		}
		printf("%d(%d)", node->data, getHeight(node));
		display(node->leftChild, level + 1);
	}
}

int main(void) {
	root = insetnode(root, 7);
	root = insetnode(root, 6);
	root = insetnode(root, 5);
	root = insetnode(root, 3);
	root = insetnode(root, 1);
	root = insetnode(root, 9);
	root = insetnode(root, 8);
	root = insetnode(root, 12);
	root = insetnode(root, 16);
	root = insetnode(root,18);
	root = insetnode(root, 23);
	root = insetnode(root, 21);
	root = insetnode(root, 14);
	root = insetnode(root, 15);
	root = insetnode(root,19);
	root = insetnode(root,20);
	display(root, 1); printf("\n");
	system("pause");

}