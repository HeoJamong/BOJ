N,M = map(int, input().split())

def dfs(n,s,lst):
    if n == M:
        ans.append(lst)
        return
    for j in range(s, N+1):
        dfs(n+1, j+1, lst+[j])
ans = []
dfs(0,1,[]) 

for lst in ans:
    print(*lst)