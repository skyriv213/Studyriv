//���� �켱 Ž��
//
//���� �켱 Ž��(Depth First Search)�� Ž���� �Կ� �־ ���� ���� ���� �켱������ �Ͽ� Ž���ϴ� �˰���
//���� �켱Ž���� �⺻������ ��ü ��带 �͸������� Ž���ϰ��� �� �� ���
//���� �켱 Ž�� �˰����� ����(stack)�ڷᱸ���� ����
// �����δ� ������ ������� �ʾƵ� �����ϸ� Ž���� �����Կ� �־� O(N)�� �ð��� �ҿ�
//
//���� �켱 Ž���� ������ ��� ����� ���� Ž���ϰ��� �� �� ���� ���

// 1.Ž�� ���� ��带 ���ÿ� ����/ �湮ó�� 
//
// 2.������ �ֻ�� ��忡�� �湮���� ���� ���� ��尡 �ϳ��� ������ �� ��带 ���ÿ� �ְ� �湮ó���� ��.
// �湮�������� ���� ��尡 ������ ���ÿ��� �ֻ�� ��带 ����
//
// 3.2�� ������ ���� �Ұ��Ҷ����� �ݺ�

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 1001

typedef struct {
	int index;
	struct Node* next;
}Node;

Node** a; // 2���� �����ͷ� �Ҵ�
int n, m, c[MAX_SIZE];

void addFront(Node* root, int index) {
	Node* node = (Node*)malloc(sizeof(Node)); // NodeŸ���� node�� ������ �޸� ũ�⸦ �Ҵ�
	node-> index = index; // node�� index�� 
	node->next = root->next;
	root->next = node;
}
void dfs(int x) {
	if (c[x]) { return; } //c[x]�� true�̸� return
	c[x] = 1; // �湮ó��
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
		addFront(a[x], y); // ���ΰ� ���θ� �̾��� addFront�� ����
		addFront(a[y], x);
	}
	dfs(1);
	system("pause");
	return 0;
 }