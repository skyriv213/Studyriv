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

	//�� �ھ� �޾Ƽ� ������ ���̰ų� ���� ���ڸ� ������ �Է��� ���߹Ƿ� �׻� �Է� ���۸� ���ϴ�.
	while ((temp = getchar()) != EOF && temp != '\n') { }
	scanf("%c", &c);
	printf("%c\n", c);
	system("pause");
	return 0;
}
/*
C���α׷��� �⺻������ ����ڰ� �ǵ����� �ʾƵ� �ڵ����� ���۸� ����Ͽ� ������� ó����
*/