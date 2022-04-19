a,b = map(int, input().split())


# 빈 리스트 선언
list = []

for i in range(1,b+1):
    for j in range(1,i+1):
        list.append(i)



su = [0]
for i in range(a-1,b):
    su.append(list[i])


print(sum(su))