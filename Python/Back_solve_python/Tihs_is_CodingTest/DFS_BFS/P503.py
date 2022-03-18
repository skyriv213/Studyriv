from collections import deque

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]
g = []


def BFS(x, y):
    q = deque()
    q.append((x, y))
    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m and g[nx][ny] == 0:
                g[nx][ny] = -1
                q.append((nx, ny))


# 세로 길이 n, 가로길이 m
n, m = map(int, input().split())

# 그래프를 생성시 split() 사용금지
for i in range(n):
    g.append(list(map(int, input())))

res = 0

for i in range(n):
    for j in range(m):
        if g[i][j] == 0:
            res += 1
            BFS(i, j)

print(res)
