import sys
from collections import deque

input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(m)]
visit = [[False] * n for _ in range(m)]


def	bfs(q, y, x):
	dy = [1, -1, 0, 0]
	dx = [0, 0, -1, 1]
	visit[y][x] = True
	q.appendleft((y,x))
	while q:
		y, x = q.popleft()
		for i in range(4):
			ny = y + dy[i]
			nx = x + dx[i]
			if 0 <= ny < m and 0 <= nx < n and not visit[ny][nx] and arr[ny][nx] == 0:
				visit[ny][nx] = True
				arr[ny][nx] = arr[y][x] + 1
				q.append((ny,nx))


q = deque()
for i in range(m):
	for k in range(n):
		if arr[i][k] == 1:
			q.append((i,k))

if q:
	y, x = q.popleft()
	bfs(q,y, x)


flag = False
for i in range(m):
	for k in range(n):
		if arr[i][k] == 0:
			flag = True

if flag == True:
	print(-1)
else:
	print(max(max(row) for row in arr) - 1)