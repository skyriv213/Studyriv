# 방향
from collections import deque

dx = [0, 0, 1, -1, 1, 1, -1, -1]
dy = [1, -1, 0, 0, 1, -1, 1, -1]

# 단어의 갯수
cnt = 0

def BFS(y, x):
    q = deque()
    q.append((y, x))
    graph[y][x] = 0
    while q:
        y, x = q.popleft()
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m and graph[ny][nx] == 1:
                q.append((ny, nx))
                graph[ny][nx] =0


m, n = map(int, input().split())

graph = [list(map(int, input().split())) for _ in range(m)]

for i in range(m):
    for j in range(n):
        if graph[i][j] == 1:
            BFS(i, j)
            cnt += 1

print(cnt)
