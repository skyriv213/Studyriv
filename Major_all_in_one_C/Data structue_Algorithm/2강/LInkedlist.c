/*
연결리스트
일반적으로 연결리스트는 구조체와 포인터를 함께 사용하여 구현
연결 리스트는 리스트의 중간 지점에 노드를 추가하거나 삭제할 수 있어야함
배열과는 다르게 필요할 때마다 메모리 공간을 할당 받는다.


주의할점
삽입과 삭제기능에서 예외사항을 처리할 필요가 있음
삭제할 원소가 없는데 삭제할 경우, 머리 노드를 잘못 넣은 경우를 다 체크해야함

삽입과 삭제가 배열에 비해 간단하다는 장점
배열과 다르게 특정 인덱스로 즉시 접근하는 방법은 존재 x, 원소를 차례대로 검색
추가적으로 포인터변수가 사용되므로 메모리 공간이 낭비

연결리스트는 데이터를 선형적으로 저장하고 처리하는 방법
기존의 배열을 이용했을 때보다 삽입과 삭제가 많은 경우에서 효율적
특정한 인덱스를 바로 불러와야 하는경우에는 배열이 좀더 효율적
*/

#define _CRT_SECURE_NO_WWARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct {
	int data;
	struct Node* next;
} Node;

Node* head;
// 포인터변수는 동적할당을 이용해서 만듬

void addFront(Node* root, int data) {
	Node* node = (Node*)malloc(sizeof(Node));
	node->data = data;
	node->next = root->next;
	root->next = node;
}

void removeFront(Node* root) {
	Node* front = root->next;
	root->next = front->next;
	free(front);
}

void freeAll(Node* root) {
	Node* cur = head->next;
	while (cur != NULL) {
		Node* next = cur->next;
		free(cur);
		cur = next;
	}
}


int main(void) {
	head = (Node*)malloc(sizeof(Node));
	Node* node1 = (Node*)malloc(sizeof(Node));
	node1->data = 1;
	Node* node2 = (Node*)malloc(sizeof(Node));
	node1->data = 2;
	head->next = node1;
	node1->next = node2;
	node2->next = NULL;
	Node* cur = head->next;
	while (cur != NULL) {
		printf("%d", cur->data);
		cur = cur->next;
	}



	system("puase");
	return 0;
}