#include <stdio.h>
#include <string.h>

/*
문자열은 말 그대로 문자들의 배열
문자열은 컴퓨터 메모리 구조상에서 마지막에 null을 포함한다.
널값의 필요이유는 문자열의 끝을 알리는 목적으로 사용
printf를 실행시 컴퓨터는 내부적으로 null값을 만날 때까지 출력한다

문자열 형태로 포인터를 사용하면 포인터에 특정한 문자열의 주소를 넣게 됩니다. 
*/

int main(void) {
	/*
	char* a = "hello world";
	// 문자열 형태로 포인터를 사용하면 포인터에 특정한 문자열의 주소를 넣게 됩니다. 
	// 다음 코드는 "hello world" 문자열을 읽기전용으로 메모리 공간에 넣은 뒤 그 위치를 처리한다
	//
	printf(" % s\n", a);
	system("pause");
	return 0;
	*/
	/*
	문자열 입출력 함수 
	문자열의 입출력을 수행한다.
	scanf() 함수는 공백을 만날 때까지 입력 받지만 gets() 함수는 공백을 포함하여 한 줄까지 입력받는다.
	*/
	/*
	char a[100];
	gets(a); 
	// 공백까지 문자로, 배열의 전체범위을 고려하지않아 보안상에 문제가 생길 수 있다. 
	// 추후 실무에서는 gets_s()함수를 사용하게 된다. 특정한 범위까지만 문자를 입력받을 수 있게 한다. 버퍼의 크기를 철저하게 지켜야함
	gets_s(a, sizeof(a));
	printf("%s\n", a);
	system("pause");
	return 0;
	*/

	char a[20] = "minsoo gim";
	char b[20] = "kinsoo gim";

	printf("% d\n", strlen(a));
	printf("% d\n", strcmp(a,b));

	system("pause");
	return 0;

	}
	

