n = int(input())
for _ in range(n):
    s = input()
    sum = 0
    for i in range(len(s)):
        if s[i] == '(':
            sum += 1

        elif s[i] == ')':
            sum -= 1

        if sum < 0:
           print('NO')
           break

    if sum > 0:
        print('NO')
    elif sum == 0 :
        print('YES')