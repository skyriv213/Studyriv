# 퀵 정렬  - 파이썬의 장점을 살린, 암기하기 쉬운 부분

g = [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]


def quick2(g):
    # 리스트가 하나 이하의 원소만을 담고 있다면 종료
    if len(g) <= 1:
        return g

    pivot = g[0]  # pivot은 첫 번째 원소
    tail = g[1:]  # pivot을 제외한 리스트

    left_side = [x for x in tail if x <= pivot] # 분할된 왼쪽 부분
    right_side = [x for x in tail if x >= pivot] # 분할된 오른쪽 부분

    # 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬을 수행하고, 전체 리스트를 반환
    return quick2(left_side) +  [pivot] + quick2(right_side)

print(g)