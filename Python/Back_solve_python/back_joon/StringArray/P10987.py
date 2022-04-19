s = input()
cnt = 0
for i in range(len(s)):
    if s[i] in ["a", "e", "i", "o", "u"]: cnt += 1
print(cnt)
