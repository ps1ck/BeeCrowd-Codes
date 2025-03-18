x = 0
while int(x) != 2002:
    x = int(input())
    if int(x) == 2002:
        print('Acesso Permitido')
        break
    else:
        print('Senha Invalida')