/*
c���� ���Ǵ� �⺻���� ������ ������ �����մϴ�.
�������� �켱������ �����Ͽ� �پ��� ������ �����մϴ�.
*/

/*
�����ڶ� ������ �����ϴ� ��ȣ
�ǿ����ڴ� ���꿡 ���ԵǴ� ������ ����� �ǹ�
a+b a,b�� �ǿ�����, +�� ������
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
���׿����� : ������ ���� �̿��ؼ� ���ǹ��� ������ �� �ִ� ������
*/

