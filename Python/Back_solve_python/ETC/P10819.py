import itertools

a = int(input())

l = list(map(int, input().split()))

ll = list(itertools.permutations(l,a))

max = 0 ;

for i in range(len(ll)):
    sum =0
    for j in range(0,a-1):
        sum += abs(ll[i][j] - ll[i][j+1])
    if sum > max :
        max = sum

print(max)
