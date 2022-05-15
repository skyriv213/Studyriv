def find_parent(parent, x):
    if parent[x] != x:
        parent[x] = find_parent(parent, parent[x])
    return parent[x]


def union_parent(parent, a, b):
    a = find_parent(parent, a)
    b = find_parent(parent, b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b


n = int(input())  # 컴퓨터(노드)의 수
m = int(input())  # 네트워크(간선)의 수

# 그래프 생성 및 입력
computer = [0] * (n + 1)

network = []
ans = 0

for i in range(1,n+1):
    computer[i] = i

for _ in range(m):
    a, b, c = map(int, input().split())
    network.append((c, a, b))

network.sort()

for networks in network:
    cost, a, b = networks

    if find_parent(computer, a) != find_parent(computer, b):
        union_parent(computer, a, b)
        ans += cost

print(ans)
