n =  int(input())
for _ in range(n):
    s = input()
    if len(s) ==1:
        print(s+s)
    else :
        print(s[0]+s[len(s)-1])