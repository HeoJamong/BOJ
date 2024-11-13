import sys

input = sys.stdin.readline
n, m = map(int, input().split())

dic = {}
for _ in range(n):
    url, pw = map(str, input().strip().split())
    dic[url] = pw

for _ in range(m):
    url = input().strip()
    print(dic[url])