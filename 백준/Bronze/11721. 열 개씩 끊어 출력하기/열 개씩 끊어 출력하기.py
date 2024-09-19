import sys

inputString = sys.stdin.readline().rstrip()

for i in range(0, len(inputString), 10):
    print(inputString[i:i+10])