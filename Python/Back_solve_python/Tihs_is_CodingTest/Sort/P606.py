# 계수정렬 - 리스트의 모든 원소 값이 0보다 큼

g = [7, 5, 9, 0, 3, 1,, 6, 2, 9, 1, 4, 8, 0, 5, 2]

# 모든 범위를 포함하는 리스트 선언 (모든 값은 0으로 초기화)
count = [0] * (max(g) + 1)

for i in range(len(g)):
    count[g[i]] += 1

for i in range(len(count)):
    for j in range(count[i]):
        print(i, end = " ")
