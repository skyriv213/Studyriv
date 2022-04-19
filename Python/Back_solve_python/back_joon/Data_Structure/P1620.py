import sys
#input = sys.stdin.readline

# 도감 / 체크의 값 입력
n, m = map(int, input().split())
#
mon = [0]
dic = {}
for i in range(n):
    name = input().rstrip()
    mon.append(name)
    dic[name] = i+1

for _ in range(m):
    # check해야하는 항목 입력받기, 우측 공백 제거
    check = input().rstrip()
    # 만약 항목의 값이 정수로 변환이 가능하면 True값 반환하여 if문 실행
    if check.isdigit():
        print(mon[int(check)])
    else :
        # 항목의 값이 문자형이면 해당 dic에서 문자의 값이 반환하는 값 출력
        print(dic[check])


