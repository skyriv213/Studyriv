import sys
from collections import deque

# 탐색의 방향
dx = [1, -1, 0, 0, 1, 1, -1, -1]
dy = [0, 0, 1, -1, 1, -1, 1, -1]

# 알고리즘 Bfs
def Bfs(num, x, y):
    # deque 선언
    q = deque()
    q.append((x, y))
    while q:
        x, y = q.popleft()
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < h and 0 <= ny < w:
                if num[nx][ny] == 1:
                    # 다음 탐색과 겹치지 않기 위해 해당 조건 칸의 숫자를 변경
                    num[nx][ny] = 0
                    q.append((nx, ny))
            else:
                continue


while True:
    w, h = map(int, sys.stdin.readline().split())
    count = 0
    num = []
    if w == 0 and h == 0:
        break
    for _ in range(h):
        num.append(list(map(int, sys.stdin.readline().split())))
    for i in range(h):
        for j in range(w):
            if num[i][j] == 1:
                count += 1
                Bfs(num, i, j)
    print(count)
