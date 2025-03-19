x = int(input())
i = 1
while x != 0:
    if x != 0:
        for _ in range(i, x):
            print(i, end=' ')
            i += 1
        print(i)
        i = 1
        x = int(input())
    else:
        break