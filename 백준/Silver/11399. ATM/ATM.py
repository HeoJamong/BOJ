import sys

input = sys.stdin.readline

n = int(input())

arr = list(map(int,input().split()))
arr.sort()
sum_arr = [0]
tmp = 0

for i in arr:
	tmp = tmp + i
	sum_arr.append(tmp)


print(sum(sum_arr))