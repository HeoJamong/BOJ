import heapq

T = int(input())

for tc in range(1, T + 1):
    N, M, K = map(int, input().split())
    arr = list(map(int, input().split()))
    heapq.heapify(arr)

    ans = "Possible"
    sell = 0
    while sell != N:
        time = heapq.heappop(arr)
        bun = time // M * K - sell
        if bun != 0:
            sell += 1
        else:
            ans = "Impossible"
            break
    print(f"#{tc} {ans}")
