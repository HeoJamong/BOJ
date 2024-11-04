import sys

input = sys.stdin.readline

while True:
    n = int(input())
    if n == 0:
        break
    sieve = [True] * (2*n + 1)
    sieve[0] = sieve[1] = False

    for i in range(2, int((2*n)**0.5) + 1):
        if sieve[i]:
            for k in range(i * i, 2*n + 1, i):
                sieve[k] = False
    primes = 0
    for j in range(n + 1, 2*n + 1):
        if sieve[j]:
            primes+= 1
    print(primes)
    