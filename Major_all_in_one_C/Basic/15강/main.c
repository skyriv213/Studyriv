/*
�Լ��� ������
�Լ��� �̸��� �޸� �ּҸ� ��ȯ�մϴ�.
�Լ� �����ʹ� Ư���� �Լ��� ��ȯ �ڷ����� �����ϴ� ������� ������ �� �ִ�. 
�Լ� �����͸� �̿��ϸ� ���°� ���� ���� �ٸ� ����� �Լ��� ���������� ����� �� �ִ�.
��ȯ �ڷ���(*�Լ���)(�Ű�����) =  �Լ���;
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
// �Լ� �����͸� ��ȯ�Ͽ� ����ϱ�
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
	printf("%d\n", process("10�� 20�� ���غ��ڽ��ϴ�.")(10, 20));

	system("pause");
	return 0;
}