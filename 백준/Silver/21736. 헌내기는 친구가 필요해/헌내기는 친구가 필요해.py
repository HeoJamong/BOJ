import sys
from collections import deque

input = sys.stdin.readline

def bfs(y, x):
	dx = [0,0, -1, 1]
	dy = [-1, 1, 0, 0]
	que = deque([(y, x)])
	global count
	visit[y][x] = True
	while que:
		y, x = que.popleft()
		for i in range(4):
			nx = x + dx[i]
			ny = y + dy[i]
			if 0 <= nx < m and 0 <= ny < n and arr[ny][nx] != "X":
				if not visit[ny][nx]:
					if arr[ny][nx] == "P":
						count += 1
					visit[ny][nx] = True
					que.append((ny, nx))

n, m = map(int, input().split())
visit = [[False] * m for _ in range(n)]
count = 0
arr = []

for i in range(n):
	arr.append(list(input().strip()))

for i in range(n):
	for k in range(m):
		if arr[i][k] == "I":
			py, px = i,k
bfs(py, px)
if (count == 0):
	print("TT")
else:
	print(count)
# print(arr)
