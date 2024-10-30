import sys
from collections import deque

input = sys.stdin.readline
n, m = map(int, input().split())

graph = [[] for _ in range(n + 1)]

for _ in range(m):
	a, b = map(int, input().split())
	graph[a].append(b)
	graph[b].append(a)

def bfs(v):
	num = [0] * (n + 1)
	ch[v] = 1
	q = deque([v])
	while q:
		v = q.popleft()
		for i in graph[v]:
			if ch[i] == 0:
				ch[i] = 1
				q.append(i)
				num[i] = num[v] + 1
	return sum(num)

answer = []

for i in range(1, n+1):
	ch = [0] *(n+1)
	answer.append(bfs(i))

print(answer.index(min(answer)) + 1)