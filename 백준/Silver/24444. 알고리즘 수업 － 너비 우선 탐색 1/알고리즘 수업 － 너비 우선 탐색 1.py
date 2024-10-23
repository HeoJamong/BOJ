import sys
from collections import deque

input = sys.stdin.readline

def bfs(v):
    visit[v] = True
    que = deque([v])
    order[v] = cnt[0]
    cnt[0] += 1
    while que:
        v = que.popleft()
        for i in graph[v]:
            if not visit[i]:
                visit[i] = True
                order[i] = cnt[0]
                cnt[0] += 1
                que.append(i)

n, m, r = map(int, input().split())
visit = [False] * (n + 1)
graph = [[] for _ in range(n + 1)]
order = [0] * (n + 1)
cnt = [1]

for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

for i in range(1, n+1):
    graph[i].sort()

bfs(r)

for i in range(1, n + 1):
    print(order[i])