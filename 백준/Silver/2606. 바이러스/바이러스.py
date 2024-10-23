import sys
from collections import deque

input = sys.stdin.readline

def bfs(v):
	visited = [v]
	global answer
	que = [v]
	while que:
		v = que.pop(0)
		for i in graph[v]:
			if i not in visited:
				visited.append(i)
				answer += 1
				que.append(i)

answer = 0
total_computers = int(input())
total_node = int(input())
visited = [] * (total_node + 1)
que = deque()

graph = [[] for _ in range(total_computers + 1)]

for _ in range(total_node):
	x, y = map(int, input().split())
	graph[x].append(y)
	graph[y].append(x)

bfs(1)
print(answer)