g = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]


# 선택정렬
# for문이 2개이므로 시간복잡도 o(n**2)
for i in range(len(g)):
    mi = i
    for j in range(i + 1, len(g)):
        if g[mi] > g[j]:
            mi = j
    g[i], g[mi] = g[mi],g[i]

print(g)