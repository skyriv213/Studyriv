import sys

input = sys.stdin.readline
s = input()
check = ["U","C","P","C"]
ans = True

for i in range(len(check)):
    if check[i] in s:
        ans = True
        position = s.find(check[i])
        s = s[position + 1 : ]
    else :
        ans = False
        break

if ans:
    print("I love UCPC")
else:
    print("I hate UCPC")
