import sys

input = sys.stdin.readline

n, m = map(int, input().split())

S = []

cnt = 0

for _ in range(n):
    word = input()
    S.append(word)

for _ in range(m):
    word = input()
    if word in S:
        cnt +=1

print(cnt)