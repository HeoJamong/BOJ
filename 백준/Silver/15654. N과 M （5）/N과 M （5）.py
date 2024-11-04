import sys

input = sys.stdin.readline
n, m = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()
visit = [False] * 10001
def dfs(seq, len):
    if len == m:
        print(*seq)
        return
    for i in range(n):
        if visit[arr[i]] == False:
            seq.append(arr[i])
            visit[arr[i]] = True
            dfs(seq, len + 1)
            visit[arr[i]] = False
            seq.pop()

dfs([], 0)