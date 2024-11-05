import sys
from itertools import combinations

input = sys.stdin.readline
n, m = map(int, input().split())
arr = list(map(int, input().split()))
max_sum = 0

for comb in combinations(arr, 3):
    tmp = sum(comb)
    if tmp <= m and max_sum < tmp:
        max_sum = tmp

print(max_sum)