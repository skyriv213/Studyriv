//����Ž���� ����Ž��
//
//����Ž�� (sequential Search) Ư���� ���Ҹ� ã�� ���� ���Ҹ� ���������� �ϳ��� Ž��
//
//����Ž��
//
//���� Ž��(Binary Search)�� �迭 ���� �����Ͱ� �̹� ���� �Ǿ� �ִ� ��Ȳ���� ����� ������ �˰����̴�.
//Ž�� ������ ���ݾ� �������� �����͸� Ž���ϴ� Ư¡�� �ִ�.
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define LENGTH 100
#define MAX_SIZE 10000
char** array;
int founded;

int a[MAX_SIZE];
int founded1 = 0;

int search(int start, int end, int target) {
	if (start > end) {
		return -9999;
	}
	int mid = (start + end) / 2;
	if (a[mid] == target) {
		return mid;
	} 
	else if (a[mid] > target) {
		return search(start, mid - 1, target);
	}
	else {
		return search(mid + 1, end, target);
	}

}


int main(void) {
	int n;
	char* word;
	word = malloc(sizeof(char) * LENGTH);
	scanf("%d %s", &n, word);
	array = (char**)malloc(sizeof(char*) * n);
	for (int i = 0; i < n; i++) {
		array[i] = malloc(sizeof(char) * LENGTH);
		scanf("%s", array[i]);
	}
	for (int i = 0; i < n; i++) {
		if (!strcmp(array[i], word)) {
			printf("%d��° �����Դϴ�.\n", i + 1);
			founded = 1;
		}
	}
	if (!founded) {
		printf("���Ҹ� ã�� �� �����ϴ�.\n");
	}
	system("pause");
	return 0;
}

