'''
정점(node)와 간선(edge)로 각 정점들의 관계를 나타낸 것을 그래프
파이썬에서는 그래프를 딕셔너리를 이용해서 표현
그래프의 key는 node를, value는 key와 연결이 된 정점을 나타낸다
ex :
graph = {1 : [2,3,4], 2 : [5], 3 : [5], 4 : [], 5 : [6, 7], 6 : [], 7 : [3]}
'''

# 알고리즘 문제의 경우 두 정점의 연결관계를 입력을 여러줄로 입력 받음
# 입력받은 값을 리스트로 만들 때는 아래와 같은 방법을 사용


# 먼저 노드의 갯수 n, 간선의 갯수 m을 입력
n,m = map(int, input().split())
#만약 n개만큼의 정점이 존재하고, m개만큼의 입력을 받는다면
graph = [[] for _ in range(n+1)]
# n+1개만큼의 공간을 만들어서 graph[n]이 n번 정점을 나타내도록 해 준다
# 반복문이 n번만큼 반복이 되면서 리스트 안에 n개의 리스트를 생성한다.
for _ in range(m):
	x,y = map(int,input().split()) #만약 1 2를 입력받으면
    graph[x].append(y) # 1번 정점에 2를 넣어주고 -> graph[1] = [2]
    graph[y].append(x) # 2번 정점에 1을 넣어준다 -> graph[2] = [1]

