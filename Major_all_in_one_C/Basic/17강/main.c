/*
파일입출력
프로그램이 꺼진 이후에도 데이터를 저장하기 위해 파일 입출력이 필요
파일이 실질적으로 저장되는 위치는 SSD 

파일 입출력 변수는 FILE 형식의 포인터 변수로 선언
파일을 열 떄는 fopen()함수를 이용

r : 파일에 접근하여 데이터를 읽습니다.
w : 파일에 접근하여 데이터를 기록합니다.(이미 존재하면 덮어쓰기)
a : 파일에 접근하여 데이터를 뒤에서부터 기록

파일을 닫을 때는 fclose()함수를 사용


파일 입출력에서 사용되는 입출력 함수
fprintf(파일 포인터, 서식, 형식지정자);
fscanf(파일 포인터, 서식, 형식지정자);


파일 입출력의 과정
파일 입출력은 열고, 읽고/쓰고 닫기의 과정을 철저히 지켜야함
파일을 열 때는 파일 퐁니터가 사용되며, 이는 동적으로 할당된 것
따라서 파일 처리 이후에 파일을 닫아주지 않으면 메모리 누수가 발생

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
		printf("이름: %s", "성적 :%d\n", (student + i)->name, (student + i)->score);
	}
	system("pause");
	return 0;
}
	

