// 계수정렬
// counting sort / 크기를 기준으로 데이터의 개수를 세는 정렬 알고리즘
// 처음 배열의 크기를 크게 잡고 시작하기에 메모리의 용량을 크게 잡아서 사용하지만 그만큼 빠른 성능을 보여준다.
// 데이터의 크기가 한정적일 때 사용한다.
// 각 데이터를 바로 크기를 기준으로 분류하므로 o(n)의 시간 복잡도를 가짐


#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define MAX_VALUE 10001

int n,m;
int a[MAX_VALUE];

int main(void) {
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &m); // scanf로 수를 입력 받을때마다 
		a[m]++; // 해당 m을 인덱스로 하는 a[인덱스]의 값을 1씩 증가시킨다. 이러한 과정자체가 정렬이 되는 것이다.
	}
	for (int i = 0; i < MAX_VALUE; i++) { // 배열의 최대 인덱스까지 반복문을 진행한다.
		while (a[i] != 0) { // while 반복문으로 만약 a[i]가 0이 아니라면 
			printf("%d", i); // printf로  i, 즉 인덱스이자 지정된 수를 출력하고
			a[i] --; // -1씩 카운팅을 해준다.
		}
	}
}
