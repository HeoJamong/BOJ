import sys

input = sys.stdin.readline
N, M = map(int, input().split())

arr = []


def dfs(n, s):
    if n == M:
        print(*arr)
        return
    for i in range(s, N + 1):
        arr.append(i)
        dfs(n + 1, i + 1)
        arr.pop()


dfs(0, 1)
