a = 0
g = 0
d = 0
x = 5
while x > 0:
    if x == 1:
        a += 1
        x = int(input())
    elif x == 2:
        g += 1
        x = int(input())
    elif x == 3:
        d += 1
        x = int(input())
    elif x == 4:
        print('MUITO OBRIGADO')
        break
    else:
        x = int(input())

print(f'Alcool: {a}')
print(f'Gasolina: {g}')
print(f'Diesel: {d}')