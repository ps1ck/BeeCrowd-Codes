cd, qd = map(int,input().split())
valor = 0

if cd == 1:
    valor = 4.00
elif cd == 2:
    valor = 4.50
elif cd == 3:
    valor = 5.00
elif cd == 4:
    valor = 2.0
elif cd == 5:
    valor = 1.5
else:
    print('Código errado')

resultado = qd * valor
print(f'Total: R$ {resultado:.2f}')