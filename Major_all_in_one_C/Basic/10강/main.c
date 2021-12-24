#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<limits.h>


int main(void) {
	/*
	char a = 65;
	printf("%c\n", a);
	char b = getchar();
	printf("%c\n", b);
	system("pause");
	return 0;
	*/
	int a; char c;
	scanf("%d", &a);
	printf("%d\n", a);
	int temp;

	//한 자씩 받아서 파일의 끝이거나 개행 문자를 만나면 입력을 멈추므로 항상 입력 버퍼를 비웁니다.
	while ((temp = getchar()) != EOF && temp != '\n') { }
	scanf("%c", &c);
	printf("%c\n", c);
	system("pause");
	return 0;
}
/*
C프로그램은 기본적으로 사용자가 의도하지 않아도 자동으로 버퍼를 사용하여 입출력을 처리함
*/