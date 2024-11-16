import sys

input = sys.stdin.readline

N, M = map(int, input().split())
arr = []
v = [False] * (N + 1)


def dfs(n):
    if n == M:
        print(*arr)
        return
    for i in range(1, N + 1):
        if not v[i]:
            arr.append(i)
            v[i] = True
            dfs(n + 1)
            arr.pop()
            v[i] = False


dfs(0)
