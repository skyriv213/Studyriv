import sys
import heapq

input = sys.stdin.readline

n = int(input())

heap = []

for _ in range(n):
    arr = list(map(int, input().split()))

    if not heap:
        for i in arr:
            heapq.heappush(heap, i)

    else:
        for i in arr:
            if heap[0] < i:
                heapq.heappush(heap, i)
                heapq.heappop(heap)

print(heap[0])
