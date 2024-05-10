from collections import deque

T = int(input())

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y):
    q = deque([(x, y)])
    visit[x][y] = 0

    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < M and 0 <= ny < N and visit[nx][ny] == 1:
                q.append((nx, ny))
                visit[nx][ny] = 0

for tc in range(T):
    M, N, K = map(int, input().split())
    visit = [[0] * N for _ in range(M)]
    result = 0

    for _ in range(K):
        x, y = map(int, input().split())
        visit[x][y] = 1  

    for k in range(M):
        for j in range(N):
            if visit[k][j] == 1: 
                bfs(k, j)
                result += 1
    print(result)
