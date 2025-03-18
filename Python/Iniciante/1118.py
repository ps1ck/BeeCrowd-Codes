n1 = float(input())
while n1 < 0.0 or n1 > 10.0:
    if n1 >= 0.0 and n1 <= 10.0:
        break
    else:
        print('nota invalida')
        n1 = float(input())

n2 = float(input())
while n2 < 0.0 or n2 > 10.0:
    if n2 >= 0.0 and n2 <= 10.0:
        break
    else:
        print('nota invalida')
        n2 = float(input())

print(f'media = {((n1+n2)/2):.2f}')

x = int(input('novo calculo (1-sim 2-nao)\n'))
while x == 1 or x != 2:
    if x == 1:
        n1 = float(input())
        while n1 < 0.0 or n1 > 10.0:
            if n1 >= 0.0 and n1 <= 10.0:
                break
            else:
                print('nota invalida')
                n1 = float(input())

        n2 = float(input())
        while n2 < 0.0 or n2 > 10.0:
            if n2 >= 0.0 and n2 <= 10.0:
                break
            else:
                print('nota invalida')
                n2 = float(input())
        print(f'media = {((n1+n2)/2):.2f}')
        x = int(input('novo calculo (1-sim 2-nao)\n'))
    elif x == 2:
        break
    else:
        x = int(input('novo calculo (1-sim 2-nao)\n'))