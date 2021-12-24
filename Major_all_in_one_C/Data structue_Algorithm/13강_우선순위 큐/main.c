// 우선순위 큐
// 우선순위 큐의 필요성
// 우선순위 큐는 '우선 순위'를 가진 데이터들을 저장하는 큐를 의미. 
// 데이터를 꺼낼 때 우선 순위가 높은 데이터가 가장 먼저 나온다는 특징이 있어 많이 활용
//
// 우선순위 큐는 운영체제의 작업 스케줄링, 정렬, 네트워크 관리 등의 다양한 기술에 적용되고 있다.
//
// 우선순위 큐와 큐의 차이점
// 일반적인 형태의 큐는 선형적인 형태를 가지고 있지만 우선순위 큐는 트리(Tree) 구조로 보는 것이 합리적이다. 
// 일반적으로 우선순위 큐는 최대 힙을 이용해 구현한다.
//
// 최대 힙(Max Heap)
// 최대힙은 부모노드가 자식노드보다 값이 큰 완전이진트리를 의미한다. 
// 전체 트리에서 루트노드의 값이 제일 크다.
// 자료구조를 설계할 때 항상 전체 트리가 최대 힙 구조를 유지하도록 설계.

// PUSH : 우선순위 큐에 데이터를 삽입
// POP : 우선순위 큐에서 데이터를 추출

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define MAX_SIZE 10000

void swap(int* a, int* b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}

typedef struct {
	int heap[MAX_SIZE];
	int count;
} prorityQueue;

void push(prorityQueue* pq, int data) {
	if (pq->count >= MAX_SIZE) {
		return;
	}
	pq->heap[pq->count] = data;
	int now = pq->count;
	int parent = (pq->count - 1) / 2;
	// 새 원소를 삽입한 이후에 상향식으로 힙을 구한다. 
	while (now > 0 && pq->heap[now] > pq->heap[parent]) {
		swap(&pq->heap[now], &pq->heap[parent]);
		now = parent;
		parent = (parent - 1) / 2;
	}
	pq->count++;
}

int pop(prorityQueue* pq) {
	if (pq->count <= 0) {
		return -9999;
	}
	int res = pq->heap[0];
	pq->count--;
	pq->heap[0] = pq->heap[pq->count];
	int now = 0, leftChild = 1, rightChild = 2;
	int target = now;
	// 새 원소를 추출한 이후에 하향식으로 힙을 구성합니다.

	while (leftChild < pq->count) {
		if (pq->heap[target] < pq->heap[leftChild]) {
			target = leftChild;
		}
		if (pq->heap[target] < pq->heap[rightChild] && rightChild < pq->count) {
			target = rightChild;
		}
		if (target == now) {
			break; // 더 이상 내려가지 않아도 될 때 종료
		}
		else {
			swap(&pq->heap[now], &pq->heap[target]);
			now = target;
			leftChild = now * 2 + 1;
			rightChild = now * 2 + 2;
		}
		return res;
	}
}

int main(void) {
	int n, data;
	scanf("%d", &n);
	prorityQueue pq;
	pq.count = 0;
	for (int i = 0; i < n; i++) {
		scanf("%d ", &data);
		push(&pq, data);
	}
	for (int i = 0; i < n; i++) {
		int data = pop(&pq);
		printf("%d ", data);
	}
	system("pause");
	return 0;
}