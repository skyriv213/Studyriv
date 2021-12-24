// �������
// Radix Sort - ������� - �� �ڸ����� �������� ���ʴ�� �����͸� �����ϴ� �˰���.
// �� �����͸� �ڸ����� �������� �з��ϹǷ� ���� ū �ڸ����� D��� ���� �� O(DN)�� �ð����⵵�� ������.
// ��� ���ĺ��� �ణ �� ��������, ���ڰ� �ſ� ū ��Ȳ������ ����� �� �ֽ��ϴ�

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define MAX 10000

void radixSort(int* a, int n) {
	int res[MAX], maxValue = 0;
	int exp = 1;
	for (int i = 0; i < n; i++) {
		if (a[i] > maxValue) {
			maxValue = a[i]; // �ִ��� �����ϱ� ���� �ݺ�����
		}
	}
	while (maxValue / exp > 0) { // 1�� �ڸ����� ��� , ���� �Ҽ������� �������� ���� 0���� ũ�Ƿ� �ݺ����� ����
		int bucket[10] = { 0 }; // 0���� ä���� bucket�̶�� �迭�� ����
		for (int i = 0; i < n; i++) {
			bucket[a [i]/ exp % 10 ]++; // �ڸ��� �迭 ó�� ,  ó������ 10�� �ڸ��� ������ �ε����� �ڸ��� 1�� ����
		}
		for (int i = 1; i < 10; i++) { // ������� // 1,2,3,4,5,6 ������ ���縦 �Ѵٸ� ��������� ���ؼ� ���� ���� 1,3,6...
			bucket[i] += bucket[i - 1];
		}
		for (int i = n - 1; i >= 0; i--) { //���� �ڸ��� ������ ������ ���� , ���������� ������ �����ϱ�
			res[--bucket[a[i] / exp % 10]] = a[i];
		}
		for (int i = 0; i < n; i++) { // �⺻ �迭 ����
			a[i] = res[i];
			exp *= 10; // exp�� 10�� ���ؼ� �������� 1�� �ڸ��� �ƴ� 10�� �ڸ����� �����ֱ�
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