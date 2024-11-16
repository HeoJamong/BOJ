import sys

input = sys.stdin.readline
N, M = map(int, input().split())
num = sorted(list(map(int, input().split())))
arr = []


def dfs(n, s):
    if n == M:
        print(*arr)
        return
    for i in range(s, N):
        arr.append(num[i])
        dfs(n + 1, i)
        arr.pop()


dfs(0, 0)
