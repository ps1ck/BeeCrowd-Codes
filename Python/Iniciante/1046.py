x, y = map(int, input().split())

if x == y:
    print('O JOGO DUROU 24 HORA(S)')
elif x < y:
    print(f'O JOGO DUROU {y-x} HORA(S)')
elif x > y:
    y = y + 24
    print(f'O JOGO DUROU {y-x} HORA(S)')
