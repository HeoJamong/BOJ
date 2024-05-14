

for tc in range(1, 11):
    cnt = int(input())
    arr = list(map(int,input().split()))

    for _ in range(cnt):
        s = max(arr)
        bid = arr.index(max(arr))
        sid = arr.index(min(arr))
        arr[bid] -= 1
        arr[sid] += 1
    
    print(f"#{tc} {max(arr) - min(arr)}")