tempo = int(input())
vmedia = int(input())

dpercorrida = tempo * vmedia
combustivel = dpercorrida / 12 # O automóvel faz 12km/l

print('{:.3f}'.format(combustivel))