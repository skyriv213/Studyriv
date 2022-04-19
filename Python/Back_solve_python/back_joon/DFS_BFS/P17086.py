from collections import deque

# 변수입력
n, m = map(int, input().split())

queue = deque()

# 리스트 생성
num = []
for _ in range(n):
    num.append(list(map(int, input().split())))

# 주어진 방향
dx = [1, -1, 0, 0, 1, -1, 1, -1]
dy = [0, 0, 1, -1, 1, 1, -1, -1]

res= 0

for i in range(n):
    for j in range(m):
        if num[i][j] == 1:
            queue.append((i, j))


def bfs():
    global res
    while queue:
        x, y = queue.popleft()
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if num[nx][ny] == 0:
                    num[nx][ny] = num[x][y] + 1
                    if res < num[nx][ny]:
                        res = num[nx][ny]
                    queue.append((nx, ny))

bfs()

print(res-1)