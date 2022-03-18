# 퀵정렬

g = [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]

def quick(g, s, e):
    if s >= e:
        return
    pivot = s
    left = pivot + 1
    right = e
    while left <= right:
        # pivot 보다 큰 데이터를 찾을 때까지 반복
        while left <= e and g[left] <= g[pivot]:
            left += 1
        # pivot 보다 작은 데이터를 찾을 때까지 반복
        while right > s and g[right] >= g[pivot]:
            right -= 1

        # 엇갈린다면 작은 데이터와 pivot 교체
        if left > right:
            g[right], g[pivot] = g[pivot], g[right]
        # 엇갈리지 않으면 작은데이터와 큰데이터를 교체
        else:
            g[right], g[left] = g[left], g[right]

    # 분할 이후 각 pivot의 좌우에서 위의 과정을 반복
    quick(g, s, right - 1)
    quick(g, right + 1, e)

quick(g,0,len(g)-1)
print(g)
