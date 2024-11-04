import sys
input = sys.stdin.read

def sieve_of_eratosthenes(M, N):
    # 0과 1은 소수가 아니므로 False로 설정
    sieve = [True] * (N + 1)
    sieve[0] = sieve[1] = False
    
    # 에라토스테네스의 체 알고리즘 적용
    for i in range(2, int(N ** 0.5) + 1):
        if sieve[i]:  # i가 소수일 때
            for j in range(i * i, N + 1, i):
                sieve[j] = False  # i의 배수를 모두 False로 설정

    # M부터 N까지의 소수 출력
    primes = []
    for k in range(M, N + 1):
        if sieve[k]:
            primes.append(k)
    
    return primes

# 입력받기
M, N = map(int, input().split())
primes = sieve_of_eratosthenes(M, N)
print("\n".join(map(str, primes)))
