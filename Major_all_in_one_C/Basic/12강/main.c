/*
컴퓨터에서 프로그램이 실행되기 위해서는 프로그램이 메모리에 적재되어야함
프로그램의 크기를 충당할 수 있는 메모리 공간이 있어야함
일반적으로 컴퓨터 운영체제는 메모리를 4가지로 구분
코드/ 데이터/ 힙 / 스택
코드 : 소스코드
데이터 : 전역 / 정적변수
힙 : 동적할당 변수
스택 : 지역 / 매개변수

전역변수 
전체를 총괄, 프로그램의 어디서든 접근이 가능한 변수이다. 
main함수가 실행되기도 전에 프로그램의 시작과 동시에 메모리에 할당
프로그램의 크기가 커질 수록 전역 변수로 인해 프로그램이 복잡해질수 있다.
메모리의 데이터영역에 적재된다

지역변수
프로그램에서 특정한 블록에서만 접근 가능한 변수
함수가 실행될 때마다 메모리에 함수가 종료되면 메모리에서 해제
메모리의 스택 영역에 기록

정적변수
특정한 블록에서만 접근할 수 있는 변수
프로그램이 실헹될 떄 메모리에 할당되어 프로그램이 종료되면 메모리에서 해제
메모리의 데이터 영역에 적재


레지스터 변수
메인 메모리대신 cpu의 레지스터를 사용하는 변수
레지스터는 매우 한정되어 있으므로 실제로 레지스터에서 처리될 지는 장담 불가

함수의 매개변수가 처리될 때

함수를 호출할 때 함수에 필요한 데이터를 매개변수로 전달합니다.
값에 의한 전달 / 참조에 의한 전달
값에 의한 전달방식은 단지 값을 전달하므로 함수 내에서 변수가 새롭게 생성
참조에 의한 전달방식은 주소를 전달하므로 원래의 변수 자체에 접근이 가능
*/

#include <stdio.h>
int a = 5;
void changeValue() {
	a = 10;
}
/* 전역변수
int main(void) {
	printf("%d\n", a);
	changeValue();
	printf("%d\n", a);
	system("pause");
	return 0;

}
*/
/* 지역변수
int main(void) {
	int a = 5;
	if (1) {
		int a = 7;
	}
	printf("%d\n", a);
	system("pause");
	return 0;

}
*/
/* 정적변수
void process() {
	static int a = 5;
	a = a + 1;
	printf("%d\n", a);
}
int main(void) {
	process();
	process();
	process();
	process();
	system("pause");
	return 0;
}
*/
/* 레지스터 변수
int main(void) {
	register int a = 10,  i;
	for (i = 0; i < a; i++) {
		printf("%d", i);
	}
	system("pause");
	return 0;
}
*/
void add(int *a) {
	*a = (*a) + 10;
}
int main(void) {
	int a = 7;
	add(&a);
	printf("%d\n", a);
	system("pause");
	return 0;

}