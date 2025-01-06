x = float(input())

if x <= 100:
    if x >= 0:
        if x > 25.00:
            if x <= 50:
                print('Intervalo (25,50]')
            else:
                if x <= 75:
                    print('Intervalo (50,75)')
                else:
                    print('Intervalo (75,100]')
        else:
            print('Intervalo [0,25]')
    else:
        print('Fora de intervalo')
else:
    print('Fora de intervalo')