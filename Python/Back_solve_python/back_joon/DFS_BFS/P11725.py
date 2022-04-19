import sys
from collections import deque

input = sys.stdin.readline

# 노드의 갯수
n = int(input())

q = deque()

# 트리 생성
Tree = [[] for _ in range(n + 1)]

# 부모 노드 생성
P = [0 for _ in range(n + 1)]

# 트리 구조입력
for _ in range(n - 1):
    a, b = map(int, input().split())
    # 양방향으로 이어준다
    Tree[a].append(b)
    Tree[b].append(a)

# deque에 시작점을 넣어준다
q.append(1)

# BFS 전개
while q:
    start = q.popleft()
    for i in Tree[start]:
        if P[i] == 0:
            P[i] = start
            q.append(i)

for i in range(2, n+1):
    print(P[i])