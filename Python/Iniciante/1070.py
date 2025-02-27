n = int(input())

if (n%2) != 0:
    print(n)
    for x in range(1,6):
        n += 2
        print(n)
else:
    n += 1
    print(n)
    for x in range(1,6):
        n += 2
        print(n)