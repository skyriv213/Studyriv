//퀵 정렬
//퀵 정렬이란 피벗을 기준으로 큰 값과 작은 값을 서로 교체하는 정렬 기법이다.
//값을 서로 교체하는데 n번 엇갈린 경우 교체 이후에 원소가 반으로 나눠지므로 
//전체 원소를 나누는데에 평균적으로 log n번이 소요되므로 
////시간복잡도는 o(nlog(n))의 시간 복잡도를 가진다.
//예시는 완전이진트리

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define Size 1000

int a[Size];

int swap(int* a, int* b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}

void quickSort(int start, int end) {
	if (start >= end) {
		return;
	}
	int key = start, i = start + 1, j = end, temp;
	while (i <= j) { // 엇갈릴 때까지 반복합니다.
		while (i <= end && a[i] <= a[key]) {
			i++;
		}
		while (j > start && a[j] >= a[key]) {
			j--;
		}
		if (i > j) {
			swap(&a[key], &a[j]);
		}
		else {
			swap(&a[i], &a[j]);
		}
	}
	quickSort(start, j - 1);
	quickSort(j + 1, end);

}

int main(void) {
	int n;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	quickSort(0, n - 1);
	for (int i = 0; i < n; i++) {
		printf("%d", a[i]);
	}
	system("pause");
	return 0;
}