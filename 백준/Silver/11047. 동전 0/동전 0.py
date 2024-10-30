import sys

input = sys.stdin.readline

n, k = map(int, input().split())
coin = []
result = 0
for _ in range(n):
	coin.append(int(input()))

for i in reversed(coin):
	if k == 0:
		break
	result += k // i
	k %= i
print(result)