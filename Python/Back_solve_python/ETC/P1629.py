
def pow(a, b, c):
    if b == 1:
        return a % c
    n = pow(a, b//2, c)
    if b % 2 == 0:
        return n * n % c
    else:
        return a * n * n % c

a, b, c = map(int, input().split())
print(pow(a, b, c))

# def power(a, b):
#     if b == 1: # b의 값이 1이면 a % C를 return한다.
#         return a % C
#     else:
#         temp = power(a, b // 2) # a^(b // 2)를 미리 구한다.
#         if b % 2 == 0:
#             return temp * temp % C # b가 짝수인 경우
#         else:
#             return temp * temp * a % C # b가 홀수인 경우
#
#
# if __name__ == "__main__":
#     A, B, C = map(int, input().split())
#
#     result = power(A, B)
#     print(result)