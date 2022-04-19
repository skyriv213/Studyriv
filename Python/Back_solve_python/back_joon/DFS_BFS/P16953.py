from collections import deque

a, b = map(int, input().split())

q = deque()

q.append((a, 1))

ans = 0

while q:
    start, count = q.popleft()
    if start > b:
        continue
    if start == b:
        ans = count
        break
    q.append((int(str(start) + "1"), count + 1))
    q.append((start * 2, count + 1))
else:
    ans = -1

print(ans)
