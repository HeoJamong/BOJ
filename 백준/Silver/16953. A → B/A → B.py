import sys
from collections import deque

input = sys.stdin.readline
a, b = map(int, input().split())

def bfs(a):
	q = deque([(a, 1)])
	while q:
		n, count = q.popleft()
		if n == b:
			return(count)
		for i in (n * 2, n * 10 + 1):
			if i <= b:
				q.append((i, count + 1))
	return (-1)
print(bfs(a))