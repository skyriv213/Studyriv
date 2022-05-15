import math
import sys


def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]


def uni(a, b):
    a = find(a)
    b = find(b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b


n = int(input())
parent = [i for i in range(n+1)]

star = []
graph = []
ans = 0

for _ in range(n):
    a, b = map(float, input().split())
    star.append((a, b))

for i in range(n - 1):
    for j in range(i + 1, n):
        graph.append((math.sqrt((star[i][0] - star[j][0]) ** 2
                                + (star[i][1] - star[j][1]) ** 2), i, j))

graph.sort()

for g in graph:
    c, a, b = g

    if find(a) != find(b):
        uni(a, b)
        ans += c

print(round(ans, 2))
