x, xm, y, ym = map(int, input().split())

if x == y and xm == ym:
    print('O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)')
elif x == y and xm > ym:
    ym = ym + 60
    print(f'O JOGO DUROU 23 HORA(S) E {ym - xm} MINUTO(S)')
elif x == y and xm < ym:
    print(f'O JOGO DUROU 0 HORA(S) E {ym - xm} MINUTO(S)')
elif x < y and xm == ym:
    print(f'O JOGO DUROU {y-x} HORA(S) E 0 MINUTO(S)')
elif x > y and xm == ym:
    y = y + 24
    print(f'O JOGO DUROU {y-x} HORA(S) E 0 MINUTO(S)')
elif x < y and xm > ym:
    ym = ym + 60
    print(f'O JOGO DUROU {(y-x)-1} HORA(S) E {ym - xm} MINUTO(S)')
elif x < y and xm < ym:
    print(f'O JOGO DUROU {y-x} HORA(S) E {ym - xm} MINUTO(S)')
elif x > y and xm > ym:
    y = y + 24
    ym = ym + 60
    print(f'O JOGO DUROU {(y-x)-1} HORA(S) E {ym - xm} MINUTO(S)')
elif x > y and xm < ym:
    y = y + 24
    print(f'O JOGO DUROU {y-x} HORA(S) E {ym - xm} MINUTO(S)')