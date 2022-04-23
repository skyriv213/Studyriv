n = int(input())  # 집의 갯수

# 가능한 색상과 집 리스트
home = []
for i in range(n):
    home.append(list(map(int, input().split())))

for i in range(1, len(home)):
    home[i][0] = min(home[i - 1][1], home[i - 1][2]) + home[i][0]
    home[i][1] = min(home[i - 1][0], home[i - 1][2]) + home[i][1]
    home[i][2] = min(home[i - 1][1], home[i - 1][0]) + home[i][2]

print(min(home[n - 1][0], home[n - 1][1], home[n - 1][2]))
