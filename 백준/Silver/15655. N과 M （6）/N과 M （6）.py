import sys
from itertools import combinations

n, m = map(int,input().split())
arr = sorted(list(map(int,input().split())))

for comb in combinations(arr, m):
    print(" ".join(map(str,comb)))