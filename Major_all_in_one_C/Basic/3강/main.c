#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	double a;
	scanf("%lf", &a);
	printf("%.2f\n", a); // �Ҽ��� ��°�ڸ����� ���

	int x, y, z;
	scanf("%1d%1d%1d", &x, &y , &z);
	printf("%d %d %d\n", y, x, z);
	system("pause");
	return 0;
}
/*
����� ��Ʃ����� �⺻������ ����� �Լ��� ����� �� ������ �����Ѵ�. 
�ٸ� ���θ� �ϸ鼭 ������ ���� scanf�� �̿�

scanf�� ���� & ��ȣ�� ����ϴµ� &�� ��� Ư���� ������ �ּҸ� �ǹ��Ѵ�.
Ư���� �޸� �ּҷ� �����Ͽ� �����͸� �����ϹǷ� &�� �̿�
�޸� �ּҿ� �󸶸�ŭ�� ũ��� �����͸� ������� �����ϴ°� ���� ������(int, double, string , etc)

int - %d
long long - %lld
double -  %lf
float - %f
string - %s
char - %c

���� ������ �ձ��ڸ� ���� �����´�. int, double ����
double�� ��� %lf�� ��������� ��½� %f�� ���
%�� ����ϰ� ������ %%�� �Է��ϸ� �ȴ�.

*/