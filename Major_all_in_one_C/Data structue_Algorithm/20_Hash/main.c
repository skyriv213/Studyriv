//해시
//- 해시(hash)의 원리와 구현방법
//- 해시가 활용되면 좋은 상황
//
//- 데이터를 최대한 빠른 속도로 관리하도록 도와주는 자료구조
//- 메모리 공간이 많이 소모가 되지만 매우 빠른 속도로 데이터를 처리
//- 빠르게 데이터에 접근한다는 점에서 데이터베이스등의 소프트웨어에서 활용
//- 특정한 값(value)를 찾고자 할 떄 그 값의 키(key)로 접근 가능 
//- 보통 해시함수는 모듈로(Modulo)연산 등의 수학적 연산으로 이루어져 O(1)만에 값에 접근가능
//- 해시함수의 입력값으로 어떠한 값이든 들어갈 수 있지만 , 해시함수를 거쳐 입력이 되는 key의 경우의 수는 한정적이다
//	따라서 이때 키의 중복이 발생되는 경우를 충돌(collision)이라고 함
//
//- 해싱 알고리즘의 경우 나눗셈 법이 가장 많이 활용이 된다.
//- 입력값을 테이블의 크기로 나눈 나머지를 key로 이용하는 방식
//	- 이 때 테이블의 크기는 소수(Prime number)로 설정하는것이 효율성이 좋다
//
//- 충돌을 처리하는 법
//	- 충돌이 발생되는 구간을 해시 테이블 다른 위치에 저장 : 선형 조사법, 이차 조사법 등
//	- 해시 테이블의 하나의 버킷에 여러 개의 항목을 저장 : 체이닝(chaining) 등


// 선형 조사법 구조체 정의

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#define TABLE_SIZE 10007
#define INPUT_SIZE 5000

typedef struct {
	int id;
	char name[20];
} Student;

// 해시 테이블을 초기화합니다.
void init(Student** hashTable) {
	for (int i = 0; i < TABLE_SIZE; i++) {
		hashTable[i] = NULL;
	}
}
// 해시 테이블의 메모리를 반환합니다.
void destructor(Student** hashTable) {
	for (int i = 0; i < TABLE_SIZE; i++) {
		if (hashTable[i] != NULL) {
			free(hashTable[i]);
		}
	}
}


// 해시 테이블 내 빈 공간을 선형 탐색으로 찾습니다.
int findEmpty(Student** hashTable, int id) {
	int i = id % TABLE_SIZE;
	while (1) {
		if (hashTable[i % TABLE_SIZE] == NULL) {
			return i % TABLE_SIZE;
		}
		i++;
	}
}
// 특정한 ID 값에 매칭되는 데이터를 해시 테이블 내에서 찾습니다.
int search(Student** hashTable, int id) {
	int i = id % TABLE_SIZE;
	while (1) {
		if (hashTable[i % TABLE_SIZE] == NULL) return -1;
		else if (hashTable[i % TABLE_SIZE]->id == id) return i;
		i++;
	}
}

// 특정한 키 인덱스에 데이터를 삽입합니다.
void add(Student** hashTable, Student* input, int key) {
	hashTable[key] = input;
}
// 해시 테이블에서 특정한 키의 데이터를 반환합니다.
Student* getValue(Student** hashTable, int key) {
	return hashTable[key];
}

// 해시 테이블에 존재하는 모든 데이터를 출력합니다.
void show(Student** hashTable) {
	for (int i = 0; i < TABLE_SIZE; i++) {
		if (hashTable[i] != NULL) {
			printf("키: [%d] 이름: [%s]\n", i, hashTable[i]->name);
		}
	}
}


int main(void) {
	Student** hashTable;
	hashTable = (Student**)malloc(sizeof(Student) * TABLE_SIZE);
	init(hashTable);
	for (int i = 0; i < INPUT_SIZE; i++) {
		Student* student = (Student*)malloc(sizeof(Student));
		student->id = rand() % 1000000;
		sprintf(student->name, "사람%d", student->id);
		if (search(hashTable, student->id) == -1) { // 중복되는 ID는 존재하지 않도록 함.
			int index = findEmpty(hashTable, student->id);
			add(hashTable, student, index);
		}
	}
	show(hashTable);
	destructor(hashTable);
	system("pause");
	return 0;
}


/*
선형 조사법의 단점
선형 조사법은 충돌이 발생하기 시작하면, 유사한 값을 가지는 데이
터끼리 서로 밀집되는 집중 결합 문제가 존재합니다.
물론 선형 조사법이라고 해도 ‘해시 테이블의 크기’가 비약적으로 크
다면, 다시 말해 메모리를 많이 소모한다면 충돌이 적게 발생하므로
매우 빠른 데이터 접근 속도를 가질 수 있습니다.
하지만 일반적인 경우, 해시 테이블의 크기는 한정적이므로 충돌이
최대한 적게 발생하도록 해야 합니다
*/

