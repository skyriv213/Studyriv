#include<stdio.h>

/*
1차원 배열을 넘어 다양한 배열을 활용
2차원 배열의 경우 행렬 데이터를 표현할 때 그래프 알고리즘을 처리할 때, 다수의 실생활 데이터를 처리할 때 등
2차원 배열의 경우 1차원 배열이 중첩되었으므로 /  자료형 배열이름 [행][열] /로 표현을 합니다.
2차원 배열은 이중 반복문과 같이 자주사용
다차원 배열
컴퓨터는 다차원 배열을 2차원 형태로 표현을 한다.
포인터 배열
배열은 포인터와 동일한 방식으로 동작
배열의 이름은 배열의 우너소의 첫 번쨰 주소가 됩니다.
유일한 차이점은 포인터는 변수이며 배열의 이름은 상수입니다.
**
* 포인터는 연산을 통해 자료형의 크기만큼 이동합니다.
* 따라서 정수(int)형 포인터는 4바이트(Bytes)씩 이동합니다.
*/

//int a [3][3] = { {1,2,3}, {4,5,6}, {7,8,9} };
/*
int main(void) {
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}
	system("pause");
	return 0;
}

*/
/*
int a[2][3][3] = { { { 1 , 2 , 3 } , { 4 , 5 , 6  },  { 7 , 8 , 9  } , },
{ { 1 , 2 , 3 } , { 4 , 5 , 6 } , { 7 , 8 , 9 } } };

int main(void) {
	int i, j, k ;
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				printf("%d", a[i][j][k]);
			}
			printf("\n");
		}
		printf("\n");
	}
	system("pause");
	return 0;
}
*/
/*
int main(void) {
	int a[5] = { 1,2,3,4,5 };
	int* b = a[0]; //  배열의 이름은 배열의 첫 번째값과 동일하다.
	printf("%d\n", b[2]);
	system("pause");
	return 0;
}
*/
/*
int main(void) {
	int a[5] = { 1,2,3,4,5 };
	int i;
	for (int i = 0; i < 5; i++) {
		printf("%d ", a + i);
	}
	system("pause");
	return 0;
}
*/

int main(void) {
	double b[10];
	printf("%p %p\n", b, b + 9);
	system("pause");
	return 0;
}