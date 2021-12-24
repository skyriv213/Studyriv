/*
스택
스택 자료구조의 개념과 활용 방법에 대해 이해
c언어를 이용해 스택 자료구조를 직접 구현

스택은 한쪽으로 들어가서 한쪽으로 나오는 자료구조 
이러한 특성 떄문에 수식계산등의 알고리즘에서 다방면으로 활용

push : 스택에 데이터를 넣는다
pop : 스택에서 데이터를 빼낸다.

일반적으로 리스트의 형태를 띈다


*/

#include<stdio.h>
#include<stdlib.h>
#define size 10000
#define INF 99999999


int stack[size];
int top = -1; // 스택의 최상단을 의미 , 

void push(int data) {
	if (top == size - 1){
		printf("스택  오버플로우가 발생하였습니다.\n");
		return ;
	}
	stack[++top] = data;
}
void pop(int data) {
	if (-1 == top) {
		printf("스택 언더플로우가 발생했습니다.\n");
		return -INF;
	}
	return stack[top--];
}

void show() {
	printf("---스택의 최상단---");
	for (int i = top; i >= 0; i--) {
		printf("%d\n", stack[i]);
	}
	printf("---스택의 최하단---");
}

int main(void) {
	system("pause");
	return;
}