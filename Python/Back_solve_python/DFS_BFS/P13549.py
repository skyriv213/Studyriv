from collections import deque

n, k = map(int, input().split())

check = [False] * 100001
q = deque()
q.append((n, 0))

while q:
    start, time = q.popleft()

    if not check[start]:
        check[start] = True

    if start == k:
        print(time)
        break

    Nstart = start * 2
    if Nstart < len(check) and not check[Nstart]:
        q.append((Nstart, time))

    for i in (start - 1, start + 1):
        if 0 <= i < len(check) and not check[i]:
            q.append((i, time + 1))

