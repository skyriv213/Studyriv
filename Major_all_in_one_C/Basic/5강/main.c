#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main(void) {
	printf("�մ��� ��� �Գ���?\n");
	int a;
	scanf("%d", &a );
	
	if (a == 1) {
		printf("1�μ����� ��ðڽ��ϴ�.\n");
	}
	else if (a > 1 && a <= 4) {
		printf("4�μ����� ��ðڽ��ϴ�.\n");
	}
	else {
		printf("���ε��� �ȳ��ص帮�ڽ��ϴ�.\n");
	}

	printf("------------------------------\n");
	printf("�޸�ũ�⸦ �Է��Ͻÿ�");
	int size;
	scanf("%d", &size);
	if (size >= 16) {
		printf("�޸��� ũ�Ⱑ ����մϴ�.\n");
	}
	else if(size<16) {
		printf("�޸��� ũ�Ⱑ �����մϴ�. �޸𸮸� �����Ͻʼ�.\n");
	}

	printf("------------------------------\n");

	printf("������ �Է��Ͻÿ�.");
	
	char b;
	scanf("%c", &b);

	switch (b)
	{case 'a':
		printf("A�����Դϴ�.\n");
		break;
	case 'b':
		printf("B�����Դϴ�.\n");
		break;
	case 'c':
		printf("C�����Դϴ�.\n");
		break;
	case 'd':
		printf("D�����Դϴ�.\n");
		break;
	default:
		printf("������ �ùٸ��� �Է��Ͻÿ�.\n");

	}

	printf("------------------------------");

	int c;
	scanf("%d", &c);
	switch (c)
	{case 1: case 2: case 3:
		printf("��"); break;
	case 4: case 5: case 6:
		printf("����"); break;
	case 7: case 8: case 9:
		printf("����"); break;
	case 10: case 11: case 12:
		printf("�ܿ�"); break;
	default:
		printf("�ùٸ� ���ڸ� �Է��Ͻÿ�");
	}

	system("pause");
	return 0;
}