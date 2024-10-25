import sys
from collections import deque

input = sys.stdin.readline

n = int(input())
graph = [[] for _ in range(n + 1)]
answer = [0] * (n + 1)

for _ in range(n - 1):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

def bfs(v):
    deq = deque([v])
    while deq:
        q = deq.popleft()
        for x in graph[q]:
            if answer[x] == 0:
                answer[x] = q
                deq.append(x)

bfs(1)
for i in range(2, n + 1):
    print(answer[i])