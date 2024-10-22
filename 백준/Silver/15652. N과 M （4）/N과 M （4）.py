import sys

input = sys.stdin.readline

def dfs(cnt, arr, start):
    if cnt == M:
        anser.append(arr)
        return
    for i in range(start, N+1):
        dfs(cnt + 1, arr + [i], i)

N, M = map(int, input().split())

anser = []

dfs(0, [], 1)

for i in anser:
    print(*i)

