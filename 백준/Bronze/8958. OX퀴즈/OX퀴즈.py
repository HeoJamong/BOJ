import sys

input = sys.stdin.readline
testCase = int(input())

for _ in range(testCase):
    anser = 0
    ox = input().strip()
    point = 0
    for c in ox:
        if c == 'X':
            point = 0
        else:
            point += 1
        anser += point
    print(anser)