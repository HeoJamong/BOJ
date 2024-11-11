T = int(input())

for _ in range(T):
    tc = int(input())
    arr = list(map(int, input().split()))
    frequency = [0] * 101

    for score in arr:
        frequency[score] += 1

    max_count = 0
    result = 0

    for score in range(100, -1, -1):
        if frequency[score] > max_count:
           max_count = frequency[score]
           result = score

    print(f"#{tc} {result}")