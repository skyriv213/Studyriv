/*
���Ḯ��Ʈ 
�Ϲ������� �迭�� ����Ͽ� �����͸� ���������� �����ϰ� ������ �� �ִ�.
�׷��� �迭�� ��� ũ�Ⱑ ������ ������ �� ũ�� ������ �޸� ������ ���ʿ��ϰ� ���� �� ���ɼ��� �ִ�.

*/

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define INF 10000

int arr[INF];
int count = 0;

void addBack(int data) {
	arr[count] = data;
	count++;
}

void addFirst(int data) {
	for (int i = count; i >= 1; i--) {
		arr[i] = arr[i - 1];
	}
	arr[0] = data;
	count++;
}
void show() {
	for (int i = 0; i < count; i++) {
		printf("%d", arr[i]);
	}
}

int main(void) {
	addBack(5);
	addBack(8);
	addBack(7);
	addBack(5);
	addBack(6);

	system("pause");
	return 0;
}