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
		printf("스택 언더 플로우가 발생했습니다.\n");
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
	printf("---스택의 최상단----");
	while (cur != NULL) {
		printf("%d\n", cur->data);
		cur = cur->next;
	}
	printf("---스택의 최하단---\n");
}

/*
스택의 top에는 null값을 넣어줘야함
그래야 스택의 언더플로우 혹은 루프문을 체크할 수 있다.
*/