# 1926번

from collections import deque

# 세로크기 n, 가로크기 m
n, m = map(int, input().split())

# 리스트 생성
num = []
for i in range(n):
    num.append(list(map(int, input().split())))

visit = [[False] * m for _ in range(n)]

# 이동을 위한 방향
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

cnt = 0  # 그림의 갯수
pic = None
res = 0  # 그림의 크기 비교 후 최댓값

# 체크를 위한 메서드(BFS)

def check2(x, y):
    global pic
    pic = 0

    queue = deque()
    queue.append((x, y))
    while queue:
        x, y = queue.popleft()
        pic += 1
        visit[x][y] = True
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if num[nx][ny] == 1 and not visit[nx][ny]:
                    num[nx][ny] = num[x][y] + 1
                    queue.append((nx, ny))
                elif num[nx][ny] == 0:
                    continue


# 문제 풀이를 위한 순회
for i in range(n):
    for j in range(m):
        if num[i][j] == 1 and visit[i][j] != True:
            pic = 0
            check2(i, j)
            cnt += 1
            res = max(res, pic)

print(cnt, res, sep = '\n')
