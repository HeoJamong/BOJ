import sys
from itertools import combinations

input = sys.stdin.readline

n, s = map(int, input().split())
arr = list(map(int, input().split()))

count = 0
for i in range(1, n + 1):
    for num in combinations(arr, i):
        tmp = sum(num)
        if tmp == s:
            count+=1
print(count)