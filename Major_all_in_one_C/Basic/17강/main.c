/*
���������
���α׷��� ���� ���Ŀ��� �����͸� �����ϱ� ���� ���� ������� �ʿ�
������ ���������� ����Ǵ� ��ġ�� SSD 

���� ����� ������ FILE ������ ������ ������ ����
������ �� ���� fopen()�Լ��� �̿�

r : ���Ͽ� �����Ͽ� �����͸� �н��ϴ�.
w : ���Ͽ� �����Ͽ� �����͸� ����մϴ�.(�̹� �����ϸ� �����)
a : ���Ͽ� �����Ͽ� �����͸� �ڿ������� ���

������ ���� ���� fclose()�Լ��� ���


���� ����¿��� ���Ǵ� ����� �Լ�
fprintf(���� ������, ����, ����������);
fscanf(���� ������, ����, ����������);


���� ������� ����
���� ������� ����, �а�/���� �ݱ��� ������ ö���� ���Ѿ���
������ �� ���� ���� �����Ͱ� ���Ǹ�, �̴� �������� �Ҵ�� ��
���� ���� ó�� ���Ŀ� ������ �ݾ����� ������ �޸� ������ �߻�

*/

#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct {
	char name[20];
	int score;
} Student;

int main(void) {
	/*
	char s[20] = "hello world";
	FILE* fp;
	fp = fopen("text.txt", "w");
	fprintf(fp, "%s\n", s);
	fclose(fp);
	*/
	int n, sum = 0; 
	FILE* fp;
	fp = fopen("input.txt", "r");
	fscanf(fp, "%d", &n);
	Student* student = (Student*)malloc(sizeof(Student) * n);
	for (int i = 0; i < n; i++) {
		fscanf(fp, "%s %d", &((student + i)->name), &((student + i)->score));
		printf("�̸�: %s", "���� :%d\n", (student + i)->name, (student + i)->score);
	}
	system("pause");
	return 0;
}
	

