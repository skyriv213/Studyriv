/*
스택을 활용힌 계산기 만들기

중위 표기법을 후위표기법으로
후위표기법을 계산하여 결과 값을 도출하는 방법을 이해

중위 표기법 : 일반적으로 사람이 수식을 표기할 떄 사용하는 방법
7*5+3

후위 표기법 : 컴퓨터가 읽기 쉽도록 표기하는 방법
후위 표기법에서 연산자는 뒤쪽에 위치합니다.
7 5 * 3 +

스택을 활용하여 수식을 꼐산하는 방법
1 : 수식을 후위 표기법으로 변환
2 : 후위 표기법을 계싼하여 결과를 도출

 중위 표기법을 후위표기법으로 바꾸는 방법

 1 : 피연산자가 들어오면 바로 출력합니다.
 2 : 연산자가 들어오면 자기보다 우선순위가 높거나 같은것들을 빼고 자신을 스택에 답습니다.
 3 : 여는 괄호 '('를 만나면 무조건 스택에 담습니다.
 4 : 닫는 괄호 ')'를 만나면  '('를 만날 때까지 스택에서 출력합니다.
*/

#define _CRT_SECURE_NO_WARNIGNS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define SIZE 10000
#define INF 99999999

typedef struct Node {
	char data[100];
	struct Node* next;
} Node;

typedef struct Stack {
	Node* top;
} Stack;

void push(Stack* stack, char* data) {
	Node* node = (Node*)malloc(sizeof(Node));
	strcpy ( node->data, data);
	node->next = stack->top;
	stack->top = node;
}

char* getTop(Stack* stack) {
	Node* top = stack->top;
	return top->data;
}

char* pop(Stack* stack) {
	if (stack->top == NULL) {
		printf("스택 언더플로우가 발생했습니다.\n");
		return NULL;
	}
	Node* node = stack->top;
	char* data = (char*)malloc(sizeof(char) * 100);
	strcpy(data, node->data);
	stack->top = node->next;
	free(node);
	return data;
}

int getPriority(char* i) {
	if (!strcmp(i, "(")) { return 0; };
	if (!strcmp(i, "+") || !strcmp(i, "-")) { return 1; };
	if (!strcmp(i, "*") || !strcmp(i, "/")) { return 2; };
	return 3;
}

char* transition(Stack* stack, char** s, int size) {
	char res[1000] = "";
	for (int i = 0; i < size; i++) {
		if (!strcmp(s[i], "+") || !strcmp(s[i], "-") || !strcmp(s[i], "*") || !strcmp(s[i], "/")) {
			while (stack->top != NULL && getPriority(getTop(stack)) >= getPriority(s[i])) {
			}
			push(stack, s[i]);
		}
		else if (!strcmp(s[i], "(")) push(stack, s[i]);
		else if (!strcmp(s[i], ")")) {
			while (strcmp(getTop(stack), "(")) {
				strcat(res, pop(stack)); strcat(res, " ");
			}
			pop(stack);
		}
		else {
			strcat(res, s[i]); strcat(res, " ");
		}
	}
	while (stack->top != NULL) {
		strcat(res, pop(stack)); strcat(res, " ");
	}
	return res;
}
void cal(Stack* stack, char** s, int size) {
	int x, y, z;
	for (int i = 0; i < size; i++) {
		if (!strcmp(s[i], "+") || !strcmp(s[i], "-") || !strcmp(s[i], "*") || !strcmp(s[i], "/")) {
			x = atoi(pop(stack));
			y = atoi(pop(stack));
			z = atoi(pop(stack));
			if (!strcmp(s[i], "+"))z = y + x;
			if (!strcmp(s[i], "-"))z = y - x;
			if (!strcmp(s[i], "*"))z = y * x;
			if (!strcmp(s[i], "/"))z = y / x;
			char buffer[100];
			sprintf(buffer, "%d", z);
			push(stack, buffer);
		}
		else{
			push(stack, s[i]);
		}
	}
	printf("%s\n", pop(stack));
}

int main(void) {
	Stack stack;
	stack.top = NULL;
	char a[100] = "((3+4)*5)-5*7*5-5*10";
	int size = 1;
	for (int i = 0; i < strlen(a); i++) {
		if (a[1] == ' ') {
			size++;
		};
	}
	char* ptr = strtok(a, " ");
	char** input = (char*)malloc(sizeof(char*) * size);
	for (int i = 0; i < size; i++) {
		strcpy(input[i], ptr);
		ptr = strtok(NULL, " ");
	}
	char b[1000] = "";
	strcpy(b, transition(&stack, input, size));
	printf("후위표기법: %s\n", b);
	size = 1;
	for (int i = 0; i < strlen(b) - 1; i++) {
		if (b[i] == ' ') size++;
	}
	char* ptr2 = strtok(b, " ");
	for (int i = -0; i < size; i++) {
		strcpy(input[i], ptr2);
		ptr2 = strtok(NULL, " ");
	}
	cal(&stack, input, size);
	system("pause");
	return 0;
}

