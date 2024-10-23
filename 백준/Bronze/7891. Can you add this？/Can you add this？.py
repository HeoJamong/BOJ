import sys

input = sys.stdin.readline

tc = int(input())

for _ in range(tc):
	n, m = map(int, input().split())
	print(n + m)