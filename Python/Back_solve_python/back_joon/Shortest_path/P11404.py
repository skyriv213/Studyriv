INF = int(1e9)  # 무한을 의미하는 10억의 값 지정

# 주어진 도시(노드)와 버스 노선(간선)의 값
n = int(input())
m = int(input())

# 그래프를 만들기 위해 그래프를 생성, 도시의 번호를 맞추기위해 n+1번 반복
# 각각 도시, 방문 여부, 거리를 표현, 도시 끼리의 거리는 최대로 지정하고 시작
city = [[INF] * (n + 1) for _ in range(n + 1)]

# 자기 자신으로 돌아오는 경우의 거리를 0으로 초기화
for i in range(1, n + 1):
    for k in range(1, n + 1):
        if i == k:
            city[i][k] = 0

# 그래프 그리기
for _ in range(m):
    # a에서 b로 가는 비용이 c
    a, b, c = map(int, input().split())

    if city[a][b] != INF:
        city[a][b] = min(city[a][b], c)
    else:
        city[a][b] = c

# 플로이드 와샬로 그래프 체크
for j in range(1, n + 1):
    for i in range(1, n + 1):
        for k in range(1, n + 1):
            city[i][k] = min(city[i][k], city[i][j] + city[j][k])

for i in range(1, n + 1):
    for j in range(1, n + 1):
        if city[i][j] == INF:
            print("0", end = " ")
        else:
            print(city[i][j], end = " ")
    print()
