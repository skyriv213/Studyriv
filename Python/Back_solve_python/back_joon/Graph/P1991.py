'''
strip() - 문자열에서 문자열의 시작과 끝의 문자를 제거하는데 도움을 줌
제거할 문자를 지정하지않으면 문자열의 시작과 끝에서 공백 제거
시작, 끝에 공백이 없으면 문자열을 있는 그대로 반환
'''


def PreOrder(root):
    if root != '.':
        print(root, end = ' ')
        PreOrder(tree[root][0])
        PreOrder(tree[root][1])


def InOrder(root):
    if root != '.':
        InOrder(tree[root][0])
        print(root, end = '')
        InOrder(tree[root][1])


def PostOrder(root):
    if root != '.':
        PostOrder(tree[root][0])
        PostOrder(tree[root][1])
        print(root, end = '')


n = int(input())

tree = {}
for s in range(n):
    root, left, right = input().strip().split()
    tree[root] = [left, right]

PreOrder('A')
print()
InOrder('A')
print()
PostOrder('A')
