// �켱���� ť
// �켱���� ť�� �ʿ伺
// �켱���� ť�� '�켱 ����'�� ���� �����͵��� �����ϴ� ť�� �ǹ�. 
// �����͸� ���� �� �켱 ������ ���� �����Ͱ� ���� ���� ���´ٴ� Ư¡�� �־� ���� Ȱ��
//
// �켱���� ť�� �ü���� �۾� �����ٸ�, ����, ��Ʈ��ũ ���� ���� �پ��� ����� ����ǰ� �ִ�.
//
// �켱���� ť�� ť�� ������
// �Ϲ����� ������ ť�� �������� ���¸� ������ ������ �켱���� ť�� Ʈ��(Tree) ������ ���� ���� �ո����̴�. 
// �Ϲ������� �켱���� ť�� �ִ� ���� �̿��� �����Ѵ�.
//
// �ִ� ��(Max Heap)
// �ִ����� �θ��尡 �ڽĳ�庸�� ���� ū ��������Ʈ���� �ǹ��Ѵ�. 
// ��ü Ʈ������ ��Ʈ����� ���� ���� ũ��.
// �ڷᱸ���� ������ �� �׻� ��ü Ʈ���� �ִ� �� ������ �����ϵ��� ����.

// PUSH : �켱���� ť�� �����͸� ����
// POP : �켱���� ť���� �����͸� ����

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
	// �� ���Ҹ� ������ ���Ŀ� ��������� ���� ���Ѵ�. 
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
	// �� ���Ҹ� ������ ���Ŀ� ��������� ���� �����մϴ�.

	while (leftChild < pq->count) {
		if (pq->heap[target] < pq->heap[leftChild]) {
			target = leftChild;
		}
		if (pq->heap[target] < pq->heap[rightChild] && rightChild < pq->count) {
			target = rightChild;
		}
		if (target == now) {
			break; // �� �̻� �������� �ʾƵ� �� �� ����
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