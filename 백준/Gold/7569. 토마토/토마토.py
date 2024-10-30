import sys
from collections import deque

input = sys.stdin.readline

n, m, h = map(int, input().split())
arr = [[list(map(int, input().split())) for _ in range(m)] for _ in range(h)]
visit = [[[False] * n for _ in range(m)] for _ in range(h)]

q = deque()

for z in range(h):
	for y in range(m):
		for x in range(n):
			if arr[z][y][x] == 1:
				q.append((z,y,x))


def bfs(q, z, y, x):
	dx = [0, 0, -1, 1, 0, 0]
	dy = [1, -1, 0, 0, 0, 0]
	dz = [0, 0, 0, 0, 1, -1]
	visit[z][y][x] = True
	q.appendleft((z,y,x))
	while q:
		z,y,x = q.popleft()
		for i in range(6):
			nx = x + dx[i]
			ny = y + dy[i]
			nz = z + dz[i]
			if 0 <= nx < n and 0 <= ny < m and 0 <= nz < h and not visit[nz][ny][nx] and arr[nz][ny][nx] == 0:
				visit[nz][ny][nx] = True
				arr[nz][ny][nx] = arr[z][y][x] + 1
				q.append((nz,ny,nx))

if q:
	z,y,x = q.popleft()
	bfs(q, z, y, x)

flag = False
result = 0
for z in range(h):
	for y in range(m):
		for x in range(n):
			if arr[z][y][x] == 0:
				flag = True
			result = max(result, arr[z][y][x])

if flag:
	print(-1)
else:
	print(result - 1)
