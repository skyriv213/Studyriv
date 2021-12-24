//너비 우선 탐색
//
//너비 우선 탐색(Breadth First Search)은 너비를 우선으로 하여 탐색을 수행하는 탐색 알고리즘
//DFS와 마찬가지로 맹목적으로 전체노드를 탐색하고자 할 때 사용되며 큐(Queue) 자료구조에 기초한다.
//
//너비 우선 탐색은 고급 그래프 알고리즘에서 자주 활용되므로 고급 개발자가 되기 위해서는 너비 우선 탐색에 대해 숙지해야한다.
//
//1. 탐색 시작 노드를 큐에 삽입하고 방문처리를 함
//2. 큐에서 노드를 꺼내 해당 노드의 인접 노드 중에서 방문하지 않은 노드들을 모두 큐에 삽입하고 방문처리를 함
//3. 2번의 과정을 더 이상 수행할 수 없을 때까지 반복

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

Node** a; // 정점의 정보를 담기 위해 2차원 포인터 이용
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

int queuePop(Queue* queue) {
	if (queue->count == 0) {
		printf("큐 언더플로우가 발생하였습니다.\n");
		return -INF
	}
	Node* node = queue->front;
	int index = node->index;
	queue->front = node->next;
	free(node);
	queue->count--;
	return index;
}

void bfs(int start) {
	Queue  q;
	q.front = q.rear = NULL;
	q.count = 0;
	queuePush(&q, start);
	c[start] = 1;
	while (q.count != 0) {
		int x = queuePop(&q);
		printf("%d ", x);
		Node* cur = a[x]->next;
		while (cur != NULL) {
			int next = cur->index;
			if (!c[next]) {
				queuePush(&q, next);
				c[next] = 1;
			}
			cur = cur->next;
		}
	}
}

int main(void) {
	scanf("%d %d ", &n, &m);
	a = (Node**)malloc(sizeof(Node*) * (MAX_SIZE));
	for (int i = 1; i <= n; i++) {
		a[i] = (Node*)malloc(sizeof(Node));
		a[i]->next = NULL;
	}
	for (int i = 0; i < m; i++) {
		int x, y;
		scanf("%d %d ", &x, &y);
		addFront(a[x], y);
		addFront(a[y], x);
	}
	bfs(1);
	system("pause");
	return 0;
}