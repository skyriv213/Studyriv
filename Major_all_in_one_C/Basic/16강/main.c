/*
����ü
���� ���� ������ ��� �ϳ��� ��ü�� ǥ���ϰ��� �� �� ����ü�� ����� �� �ִ�.
ĳ����, ����, �л�, ��ǥ �� �پ��� ��ü�� ��� ���α׷��� �� ����� ǥ���� �� �ִ�.

struct ����ü��{
	char studentid[10];
	char name[10];
	int grade;
	int major;
	};

����ü ������ ������ ���� ����(.)�� ���

	*/
#include<stdio.h>
typedef struct Student{
	char studentid[10];
	char name[10];
	int grade;
	char major[51];
} Student;

int main(void) {
	Student s = { "32197083", "��μ�", 3, "����Ʈ�����а�" };
	printf("�й� : %s\n", s.studentid);
	return 0;

}



