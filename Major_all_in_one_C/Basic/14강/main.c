/*
일반적으로 c언어에서 배열의 경우 사전에 적절한 크기만큼 할당해줘야한다
우리가 원하는 만큼만 메모리를 할당해서 사용하고자 한다면 동적 메모리 할당을 사용합니다.
동적이라는 말의 의미는 '프로그램의 실행 도중에'라는 의미이다.

c언어에서는 malloc()함수를 이용해 원하는 만큼의 메모리 공간을 확보할 수 있다.
malloc() 함수는 메모리 할당에 성공하면 주소룰 반환하고, 그렇지 않으면 null을 반환한다.
malloc() 함수는 <stdlib.h> 라이브러리에 정의되어있다.
malloc(할당할 바이트 크기);
동적메모리 할당을 수행할 때마다 할당되는 주소의 값은 랜덤이다.
동적할당은 힙영역에 저장이 된다.
전통적 C언어에서는 스택에 선언된 변수는 따로 메모리 해제를 해주지않아도 된다.
동적으로 선언된 변수는 반드시 free()로 메모리해제를 해줘야함
메모리 해제를 하지않으면 메모리 내의 프로세스 무게가 더해져 언젠가는 오류가 발생함
메모리 누수 방지는 코어개발자의 핵심
malloc() / free() 함수는 한쌍
--------------------------------------------------------------------------------------
동적으로 문자열 처리하기
일괄적인 범위의 메모리를 모두 특정한 값으로 설정하기 위해서는 memset()을 사용한다.
memset(포인터, 값, 크기);
한 바이트 씩 값을 저장하므로 문자열 배열의 처리 방식과 흡사
따라서 memset()함수는 <string.h>라이브러리에 선언되어 있다. 
*/
#include<stdio.h>
#include<stdlib.h>
#include <string.h>
/*
int main(void) {
	int* a = malloc(sizeof(int));
	printf("%d\n", a);
	free(a);
	a = malloc(sizeof(int));
	printf("%d\n", a);
	system("pause");
	return 0;
}
*/
/*
int main(void) {
	char* a = malloc(100);
	memset(a, 'A', 100);
	for (int i = 0; i < 100; i++) {
		printf("%c", a[i]);
	}
	system("pause");
	return 0;
}
*/
int main(void) {
	int** p = (int**)malloc(sizeof(int*) * 3);
	// 이중포인트로 선언, 행을 만들것, 행의 개수는 3개이므로 * 3,
	for (int i = 0; i < 3; i++) {
		*(p + i) = (int*)malloc(sizeof(int) * 3);
		//초기화를 하면서 (p+i) 각각의 행, 그리고 3개의 열을 가지게 함 , 3 * 3 행렬을 표현
	}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; i < 3; i++) {
			*(*(p + i) + j) = i * 3 + j; 
		}
	}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			printf("%d ", *(*(p + i) + j));
		}
		printf("\n");
	}
	system("pause");
	return 0;
}