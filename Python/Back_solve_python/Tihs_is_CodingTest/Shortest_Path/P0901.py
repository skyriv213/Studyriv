'''
다익스트라 알고리즘
    = 데이크스트라 알고리즘
1. 출발 노드를 설정한다
2. 최단거리 테이블을 초기화한다.
3. 방문하지 않은 노드 중에서 최단 거리가 가장 짧은 노드를 선택한다.
4. 해당 노드를 거쳐 다른 노드로 가는 비용을 계산하며 최단 거리 테이블을 갱신한다.
5. 위의 과정 중 3, 4번을 반복한다.

다익스트라 알고리즘은 기본적으로 그리디 알고리즘으로 분류가 된다.
각 노드에서 최단 거리가 되는 노드를 탐색하기에 그 순간 가장 최선의 경우가 되는 답을 고르게된다.
이러한 점에서 다익스트라 알고리즘은 그리디 알고리즘으로 분류가 된다.

최단 경로를 구하는 과정에서 각 노드에 대한 최단 경로를 1차원 리스트에 저장하면서 지속적으로 갱신한다
'''

import sys

input = sys.stdin.readline
INF = int(1e9)  # 무한을 의미하는 정수형 표현 - 10억

# 그래프의 노드 , 간선, 시작점 입력받기
n, m = map(int, input().split())
start = int(input())

# 그래프 생성을 위한 2차원리스트 선언
graph = [[] for i in range(n + 1)]

# 방문확인을 위한 boolean 타입 리스트 생성
check = [False] * (n + 1)

# 거리 저장을 위한 1차원 리스트
distance = [INF] * (n + 1)

# 간선에 대한 정보를 입력받기
for i in range(m):
    # a에서 b로 가는 비용이 c라는 코드
    # 만약에 가중치가 동일한 그래프의 경우  c의값을 1로 설정하여 문제를 풀이하면 된다.
    a, b, c = map(int, input().split())
    graph[a].append((b, c))
    # graph[a][b] = c

print(graph)

def getSmallestNode():
    min_value: INF
    index = 0
    for i in range(1, n + 1):
        if distance[i] < min_value and not check[i]:
            min_value = distance[i]
            index = i
    return index


def dijkstra(start):
    # 시작 노드에 대해 초기화
    distance[start] = 0
    check[start] = True
    for j in graph[start]:
        distance[j[0]] == j[1]
    # 시작 노드를 제외한 전체 n-1 개의 노드에 대해 반복
    for i in range(n - 1):
        # 현재 가장 짧은 거리가 되는 노드에 대해 방문처리
        now = getSmallestNode()
        check[i] = True
        # 현재 노드와 연결이 되는 다른 노드를 확인
        for j in graph[now]:
            cost = distance[now] + j[1]
            # 현재 노드를 거쳐서 다른 노드로 이동한 거리가 더 짧을 경우
            if cost < distance[j[0]]:
                distance[j[0]] = cost

dijkstra(start)

for i in range(1,n+1):
    if distance[i] == INF:
        print("infinity", end = " ")
    else :
        print(distance[i], end = " ")
