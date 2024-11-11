T = int(input())

for tc in range(1, T + 1):
    p, q, r, s, w = map(int, input().split())
    result = 0
    if w <= r:
        result = min(p * w, q)
    else:
        result = min(p * w, q + s * (w - r))
    print(f"#{tc} {result}")