#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main(void) {
	printf("손님이 몇명 왔나요?\n");
	int a;
	scanf("%d", &a );
	
	if (a == 1) {
		printf("1인석으로 모시겠습니다.\n");
	}
	else if (a > 1 && a <= 4) {
		printf("4인석으로 모시겠습니다.\n");
	}
	else {
		printf("따로따로 안내해드리겠습니다.\n");
	}

	printf("------------------------------\n");
	printf("메모리크기를 입력하시오");
	int size;
	scanf("%d", &size);
	if (size >= 16) {
		printf("메모리의 크기가 충분합니다.\n");
	}
	else if(size<16) {
		printf("메모리의 크기가 부족합니다. 메모리를 증설하십쇼.\n");
	}

	printf("------------------------------\n");

	printf("학점을 입력하시오.");
	
	char b;
	scanf("%c", &b);

	switch (b)
	{case 'a':
		printf("A학점입니다.\n");
		break;
	case 'b':
		printf("B학점입니다.\n");
		break;
	case 'c':
		printf("C학점입니다.\n");
		break;
	case 'd':
		printf("D학점입니다.\n");
		break;
	default:
		printf("학점을 올바르게 입력하시오.\n");

	}

	printf("------------------------------");

	int c;
	scanf("%d", &c);
	switch (c)
	{case 1: case 2: case 3:
		printf("봄"); break;
	case 4: case 5: case 6:
		printf("여름"); break;
	case 7: case 8: case 9:
		printf("가을"); break;
	case 10: case 11: case 12:
		printf("겨울"); break;
	default:
		printf("올바른 숫자를 입력하시오");
	}

	system("pause");
	return 0;
}