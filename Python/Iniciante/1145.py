x,y = map(int, input().split())
n = 1

for _ in range(y):
    for k in range(x-1):
        print(n, end = ' ')
        n += 1
    
    print(n)
    n += 1
    if n > y:
        break 