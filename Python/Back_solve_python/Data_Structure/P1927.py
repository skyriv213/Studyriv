import heapq
import sys

heap = []

n = int(input())

for _ in range(n):
    x = int(sys.stdin.readline())
    if x == 0:
        try:
            print(heapq.heappop(heap))
        except:
            print(0)

    else:
        heapq.heappush(heap, x)

