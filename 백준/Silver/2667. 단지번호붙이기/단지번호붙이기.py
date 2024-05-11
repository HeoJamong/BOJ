from collections import deque

N = int(input())

m = [list(map(int, input())) for _ in range(N)]
v = [[0] * N for _ in range(N)]
ans = []

dx = [0, 0, 1, -1]
dy = [-1, 1, 0, 0]

def bfs(si, sj):
    q = deque([(si,sj)])
    v[si][sj] = 1
    cnt = 1

    while q:
        y, x = q.popleft()
        for k in range(4):
            ny, nx = y + dy[k], x + dx[k]
            if 0 <= nx < N and 0 <= ny < N and v[ny][nx] == 0 and m[ny][nx] == 1:
                q.append((ny,nx))
                v[ny][nx] = 1
                cnt+=1
    return cnt

for i in range(N):
    for j in range(N):
        if m[i][j] == 1 and v[i][j] == 0:
            ans.append(bfs(i,j))

ans.sort()
print(len(ans), *ans, sep='\n')
