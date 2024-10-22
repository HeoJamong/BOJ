import sys

input = sys.stdin.readline

a = int(input())
b = int(input())
c = int(input())
abc_sum = list(str(a * b * c))

for i in range(10):
    print(abc_sum.count(str(i)))