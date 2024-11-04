import sys

input = sys.stdin.readline
n,m = map(int, input().split())

arr = sorted(list(map(int, input().split())))
visit = [False] * n

def dfs(seq, len):
    if len == m:
        print(*seq)
        return
    remember = 0
    for i in range(n):
        if not visit[i] and remember != arr[i]:
            visit[i] = True
            seq.append(arr[i])
            dfs(seq, len + 1)
            visit[i] = False
            remember = arr[i]
            seq.pop()
dfs([], 0)