// 기수정렬
// Radix Sort - 기수정렬 - 는 자릿수를 기준으로 차례대로 데이터를 정렬하는 알고리즘.
// 각 데이터를 자릿수를 기준으로 분류하므로 가장 큰 자릿수를 D라고 했을 때 O(DN)의 시간복잡도를 가진다.
// 계수 정렬보다 약간 더 느리지만, 숫자가 매우 큰 상황에서도 사용할 수 있습니다

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define MAX 10000

void radixSort(int* a, int n) {
	int res[MAX], maxValue = 0;
	int exp = 1;
	for (int i = 0; i < n; i++) {
		if (a[i] > maxValue) {
			maxValue = a[i]; // 최댓값을 지정하기 위한 반복루프
		}
	}
	while (maxValue / exp > 0) { // 1의 자리부터 계산 , 몫이 소숫점으로 떨어지는 순간 0보다 크므로 반복문의 종료
		int bucket[10] = { 0 }; // 0으로 채워진 bucket이라는 배열을 선언
		for (int i = 0; i < n; i++) {
			bucket[a [i]/ exp % 10 ]++; // 자릿수 배열 처리 ,  처음에는 10의 자리로 나눈뒤 인덱스의 자리에 1씩 증가
		}
		for (int i = 1; i < 10; i++) { // 누적계산 // 1,2,3,4,5,6 식으로 존재를 한다면 누적계산을 통해서 얻은 값은 1,3,6...
			bucket[i] += bucket[i - 1];
		}
		for (int i = n - 1; i >= 0; i--) { //같은 자릿수 끼리는 순서를 유지 , 끝에서부터 꺼내서 정렬하기
			res[--bucket[a[i] / exp % 10]] = a[i];
		}
		for (int i = 0; i < n; i++) { // 기본 배열 갱신
			a[i] = res[i];
			exp *= 10; // exp를 10씩 곱해서 다음에는 1의 자리가 아닌 10의 자리에서 곱해주기
		}
	}
	
}

int main(void) {
	int a[MAX];
	int i, n;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	radixSort(a, n);
	for (int i = 0; i < n; i++) {
		printf("%d", &a[i]);
	}
	system("pause");
	return  0;
}