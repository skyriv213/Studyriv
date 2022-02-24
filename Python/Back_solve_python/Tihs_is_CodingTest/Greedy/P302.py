'''
다양한 수로 이루어진 배열에서 주어진 수들을 m번 더해서 가장 큰 수를 만드는 문제
단 이때 특정한 인덱스에 해당하는 수가 연속해서 k번 더해질 수 없다.

n = 주어진 수들의 갯수
m = 더할 수 있는 횟수
k = 연속해서 더할 수 있는 수
'''

n, m, k = map(int, input().split())

# 리스트 생성
num = list(map(int, input().split()))
# 리스트 정렬
num.sort()
# 답출력, 숫자 카운팅 변수 선언
res = 0
cnt = 0
for i in range(0, m):
    if cnt == k:
        cnt = 0
        res += num[len(num) - 2]

    else:
        cnt += 1
        res += num[len(num) - 1]

print(res)