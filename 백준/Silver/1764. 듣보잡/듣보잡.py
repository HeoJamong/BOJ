import sys

input = sys.stdin.readline

n, m = map(int, input().split())
dj = set()
bj = set()
for _ in range(n):
    dj.add(input().strip())

for _ in range(m):
    bj.add(input().strip())

dbj = sorted(dj & bj)

print(len(dbj))
for who in dbj:
    print(who)
