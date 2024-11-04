import sys

input = sys.stdin.readline

n, k = map(int, input().split())
num = [True] * (n + 1)
num[0] = num[1] = False
count = 0
for i in range(2, n+1):
    if num[i]:
        for j in range(i, n+1, i):
            if num[j]:
                num[j] = False
                count += 1
                if count == k:
                    print(j)