# 기본이 되는 메소드 입력
def find(x):
    if par[x] != x:
        par[x] = find(par[x])
    return par[x]


def uni(a, b):
    x = find(a)
    y = find(b)

    if x < y:
        par[y] = x
    else:
        par[x] = y


# 기본 정보 입력 받기
n = int(input())
par = [i for i in range(n)]

cost = []

# 이차원 리스트로 각각의 포털 코스트 입력
for i in range(n):
    cost.append(list(map(int, input().split())))

# 그래프 입력
graph = []
for i in range( n):
    for j in range( n):
        graph.append((cost[i][j], i, j))

graph.sort()

ans = 0
for g in graph:
    cost, a, b = g
    if find(a) != find(b):
        uni(a, b)
        ans += cost

print(ans)
