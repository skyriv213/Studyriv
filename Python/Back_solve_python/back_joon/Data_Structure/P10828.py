import sys

n = int(sys.stdin.readline().rstrip())
stack = []

for _ in range(n):
    c = sys.stdin.readline().split()

    if c[0] == 'push': stack.append(c[1])
    elif c[0] == 'pop':
        if stack : print(stack.pop())
        else : print(-1)
    elif c[0] == 'size': print(len(stack))
    elif c[0] == 'empty':
        if stack: print(0)
        else: print(1)
    elif c[0] == 'top':
        if stack :
            print(stack[len(stack)-1])
        elif len(stack) == 0 :
            print(-1)