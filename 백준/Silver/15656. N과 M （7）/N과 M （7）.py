import sys

input = sys.stdin.readline
N, M = map(int, input().split())
num = sorted(list(map(int, input().split())))
arr = []


def dfs(n):
    if n == M:
        print(*arr)
        return
    for i in num:
        arr.append(i)
        dfs(n + 1)
        arr.pop()


dfs(0)
