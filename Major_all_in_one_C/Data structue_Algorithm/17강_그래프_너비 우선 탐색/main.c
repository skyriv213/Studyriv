//�ʺ� �켱 Ž��
//
//�ʺ� �켱 Ž��(Breadth First Search)�� �ʺ� �켱���� �Ͽ� Ž���� �����ϴ� Ž�� �˰���
//DFS�� ���������� �͸������� ��ü��带 Ž���ϰ��� �� �� ���Ǹ� ť(Queue) �ڷᱸ���� �����Ѵ�.
//
//�ʺ� �켱 Ž���� ��� �׷��� �˰��򿡼� ���� Ȱ��ǹǷ� ��� �����ڰ� �Ǳ� ���ؼ��� �ʺ� �켱 Ž���� ���� �����ؾ��Ѵ�.
//
//1. Ž�� ���� ��带 ť�� �����ϰ� �湮ó���� ��
//2. ť���� ��带 ���� �ش� ����� ���� ��� �߿��� �湮���� ���� ������ ��� ť�� �����ϰ� �湮ó���� ��
//3. 2���� ������ �� �̻� ������ �� ���� ������ �ݺ�

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#define INF 99999999
#define MAX_SIZE 1001

typedef struct {
	int index;
	struct Node* next;
} Node;

typedef struct {
	Node* front;
	Node* rear;
	int count;
}Queue;

Node** a; // ������ ������ ��� ���� 2���� ������ �̿�
int n, m, c[MAX_SIZE];

void addFront(Node* root, int index) {
	Node* node = (Node*)malloc(sizeof(Node));
	node->index = index;
	node->next = root->next;
	root->next = node;
}

void queuePush(Queue* queue, int index) {
	Node* node = (Node*)malloc(sizeof(Node));
	node->index = index;
	node->next = NULL;
	if (queue->count == 0) {
		queue->front = node;
	}
	else {
		queue->rear->next = node;
	}
	queue->rear = node;
	queue->count++
}