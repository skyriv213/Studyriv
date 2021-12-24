//그래프의 개념과 구현
//그래프란 사물을 정점, 간선으로 나타내기 위한 도구
//그래프는 두가지로 표현가능
//
//1 : 인접행렬 - 2차원 배열을 사용하여 표현
//2 : 인접리스트 - 리스트를 사용하는 방식

//인접행렬은 모든 정점들의 연결 여부를 저장하여 O(V^2)의 공간을 요구하므로 공간 효율성은 떨어진다
//다만 두 정점이 서로 연결되어 있는지 확인하기 위해 o(1)의 시간을 요구한다
//
//인접 리스트는 연결된 간선의 정보만을 저장하여 O(E)의 공간을 요구하므로 공간 효율성은 우수하지만
//두 정점이 서로 연결되어있는지 확인하기 위해 o(v)의 시간을 요구한다. 

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
		printf("%d(거리: %d", cur->next, cur->distance);
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