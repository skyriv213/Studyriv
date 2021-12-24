//�׷����� ����� ����
//�׷����� �繰�� ����, �������� ��Ÿ���� ���� ����
//�׷����� �ΰ����� ǥ������
//
//1 : ������� - 2���� �迭�� ����Ͽ� ǥ��
//2 : ��������Ʈ - ����Ʈ�� ����ϴ� ���

//��������� ��� �������� ���� ���θ� �����Ͽ� O(V^2)�� ������ �䱸�ϹǷ� ���� ȿ������ ��������
//�ٸ� �� ������ ���� ����Ǿ� �ִ��� Ȯ���ϱ� ���� o(1)�� �ð��� �䱸�Ѵ�
//
//���� ����Ʈ�� ����� ������ �������� �����Ͽ� O(E)�� ������ �䱸�ϹǷ� ���� ȿ������ ���������
//�� ������ ���� ����Ǿ��ִ��� Ȯ���ϱ� ���� o(v)�� �ð��� �䱸�Ѵ�. 

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct {
	int index;
	int distance;
	struct Node* next;
}Node;

void addFront(Node* root, int index, int distance) {
	Node* node = (Node*)malloc(sizeof(Node));
	node->index = index;
	node->distance = distance;
	node->next = root->next;
	root->next = node;
}

void showALl(Node* root) {
	Node* cur = root->next;
	while (cur != NULL) {
		printf("%d(�Ÿ�: %d", cur->next, cur->distance);
		cur = cur->next;
	}
}

int a[1001][1001];
int n, m;
int main(void) {
	scanf("%d %d", &n, &m);
	for (int i = 0; i < m; i++) {
		int x, y;
		scanf("%d %d", &x, &y);
		a[x][y] = 1;
		a[y][x] = 1;
	}
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}
	system("pause");
}