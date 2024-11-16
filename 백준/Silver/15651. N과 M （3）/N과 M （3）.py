import sys

input = sys.stdin.readline
N, M = map(int, input().split())

arr = []
def dfs(n):
    if n == M:
        print(*arr)
        return
    for i in range(1, N + 1):
        arr.append(i)
        dfs(n + 1)
        arr.pop()
dfs(0)
