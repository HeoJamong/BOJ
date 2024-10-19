import sys

input = sys.stdin.readline

n = int(input())
A = list(map(int, input().split()))

dp = A.copy()

for i in range(n):
	for k in range(i):
		if A[k] < A[i]:
			dp[i] = max(dp[k] + A[i], dp[i])
print(max(dp))
