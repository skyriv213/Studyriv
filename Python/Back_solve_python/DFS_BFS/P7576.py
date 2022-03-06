# 7576 / 토마토
from collections import deque

m, n = map(int, input().split())

# 이동을 위한 방향
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

# 리스트 생성
num = []
for i in range(n):
    num.append(list(map(int, input().split())))

queue = deque()

# BFS
def BFS():
    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and num[nx][ny] == 0:
                num[nx][ny] = num[x][y] + 1
                queue.append((nx, ny))


for i in range(n):
    for j in range(m):
        if num[i][j] == 1:
            queue.append((i, j))

BFS()

max = 0
for i in range(n):
    for j in range(m):
        if max < num[i][j]:
            max = num[i][j]
        elif num[i][j] == 0:
            max = -1
            break
    if max == -1:
        break

if max == -1:
    print(max)
else:
    print(max - 1)
