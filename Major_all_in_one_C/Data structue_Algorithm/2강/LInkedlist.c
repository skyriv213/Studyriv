/*
���Ḯ��Ʈ
�Ϲ������� ���Ḯ��Ʈ�� ����ü�� �����͸� �Բ� ����Ͽ� ����
���� ����Ʈ�� ����Ʈ�� �߰� ������ ��带 �߰��ϰų� ������ �� �־����
�迭���� �ٸ��� �ʿ��� ������ �޸� ������ �Ҵ� �޴´�.


��������
���԰� ������ɿ��� ���ܻ����� ó���� �ʿ䰡 ����
������ ���Ұ� ���µ� ������ ���, �Ӹ� ��带 �߸� ���� ��츦 �� üũ�ؾ���

���԰� ������ �迭�� ���� �����ϴٴ� ����
�迭�� �ٸ��� Ư�� �ε����� ��� �����ϴ� ����� ���� x, ���Ҹ� ���ʴ�� �˻�
�߰������� �����ͺ����� ���ǹǷ� �޸� ������ ����

���Ḯ��Ʈ�� �����͸� ���������� �����ϰ� ó���ϴ� ���
������ �迭�� �̿����� ������ ���԰� ������ ���� ��쿡�� ȿ����
Ư���� �ε����� �ٷ� �ҷ��;� �ϴ°�쿡�� �迭�� ���� ȿ����
*/

#define _CRT_SECURE_NO_WWARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct {
	int data;
	struct Node* next;
} Node;

Node* head;
// �����ͺ����� �����Ҵ��� �̿��ؼ� ����

void addFront(Node* root, int data) {
	Node* node = (Node*)malloc(sizeof(Node));
	node->data = data;
	node->next = root->next;
	root->next = node;
}

void removeFront(Node* root) {
	Node* front = root->next;
	root->next = front->next;
	free(front);
}

void freeAll(Node* root) {
	Node* cur = head->next;
	while (cur != NULL) {
		Node* next = cur->next;
		free(cur);
		cur = next;
	}
}


int main(void) {
	head = (Node*)malloc(sizeof(Node));
	Node* node1 = (Node*)malloc(sizeof(Node));
	node1->data = 1;
	Node* node2 = (Node*)malloc(sizeof(Node));
	node1->data = 2;
	head->next = node1;
	node1->next = node2;
	node2->next = NULL;
	Node* cur = head->next;
	while (cur != NULL) {
		printf("%d", cur->data);
		cur = cur->next;
	}



	system("puase");
	return 0;
}