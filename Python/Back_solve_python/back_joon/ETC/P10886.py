n = int(input())
c = 0

for _ in range(n):
    if int(input()) ==1:
        c+=1

if c>n//2:
    print("Junhee is cute!")
else :
    print("Junhee is not cute!")