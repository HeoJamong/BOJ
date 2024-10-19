import sys

input = sys.stdin.readline

n = int(input())

arr = list(map(int, input().split()))

dp = [1] * n

for now in range(1, n):
	for before in range(now):
		if arr[before] < arr[now]:
			if dp[now] < dp[before] + 1:
				dp[now] = dp[before] + 1
print(max(dp))
