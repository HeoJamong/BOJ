import sys

while True:
    input_string = sys.stdin.readline().strip()
    if input_string == '':
        break
    else:
        print(input_string)