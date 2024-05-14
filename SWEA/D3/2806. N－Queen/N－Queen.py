T = int(input())

def dfs(n):
    global ans
    if n == N:
        ans+=1
        return
    for i in range(N):
        if v1[i] == v2[i + n] == v3[i - n] == 0:
            v1[i] = v2[i + n] = v3[i - n] = 1
            dfs(n+1)
            v1[i] = v2[i + n] = v3[i - n] = 0
for tc in range(1, T+1):
    N = int(input())
    ans = 0
    v1 = [0] * N
    v2 = [0] * (N * 2 -1)
    v3 = [0] * (N * 2 - 1)
    dfs(0)
    print(f"#{tc} {ans}")