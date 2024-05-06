import sys

R, C = map(int, input().split())
m = [list(map(str, sys.stdin.readline().strip())) for _ in range(R)]
result = 1
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
tmp = set()
def dfs(x, y, cnt):
    global result
    result = max(result, cnt)
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < C and 0 <= ny < R and m[ny][nx] not in tmp:
            tmp.add(m[ny][nx])
            dfs(nx, ny, cnt + 1)
            tmp.remove(m[ny][nx])
tmp.add(m[0][0])
dfs(0, 0, 1)
print(result)