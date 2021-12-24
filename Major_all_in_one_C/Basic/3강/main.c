#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	double a;
	scanf("%lf", &a);
	printf("%.2f\n", a); // 소숫점 둘째자리까지 출력

	int x, y, z;
	scanf("%1d%1d%1d", &x, &y , &z);
	printf("%d %d %d\n", y, x, z);
	system("pause");
	return 0;
}
/*
비쥬얼 스튜디오는 기본적으로 취약한 함수를 사용할 수 없도록 제한한다. 
다만 공부를 하면서 진행을 위해 scanf를 이용

scanf를 사용시 & 기호를 사용하는데 &의 경우 특정한 변수의 주소를 의미한다.
특정한 메모리 주소레 접근하여 데이터를 수정하므로 &를 이용
메모리 주소에 얼마만큼의 크기로 데이터를 사용할지 지정하는걸 형식 지정자(int, double, string , etc)

int - %d
long long - %lld
double -  %lf
float - %f
string - %s
char - %c

각자 본인의 앞글자를 따서 가져온다. int, double 제외
double의 경우 %lf를 사용하지만 출력시 %f를 사용
%를 출력하고 싶을시 %%로 입력하면 된다.

*/