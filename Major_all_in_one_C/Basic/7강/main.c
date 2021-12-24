#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void dice(int input) {
	printf("민수가 던진 주사위의 값 %d\n", input);
}
int add(int a, int b) {
	return a + b;
}

void caclaulator(int a, int b) {
	printf("%d + %d = %d\n", a, b, a + b);
	printf("%d - %d = %d\n", a, b, a - b);
	printf("%d * %d = %d\n", a, b, a * b);
	printf("%d / %d = %d\n", a, b, a / b);
	printf("%d %% %d = %d\n", a, b, a % b);
}

int factorial(int a) {
	if (a==1) {
		return 1;
	}
	else {
		return a * factorial(a - 1);
	}
}

int main(void) {
	dice(3);
	dice(5);
	dice(1);
	printf("%d\n", add(10, 20));
	caclaulator(10, 20);
	printf("%d\n",factorial(5));
	system("pause");
	return 0;
}
