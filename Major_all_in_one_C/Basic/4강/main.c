/*
c언어에서 사용되는 기본적인 연산자 문법을 공부합니다.
연산자의 우선순위를 이해하여 다양한 연산을 수행합니다.
*/

/*
연산자란 연산을 수행하는 기호
피연산자는 연산에 포함되는 변수나 상수를 의미
a+b a,b는 피연산자, +는 연산자
*/

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int a, b;
	scanf("%d %d", &a, &b);
	printf("%d+%d=%d\n", a, b, a + b);
	printf("%d-%d=%d\n", a, b, a - b);
	printf("%d*%d=%d\n", a, b, a * b);
	printf("%d/%d=%d\n", a, b, a / b);
	printf("%d %% %d=%d\n", a, b, a % b);

	printf("%d\n", (a == b) ? 100 : -100);
	system("pause");
	return 0;

}

/*
삼항연산자 : 새개의 항을 이용해서 조건문을 수행할 수 있는 연산자
*/

