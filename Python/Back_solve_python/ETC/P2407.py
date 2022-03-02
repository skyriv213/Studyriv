# 주어진 문제를 풀기위한 팩토리얼 식 입력
def factorial(a):
    if a <= 1:
        return 1
    else:
        return a * factorial(a - 1)

# 문제에서 주어지는 입력 값. n 과 m
n, m = map(int, input().split())

# int형 변환을 안하고 출력을 하는 경우 뒤에 소숫점이 붙었다. int형 변환 선언 후 출력
print(int(factorial(n) // (factorial(n - m) * factorial(m))))
