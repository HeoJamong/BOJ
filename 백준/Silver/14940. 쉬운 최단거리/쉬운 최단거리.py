import sys
from collections import deque

input = sys.stdin.readline
n,m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
result = [[-1] *m for _ in range(n)]


def bfs(y, x):
	dx = [0, 0, -1, 1]
	dy = [1, -1, 0, 0]
	q = deque([(y, x)])
	result[y][x] = 0
	while q:
		y, x = q.popleft()
		for i in range(4):
			ny = y + dy[i]
			nx = x + dx[i]
			if 0 <= ny < n and 0 <= nx < m and result[ny][nx] == -1:
				if arr[ny][nx] == 0:
					result[ny][nx] = 0
				elif arr[ny][nx] == 1:
					result[ny][nx] = result[y][x] + 1
					q.append((ny,nx))

for i in range(n):
	for k in range(m):
		if arr[i][k] == 2:
			bfs(i,k)
		elif arr[i][k] == 0:
			result[i][k] = 0

for row in result:
	print(*row)
