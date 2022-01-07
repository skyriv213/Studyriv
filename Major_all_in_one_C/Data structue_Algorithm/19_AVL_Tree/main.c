//AVL Tree
//- 균형이 갖춰진 이진트리(Binary Search Tree)를 의미
//- 완전 이진 트리는 검색에 있어서  O(log N)의 시간 복잡도를 유지
//- 간단한 구현 과정으로 특정 이진 트리가 완전 이진 트리에 가까운 형태를 유지하도록 해준다.
//
//- 균형인수(Balance Factor)라는 개념을 이용
//	- 균형 인수  = | 왼쪽 자식 높이 - 오른쪽 높이 자식|
//	- 균형 인수가 2 이상일 경우 문제가 있다고 판단
//
//- 모든 노드에 대한 균형 인수가 -1, 0 +1인 트리를 의미한다
//- 균형 인수가 위 세 가지에 해당하지 않을 경우 '회전(Rotation)'을 통해 트리를 재구성해야 함
//
//- 총 4가지 형식에 의하여 균형이 깨질 수 있다. 균형 인수가 깨지는 노드를 x라고 했을 때 4가지 형식은 아래와 같다
//	- LL형식 : x의 왼쪽 자식의 왼쪽에 삽입하는 경우
//	- LR형식 : x의 왼쪽 자식의 오른쪽에 삽입하는 경우
//	- RR형식 : x의 오른쪽 자식의 오른쪽에 삽입하는 경우
//	- RL형식 : x의 오른쪽 자식의 왼쪽에 삽입하는 경우
//
//AVL 트리의 각 노드는 '균형인수'를 계산하기 위한 목적으로 자신의 높이(height) 값을 가진다


#include <stdio.h>
#include<stdlib.h>

int getMax(int a, int b) {
	if (a > b) {
		return a;
	}
	return b;
}

// Node 정의 
typedef struct {
	int data;
	int height; // AVL트리의 균형인수 계산을 위한 높이 값, 높이를 저장해야 시간 복잡도를 보장할 수 있음
	struct Node* leftChild;
	struct Node* rightChild;
} Node;

// Node가 가진 높이값을 반환
// node의 값이 없다면 0을 반환하고 아닐경우 node의 값에 height 저장
int getHeight(Node* node) {
	if (node == NULL) {
		return 0;
	}
	return node->height;
}

// 모든 노드는 회전을 수행한 이후에 높이를 다시 계산
// 왼쪽 자식의 높이와 오른쪽 자식의 높이값 중 큰 것을 찾아 +1을 하는것
void setHeight(Node* node) {
	node->height = 
		getMax(getHeight(node->leftChild), getHeight(node->rightChild)) + 1;
}


// 균형인수를 구하는 메소드
int getDifference(Node* node) {
	if (node == NULL) {
		return 0;
	}
	Node* leftChild = node->leftChild;;
	Node* rightChild = node->rightChild;
	return getHeight(leftChild) - getHeight(rightChild);
}

// AVL 트리의 LL회전
Node* rotateLL(Node* node) {
	Node* leftChild = node->leftChild;
	node->leftChild = leftChild->rightChild;
	leftChild->rightChild = node;
	setHeight(node); // 회전 이후에 높이를 다시 계산
	return leftChild; // leftChild는 이후에 setHeight() 수행
}

// AVL 트리의 RR회전
Node* rotateRR(Node* node) {
	Node* rightChild = node->rightChild;
	node->rightChild = rightChild->leftChild;
	rightChild->leftChild = node;
	setHeight(node); // 회전 이후에 높이를 다시 계산
	return rightChild; // rightChild는 이후에 setHeight() 수행
}

// AVL 트리의 LR회전 

Node* rotateLR(Node* node) {
	Node* leftChild = node->leftChild;
	node->leftChild = ratateRR(leftChild);
	setHeight(node->leftChild); // 회전 이후에 높이를 다시 계산
	return rotateLL(node); // 해당 노드는 이후에 setHeight() 수행
}


Node* rotateRL(Node* node) {
	Node* rightChild = node->rightChild;
	node->rightChild = ratateLL(rightChild);
	setHeight(node->rightChild); // 회전 이후에 높이를 다시 계산
	return rotateRR(node); // 해당 노드는 이후에 setHeight() 수행
}
//--------------------------------------------------------------------------------------------------------
//AVL 트리의 균형잡기
//
//- AVL 트리의 균형잡기는 각 노드가 '삽입 될 때'마다 수행되어야 합니다. '삽입'과정에 소요되는 시간 복잡도는
//O(log N)이며, 각 트리의 균형잡기는 삽입 시에 거치는 모든 노드에 대하여 수행된다는 점에서 o(1)의 시간복잡도를 만족해야한다.


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
		setHeight(node); // 회전 이후에 높이 계산
		return node;

	}
}

//--------------------------------------------------------------------------------------------------------

//삽입
//-일반적인 이진 탐색 트리와 흡사하다. 다만 삽입 시에 거치는 모든 노드에 대하여 균형 잡기를 수행해주어야하는 특징이 있다.

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
		printf("데이터 중복이 발생했습니다.\n");
	}
	return node;
}
//--------------------------------------------------------------------------------------------------------
//출력
//-삽입되는 과정을 면밀히 살펴보는 것이 중요하므로, 트리 구조를 적절히 보여 줄 수 있는 방식으로 출력해야함
//일반적으로 트리의 너비가 높이보다 크다는 점에서 세로방향으로 출력하는 함수를 구현할 수 있습니다.

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