'''
아스키 코드로 접근.
해당 문자열의 입력 시 해당 문자열을 반복문으로 체크하며 각 원소를 아스키 코드로 변환
변환 후 각 코드의 범위에 맞춰 배열에 값을 추가해준다
'''
while True:

    try:
        s = list(input())
        l, u, n, b = 0, 0, 0, 0

        for i in range(len(s)):
            if 97 <= ord(s[i]) <= 122:
                l += 1
            elif 65 <= ord(s[i]) <= 90:
                u += 1
            elif 48 <= ord(s[i]) <= 57:
                n += 1
            elif ord(s[i]) == 32:
                b += 1
        print(l, u, n, b)
    except EOFError :
        break
