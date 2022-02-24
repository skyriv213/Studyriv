'''
상하좌우
1,1에서 계획에 따라 움직이기
'''

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]
dp = ["R", "L", "U", "D"]

# 공간의 크기
n = int(input())
# 계획 입력
plan = list(map(str, input().split()))

x, y = 1, 1
for i in plan:
    for j in range(len(dp)):
        if i == dp[j]:
            nx = x + dx[j]
            ny = y + dy[j]

        if nx < 1 or nx > n or ny < 1 or ny > n:
            continue

    x, y = nx, ny

print(x, y)
