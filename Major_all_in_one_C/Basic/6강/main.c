#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	
	int i;
	for (int i = 0; i <= 100; i++) {
		printf("%d\n", i);
	}


	int n, sum = 0;
	printf("n을 입력하세요. ");
	scanf("%d", &n);

	for (int j = 1; j <= n; j++) {
		sum = sum + j;
	}
	printf("%d\n", sum);
    system("pause");
	
	return 0;
}