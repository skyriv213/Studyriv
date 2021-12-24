/*
양방향 연결리스트

양방향 연결리스트는 머리와 꼬리를 둘다 가진다는 특징이 존재
각 노드는 앞 노드와 뒤 노드의 정보를 모두 저장하고 있음
우리는 데이터를 '오름차순'으로 저장하는 양방향 연결리스트를 구현예정

*/

#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>

typedef struct {
	int data;
	struct Node* prev;
	struct Node* next;
} Node;

Node* head, * tail;

void insert(int data) {
	Node* node = (Node*)malloc(sizeof(Node));
	node->data = data;
	Node* cur;
	cur = head->next;
	while (cur->data < data && cur != tail) {
		cur = cur->next;
	}
	Node* prev = cur->prev;
	prev->next = node;
	node->prev = prev;
	cur->prev = node;
	node->next = cur;
}

void removeFront() {
	Node* node = head->next;
	head->next = node->next;
	Node* next = node->next;
	next->prev = head;
	free(node);
}

void show() {
	Node* cur = head->next;
	while (cur != tail) {
		printf("%d", cur->data);
		cur = cur->next;
	}
}

int main(void) {
	
	system("pause");
	return 0;
}