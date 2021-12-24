/*
연결리스트 
일반적으로 배열을 사용하여 데이터를 순차적으로 저장하고 나열할 수 있다.
그러나 배열의 경우 크기가 정해져 있으며 그 크기 때문에 메모리 공간이 불필요하게 낭비가 될 가능성이 있다.

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