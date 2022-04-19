import sys

input = sys.stdin.readline

a, b, c = map(int, input().split())

if a == b == c:
    print(10000 + 1000 * a)
elif a == b :
    print(1000 + a * 100)
elif a == c :
    print(1000 + a * 100)
elif c == b :
    print(1000 + b * 100)
elif a != b != c:
    print(max(a, max(b, c)) * 100)
