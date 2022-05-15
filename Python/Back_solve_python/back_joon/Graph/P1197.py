def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]


def uni(a, b):
    a = find(a)
    b = find(b)
    if a < b:
        parent[a] = b
    else:
        parent[b] = a


v, e = map(int, input().split())

parent = [0] * (v + 1)

for i in range(1, v + 1):
    parent[i] = i

graph = []
for i in range(e):
    a, b, c = map(int, input().split())
    graph.append((c, a, b))

ans = 0

for g in graph:
    cost, a, b = g
    if find(a) != find(b):
        uni(a, b)
        ans += cost

print(ans)
