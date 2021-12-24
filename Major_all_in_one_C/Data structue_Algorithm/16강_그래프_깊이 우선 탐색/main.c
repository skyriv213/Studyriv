//깊이 우선 탐색
//
//깊이 우선 탐색(Depth First Search)은 탐색을 함에 있어서 보다 깊은 것을 우선적으로 하여 탐색하는 알고리즘
//깊이 우선탐색은 기본적으로 전체 노드를 맹목적으로 탐색하고자 할 때 사용
//깊이 우선 탐색 알고리즘은 스택(stack)자료구조에 기초
// 실제로는 스택을 사용하지 않아도 가능하며 탐색을 수행함에 있어 O(N)의 시간이 소요
//
//깊이 우선 탐색은 빠르게 모든 경우의 수를 탐색하고자 할 때 쉽게 사용

// 1.탐색 시작 노드를 스택에 삽입/ 방문처리 
//
// 2.스택의 최상단 노드에게 방문하지 않은 인접 노드가 하나라도 있으면 그 노드를 스택에 넣고 방문처리를 함.
// 방문하지않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼냄
//
// 3.2의 과정을 수행 불가할때까지 반복

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 1001

typedef struct {
	int index;
	struct Node* next;
}Node;

Node** a; // 2차원 포인터로 할당
int n, m, c[MAX_SIZE];

void addFront(Node* root, int index) {
	Node* node = (Node*)malloc(sizeof(Node)); // Node타입의 node가 들어갈만한 메모리 크기를 할당
	node-> index = index; // node의 index는 
	node->next = root->next;
	root->next = node;
}
void dfs(int x) {
	if (c[x]) { return; } //c[x]가 true이면 return
	c[x] = 1; // 방문처리
	printf("%d ", x);
	Node* cur = a[x]->next;
	while (cur != NULL) {
		int next = cur->index;
		dfs(next);
		cur = cur->next;
	}
}
int main(void) {
	scanf("%d %d", &n, &m);
	a = (Node**)malloc(sizeof(Node*) * (MAX_SIZE));
	for (int i = 1; i <= n; i++) {
		a[i] = (Node*)malloc(sizeof(Node));
		a[i]->next = NULL;
	}
	for (int i = 0; i < m; i++) {
		int x, y;
		scanf("%d %d", &x, &y);
		addFront(a[x], y); // 서로가 서로를 이어줌 addFront를 통해
		addFront(a[y], x);
	}
	dfs(1);
	system("pause");
	return 0;
 }