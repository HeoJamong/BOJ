import sys
from collections import deque
input = sys.stdin.readline


def bfs(v):
    queue = deque([v])
    visit[v] = True
    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if not visit[i]:
                visit[i] = True
                queue.append(i)

n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]
visit = [False] * (n + 1)

for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

count = 0

for i in range(1, n+1):
    if not visit[i]:
        if not graph[i]:
            count += 1
            visit[i] = True
        else:
            bfs(i)
            count += 1
print(count)