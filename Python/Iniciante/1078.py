n = int(input())
if n > 2 and n < 1000:
    for x in range(1, 11):
        print(f'{x} x {n} = {x*n}')