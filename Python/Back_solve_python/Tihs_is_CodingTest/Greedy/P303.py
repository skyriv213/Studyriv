'''
숫자카드 게임
'''
n,m = map(int, input().split())
res=0
for i in range(n):
    data = list(map(int, input().split()))
    minV = min(data)
    res = max(res,minV)

print(res)