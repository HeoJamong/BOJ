import sys
input = sys.stdin.readline

test_case = int(input())

for _ in range(test_case):
    anser = ""
    R, S = input().split()
    for c in S:
        for _ in range(int(R)):
            anser += c
    print(anser)