n = int(input())
for _ in range(n):
    x,y = map(int, input().split())
    try:
        div = x/y
        print(f'{div:.1f}')
    except ZeroDivisionError:
        print('divisao impossivel')

# Foi testado e foi aceito!