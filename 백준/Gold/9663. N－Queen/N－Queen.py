N = int(input())

def dfs(i):
    global ans
    if i == N:
        ans += 1
        return
    for k in range(N):
        if v1[k] == v2[i - k] == v3[i + k] == 0:
            v1[k] = v2[i - k] = v3[i + k] = 1
            dfs(i+1)
            v1[k] = v2[i - k] = v3[i + k] = 0

ans = 0
v1 = [0] * N
v2 = [0] * (N * 2 - 1)
v3 = [0] * (N * 2 - 1)
dfs(0)
print(ans)