import heapq
import sys
N = int(input())
heap = []

for i in range(N):
    heapq.heappush(heap, int(sys.stdin.readline()))
result = 0
while len(heap) > 1:
    min1 = heapq.heappop(heap)
    min2 = heapq.heappop(heap)
    sum = min1 + min2
    result += sum
    heapq.heappush(heap, sum)

print(result)