n = int(input())
'''
피사노 주기
피보나치 수를 어떤 수 k로 나눌 때. 나머지는 항상 주기를 가지게 된다.
이러한 같은 수가 반복이 되는 경우를 피사노 주기라고 한다.
주기의 길이를 p라고 할때, n번째 피보나치 수를 m으로 나눈 나머지는
n%p번째 피보나치 수를 m으로 나눈 나머지와 같다.

주기는 p = 10^k(k>2)일때, 항상 15*10(k-1)이다

문제에서는 n번째 수를 1000000=1,000,000 = 10^6승 로 나눈 수를 출력하라 한다.

문제에서 주어진 나누는 수는 1000000=1,000,000 = 10^6승이며 따라서 
주기 p =  15 * 10 (6 - 1)이 된다.

문제에서 주어진 n을 주기 p로 나눠서 구한다.
n%m == n%p%m 이다.
'''

m = 1000000
p = m // 10 * 15

num = [0, 1]

if n == 0:
    print("0")
elif n == 1:
    print("1")
else:
    for i in range(2,p):
        num.append((num[i-1]+num[i-2])%m)

    print(num[n%p])