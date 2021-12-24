//순차탐색과 이진탐색
//
//순차탐색 (sequential Search) 특정한 원소를 찾기 위해 원소를 순차적으로 하나씩 탐색
//
//이진탐색
//
//이진 탐색(Binary Search)은 배열 내부 데이터가 이미 정렬 되어 있는 상황에서 사용이 가능한 알고리즘이다.
//탐색 범위를 절반씩 좁혀가며 데이터를 탐색하는 특징이 있다.
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
			printf("%d번째 원소입니다.\n", i + 1);
			founded = 1;
		}
	}
	if (!founded) {
		printf("원소를 찾을 수 없습니다.\n");
	}
	system("pause");
	return 0;
}

