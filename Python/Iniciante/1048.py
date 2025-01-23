x = float(input())

if x >= 0 and x <= 400.00:
    print(f'Novo salario: {x + (x * 0.15):.2f}')
    print(f'Reajuste ganho: {x * 0.15:.2f}')
    print(f'Em percentual: 15 %')
elif x > 400.00 and x <= 800.00:
    print(f'Novo salario: {x + (x * 0.12):.2f}')
    print(f'Reajuste ganho: {x * 0.12:.2f}')
    print(f'Em percentual: 12 %')
elif x > 800.00 and x <= 1200.00:
    print(f'Novo salario: {x + (x * 0.10):.2f}')
    print(f'Reajuste ganho: {x * 0.10:.2f}')
    print(f'Em percentual: 10 %')
elif x > 1200.00 and x <= 2000.00:
    print(f'Novo salario: {x + (x * 0.07):.2f}')
    print(f'Reajuste ganho: {x * 0.07:.2f}')
    print(f'Em percentual: 7 %')
elif x > 2000.00:
    print(f'Novo salario: {x + (x * 0.04):.2f}')
    print(f'Reajuste ganho: {x * 0.04:.2f}')
    print(f'Em percentual: 4 %')