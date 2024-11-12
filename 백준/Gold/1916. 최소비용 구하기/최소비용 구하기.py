import sys
import heapq
input = sys.stdin.readline
INF = 1e8
n = int(input())
m = int(input())
g = [[] for _ in range (n + 1)]
for _ in range(m):
    s, e, p = map(int, input().split())
    g[s].append((e, p))
a, b = map(int, input().split())
distance = [INF] * (n + 1)
def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0
    while q:
        dist, now = heapq.heappop(q)
        if distance[now] < dist:
            continue
        for i in g[now]:
            if dist + i[1] < distance[i[0]]:
                distance[i[0]] = dist + i[1]
                heapq.heappush(q, (dist+i[1], i[0]))
dijkstra(a)
print(distance[b])