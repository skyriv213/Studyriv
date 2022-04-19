'''
파이썬에서는 최소 힙은 지원하지만 최대 힙은 지원하지 않는다.
따라서 기존 최소힙의 입력 코드에 -1을 곱하여
'''

import heapq
import sys

n = int(input())

heap = []
for _ in range(n):
    x = int(sys.stdin.readline()) * -1
    if x == 0:
        try:
            print(heapq.heappop(heap) * -1)
        except:
            print(0)

    else:
        heapq.heappush(heap, x)
