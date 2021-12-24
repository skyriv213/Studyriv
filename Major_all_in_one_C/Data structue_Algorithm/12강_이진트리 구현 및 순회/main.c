// 이진 트리
// 포인터를 이용하여 구현하면 효과적인 데이터 관리가 가능하다
// 이진트리의 구현 및 순회
// 데이터를 하나씩 방문하는 방법은 대표적으로 3가지 존재
// 1. 전위 순회 ( 자기 자신을 출력 -> 왼쪽 자식을 방문 -> 오른쪽 자식을 방문)
// 2. 중위 순회 ( 왼쪽 자식을 방문 -> 자기 자신을 출력 -> 오른쪽 자식을 방문) 
// 3. 후위 순회 ( 왼쪽 자식을 방문 -> 오른쪽 자식을 방문 - > 자기 자신을 출력)

#include <stdio.h>
#include <stdlib.h>

typedef struct {
	int data;  // 데이터가 들어가는 자리 
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

// 전위 순회
void preorder(Node* root) {
	if (root) {
		printf("%d ", root->data);
		preorder(root->leftChild);
		preorder(root->riightChild);
	}
}

// 중위 순회
void inorder(Node* root) {
	if (root) {
		inorder(root->leftChild);
		printf("%d ", root->data);
		inorder(root->riightChild); 
	}
}


// 후위 순회
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





// 화살표 연산자
// 전에 정리한 적이 있지만 까먹어서 재정리
//
// ->  화살표 연산자
//
// 구조체 포인터 안의 구조체 변수에 쉽게 접근하게 해준다.
//
//
// typedef struct {
//	 int data;
// }A;
//
// 와 같은 구조체를 사용하려면,
//
// A a1 = { 1 }; or A * a = (A*)malloc(sizeof(A)); 이런식의 동적할당을 해야함
//
// 구조체 포인터 안에 있는 data 변수에 접근하려면
//
// int testdata = (a*)data; 이런식으로 접근을 해야한다.(a1은 그냥 a1.data)
//
// 그렇지만 a->data;와 같이 사용하면 해당 주소 안의 data라는 변수에 접근하는 것과 같다.

