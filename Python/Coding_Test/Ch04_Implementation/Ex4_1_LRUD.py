'''
 A는 n*n 크기의 정사각형 공간위에 서 있다. 이 공간은 1 * 1 크기의 정사각형으로 나눠져있다.
 가장 위의 좌표는 (1,1)이며, 가장 오른쪽은 (n,n)이다.
 상하좌우로 1씩 움직일 수 있으며, 움직이고 난 뒤의 좌표를 출력하라.
'''


def Move(a, b, c , d):
    dx = [0, 0, -1, 1]
    dy = [1, -1, 0, 0]

    motion = ['U', 'D', 'L', 'R']

    if a == 'U':
        b = b + dx[0]
        c = c + dy[0]

    elif a == 'D':
        b = b + dx[1]
        c = c + dy[1]

    elif a == 'L':
        b = b + dx[2]
        c = c + dy[2]

    elif a == 'R':
        b = b + dx[3]
        c = c + dy[3]




# n을 입력받음
n = input()

# 출발좌표
x, y = 1, 1

# s / 움직이게 될 방향을 입력받음
s = [input().split()]

for m in range(s):
    Move(m,x,y,n)

print(x,y)




