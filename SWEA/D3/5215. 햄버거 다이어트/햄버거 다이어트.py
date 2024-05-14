T = int(input())

def dfs(n, good,kcal):
    global ans
    if kcal > L:
        return
    if good > ans:
        ans = good
    if n == N:
        return
    
    dfs(n+1, good+arr[n][0], kcal+arr[n][1])
    dfs(n+1, good, kcal)

for tc in range(1, T+1):
    N, L = map(int,input().split())
    arr = [list(map(int,input().split())) for _ in range(N)]
    ans = 0
    v = [0] * N
    dfs(0, 0, 0)
    print(f"#{tc} {ans}")