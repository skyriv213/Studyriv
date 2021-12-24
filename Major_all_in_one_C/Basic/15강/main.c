/*
함수의 포인터
함수의 이름은 메모리 주소를 반환합니다.
함수 포인터는 특정한 함수의 반환 자료형을 지정하는 방식으로 선언할 수 있다. 
함수 포인터를 이용하면 형태가 같은 서로 다른 기능의 함수를 선택적으로 사용할 수 있다.
반환 자료형(*함수명)(매개변수) =  함수명;
*/
#include <stdio.h>
void myfunction() {
	printf("it's my function\n");
	}
void yourfunction() {
	printf("it's your function\n");
	}

int add(int a, int b) {
	return a + b;
	}
int sub(int a, int b) {
		return a - b;
	}
// 함수 포인터를 반환하여 사용하기
int (*process(char* a))(int, int) {
	printf("%s\n", a);
	return add;
}
/*

*/



int main(void) {
	/*
	function();
	printf("%d\n", function);
	*/
	/*
	void(*fp)() = myfunction;
	fp();
	fp = yourfunction;
	fp();
	*/
	/*
	int(*fp)(int, int) = add;
	printf("%d\n", fp(10, 3));
	fp = sub;
	printf("%d\n", fp(10, 3));
	*/
	printf("%d\n", process("10과 20을 더해보겠습니다.")(10, 20));

	system("pause");
	return 0;
}