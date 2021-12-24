//삽입정렬 / 선택정렬
//
//선택정렬이란 가장 작은 것을 선택해서 앞으로 보내는 정렬
//가장 작은 것을 선택하는것에 n번, 앞으로 보내는데 n번의 연산으로 n^2의 연산을 가짐
// 
//삽입정렬
//새로운 카드를 기존의 정렬된 카드 사이의 올바른 자리를 찾아 삽입한다.
//새로 삽입될 카드의 수만큼 반복하게 되면 전체 카드가 정렬된다.
//자료 배열의 모든요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하며, 자신의 위치를 찾아 삽입함으로 
//정렬을 완성하는 알고리즘
//매 순서마다 해당 원소를 삽입할 수 있는 위치를 찾아 해당 위치에 넣는다.
//
//삽입정렬은 두 번째 자료부터 시작해서 그 앞(왼쪽)의 자료들과 비교하여 삽입할 위치를 지정한 후 
//자료를 뒤로 옮기고 지정한 자리에 자료를 삽입하여 정렬하는 알고리즘
//
//즉 두 번째 자료는 첫 번째 자료, 세번째 자료는 두 번째와 첫 번째 자료 식으로 비교를 한 후 삽입될
//위치를 찿는다. 자료가 삽입될 위치를 찾았다면 그 위치에 자료를 삽입하기 위해 자료를 한 칸씩 뒤로 이동시킨다.
//
//처음 key값의 시작은 두 번째부터이다. 

#define _CRT_SEC
URE_NO_WARNINGS
#include <stdio.h>
#include <limits.h>
#define SIZE 1000

int a[SIZE];

int swap(int* a, int* b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}

int main(void) {
	int n, min, index;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	/*for (int i = 0; i << n; i++) {
		min = INT_MAX;
		for (int j = i; j < n; j++) {
			if (min > a[j]) {
				min = a[j];
				index = j;
			}
		}
		swap(&a[i], &a[index]);
	}*/

	for (int i = 0; i < n - 1; i++) {
		int j = i;
		while (j >= 0 && a[j] > a[j + 1]) {
			swap(&a[j], &a[j + 1]);
			j--;
		}
	}
	
	for (int i = 0; i < n; i++) {
		printf("%d", a[i]);
	}
	system("pause");
	return 0;
}

