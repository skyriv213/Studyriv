from collections import deque

n = int(input())
for _ in range(n):

    time = int(input())

    S = list(map(str, input().split(" ")))
    word = ""

    queue = deque()
    queue.appendleft(S[0])

    for i in range(1, len(S)):
        if ord(S[i]) > ord(queue[0]):
            queue.append(S[i])
        else:
            queue.appendleft(S[i])

    for i in queue:
        word += i

    print(word)
