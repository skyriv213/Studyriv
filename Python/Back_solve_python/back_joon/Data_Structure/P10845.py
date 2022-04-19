import sys
from collections import deque

num = int(sys.stdin.readline())
q = []

for _ in range(num):
    s = sys.stdin.readline().split()

    if s[0] == 'push': q.append(s[1])

    elif s[0] == 'pop':
        if len(q) == 0: print(-1)
        else: print(q.pop(0))

    elif s[0] == 'size': print(len(q))

    elif s[0] == 'empty':
        if len(q) == 0 : print(1)
        else : print(0)

    elif s[0] == 'front':
        if len(q) == 0 : print(-1)
        else : print(q[0])

    elif s[0] == 'back':
        if len(q) == 0: print(-1)
        else:print(q[len(q)-1])
