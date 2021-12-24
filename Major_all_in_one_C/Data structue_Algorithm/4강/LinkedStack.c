#include<stdio.h>
#include<stdlib.h>
#define size 10000
#define INF 99999999

typedef struct {
	int data;
	struct Node* next;
} Node;

typedef struct {
	Node* top;
} Stack;

void push(Stack* stack, int data) {
	Node* node=(Node*)malloc(sizeof(Node));
	node->data = data;
	node->next = stack->top;
	stack->top = node;
}
void pop(Stack* stack) {
	if (stack->top == NULL) {
		printf("���� ��� �÷ο찡 �߻��߽��ϴ�.\n");
		return -INF;
	}
	Node* node = stack->top;
	int data = node->data;
	stack->top = node->next;
	free(node);
	return data;
}

void show(Stack *stack) {
	Node* cur = stack->top;
	printf("---������ �ֻ��----");
	while (cur != NULL) {
		printf("%d\n", cur->data);
		cur = cur->next;
	}
	printf("---������ ���ϴ�---\n");
}

/*
������ top���� null���� �־������
�׷��� ������ ����÷ο� Ȥ�� �������� üũ�� �� �ִ�.
*/