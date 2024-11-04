import sys

input = sys.stdin.readline
n,m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
def dfs(seq, len, start):
    if len == m:
        print(*seq)
        return
    remember = 0
    for i in range(start, n):
        if arr[i] != remember:
            seq.append(arr[i])
            dfs(seq, len + 1, i)
            remember = arr[i]
            seq.pop()
dfs([], 0, 0)