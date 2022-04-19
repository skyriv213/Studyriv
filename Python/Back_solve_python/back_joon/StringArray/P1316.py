# 단어의 갯수
n = int(input())
# 단어체크를 위한 카운트
cnt = 0
# 반복문의 시작
for _ in range(n):
    # 단어의 입력
    s = input()
    for i in range(0, len(s)-1):
        if s[i] == s[i+1]:
            continue
        elif s[i] in s[i+1:]:
            cnt+=1
            break

print(n-cnt)
