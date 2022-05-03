import sys

input = sys.stdin.readline


def GCD(a, b):
    if b == 0:
        return a
    else:
        return GCD(b, a % b)


m, n = map(int, input().split(":"))

k = GCD(m, n)

print('%d:%d' % (m // k, n // k))
