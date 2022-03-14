import sys

n, m = map(int, sys.stdin.readline().split())
a = set(map(int, sys.stdin.readline().split()))
b = set(map(int, sys.stdin.readline().split()))

ans = sorted(list(set(a) - set(b)))

if ans == []:
    print(0)
else:
    print(len(ans))
    print(' '.join(map(str, ans)))
