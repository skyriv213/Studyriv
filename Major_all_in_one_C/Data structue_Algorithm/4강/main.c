/*
����
���� �ڷᱸ���� ����� Ȱ�� ����� ���� ����
c�� �̿��� ���� �ڷᱸ���� ���� ����

������ �������� ���� �������� ������ �ڷᱸ�� 
�̷��� Ư�� ������ ���İ����� �˰��򿡼� �ٹ������ Ȱ��

push : ���ÿ� �����͸� �ִ´�
pop : ���ÿ��� �����͸� ������.

�Ϲ������� ����Ʈ�� ���¸� ���


*/

#include<stdio.h>
#include<stdlib.h>
#define size 10000
#define INF 99999999


int stack[size];
int top = -1; // ������ �ֻ���� �ǹ� , 

void push(int data) {
	if (top == size - 1){
		printf("����  �����÷ο찡 �߻��Ͽ����ϴ�.\n");
		return ;
	}
	stack[++top] = data;
}
void pop(int data) {
	if (-1 == top) {
		printf("���� ����÷ο찡 �߻��߽��ϴ�.\n");
		return -INF;
	}
	return stack[top--];
}

void show() {
	printf("---������ �ֻ��---");
	for (int i = top; i >= 0; i--) {
		printf("%d\n", stack[i]);
	}
	printf("---������ ���ϴ�---");
}

int main(void) {
	system("pause");
	return;
}