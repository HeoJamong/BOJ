import sys

input = sys.stdin.readline

n = int(input())
A = list(map(int, input().split()))

dp = [1] * n

for i in range(n):
	for k in range(i):
		if A[k] > A[i]:
			if dp[i] < dp[k] + 1:
				dp[i] = dp[k] + 1
print(max(dp))
