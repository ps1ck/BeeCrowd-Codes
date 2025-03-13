n = int(input())
i = 2

if n > 5 and n < 2000 and (n%2) == 0:
    while i <= (n):
        print(f'{i}^2 = {i*i}')
        i += 2