import sys

input = sys.stdin.readline

a, b, c, d = map(int, input().split())

print(a*56 + 24*b + 14*c + 6*d)