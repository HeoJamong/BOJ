T = int(input())

for tc in range(1, T+1):
    N = int(input())
    arr = [list(map(int, input())) for _ in range(N)]
    ans = 0
    mid = N // 2
    for i in range(N):
        if i <=mid:
            for j in range(mid-i, mid+i+1):
                ans+= arr[i][j]
        else:
            for j in range(i-mid, N-(i-mid)):
                ans+= arr[i][j]
    print(f"#{tc} {ans}")