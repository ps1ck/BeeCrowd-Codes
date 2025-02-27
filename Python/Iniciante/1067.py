x = int(input())
q = x + 1
aux = 1
for y in range(1, q):
    if (aux%2) != 0:
        print(aux)
    aux += 1