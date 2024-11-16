T = int(input())

for tc in range(1, T + 1):
    n = int(input())
    result = [0] * 5

    while n != 1:
        if n % 2 == 0:
            result[0] += 1
            n //= 2
        elif n % 3 == 0:
            result[1] += 1
            n //= 3
        elif n % 5 == 0:
            result[2] += 1
            n //= 5
        elif n % 7 == 0:
            result[3] += 1
            n //= 7
        elif n % 11 == 0:
            result[4] += 1
            n //= 11
    result_str = " ".join(map(str, result))
    print(f"#{tc} {result_str}")
