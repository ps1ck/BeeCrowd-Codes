n = int(input())
x = 1
if n < 10000:
    for x in range(1,10001):
        if (x%n) == 2:
            print(x)
        x += 1