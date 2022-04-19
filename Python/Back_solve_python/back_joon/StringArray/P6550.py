
def check(s, t):
    v = 0
    for i in range(len(t)):
        if t[i] == s[v]:
            v += 1
            if v == len(s):
                return "Yes"
    return "No"


while True:
    try:
        s, t = input().split()
        ans = check(s, t)
        print(ans)
    except:
        break
