#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<limits.h>

int main(void) {
	int arr[10] = { 6,5,4,3,9,8,0,1,2,7 };
	int i , maxvalue = INT_MIN;
	for (int i = 0; i < 10; i++) {
		if (maxvalue < arr[i])
		{
			maxvalue = arr[i];
		}
		printf("%d\n", arr[i]);
	}
	printf("%d\n", maxvalue);

	char a[20] = "hello world";
	int cnt = 0;
	for (int i = 0; i < 20; i++) {
		if (a[i] == 'l') {
			cnt++;
		}
	}
	printf("%d\n", cnt);
	system("pause");
	return 0;
}