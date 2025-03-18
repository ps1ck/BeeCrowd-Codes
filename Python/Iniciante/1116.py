n = int(input())
for _ in range(n):
    x,y = map(int, input().split())
    if y != 0:
        div = x/y
        print(f'{div:.1f}')
    else:
        print('divisao impossivel')