'''
금액을 입력받고 최소의 수로 돈을 거슬러주는 방법
'''

n = int(input())

coin = [500, 100, 50, 10]

cnt = 0

for i in coin:
    cnt += n // i
    n %= i

print(cnt)
