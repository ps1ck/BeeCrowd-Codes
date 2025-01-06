A, B, C, D = map(int, input().split())

def maior(x,y):
    return x > y

somax = C + D
somay = A + B

def positivo(k):
    return k > 0


def par(h):
    return h % 2 == 0


resultados = [
    maior(B,C),
    maior(D,A),
    maior(somax,somay),
    positivo(C),
    positivo(D),
    par(A)
]

if all(resultados):
    print('Valores aceitos')
else:
    print('Valores nao aceitos')
