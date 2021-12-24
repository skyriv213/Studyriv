/*
구조체
여러 개의 변수를 묶어서 하나의 객체를 표현하고자 할 떄 구조체를 사용할 수 있다.
캐릭터, 몬스터, 학생, 좌표 등 다양한 객체를 모두 프로그래밍 언어를 사용해 표현할 수 있다.

struct 구조체명{
	char studentid[10];
	char name[10];
	int grade;
	int major;
	};

구조체 변수에 접근할 떄는 온점(.)을 사용

	*/
#include<stdio.h>
typedef struct Student{
	char studentid[10];
	char name[10];
	int grade;
	char major[51];
} Student;

int main(void) {
	Student s = { "32197083", "김민수", 3, "소프트웨어학과" };
	printf("학번 : %s\n", s.studentid);
	return 0;

}



