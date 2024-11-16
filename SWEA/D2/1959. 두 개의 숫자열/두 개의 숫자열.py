T = int(input())

for tc in range(1, T + 1):
    n, m = map(int, input().split())
    arr_n = list(map(int, input().split()))
    arr_m = list(map(int, input().split()))

    result = 0
    if n > m:
        for i in range(n - m + 1):
            k = i
            j = 0
            sum = 0
            for _ in range(m):
                sum += arr_n[k] * arr_m[j]
                k += 1
                j += 1
            result = max(result, sum)
    else:
        for i in range(m - n + 1):
            k = i
            j = 0
            sum = 0
            for _ in range(n):
                sum += arr_n[j] * arr_m[k]
                k += 1
                j += 1
            result = max(result, sum)
    print(f"#{tc} {result}")
