s = input()
num = [0] * 26
for i in range(len(s)):
    num[ord(s[i])-97] += 1

for i in num:
    print(i, end = " ")
    if i == len(num)-1:
        print(i)
