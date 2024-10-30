import sys
from collections import deque

input = sys.stdin.readline

n,k = map(int, input().split())
max_point = 100000
visit = [0] * (max_point + 1)

def bfs(v):
	q = deque([v])
	while q:
		s = q.popleft()
		if s == k:
			print(visit[s])
			break
		for i in (s - 1, s + 1, s * 2):
			if 0 <= i <= max_point and not visit[i]:
				visit[i] = visit[s] + 1
				q.append(i)

bfs(n)