x = 1
n = int(input())
for _ in range(n):
    print(f'{x} {x*x} {x*x*x}')
    print(f'{x} {(x*x)+1} {(x*x*x)+1}')
    x += 1