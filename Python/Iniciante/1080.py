from operator import index


list = []
for x in range(1,101):
    x = int(input())
    list.append(x)

maior = max(list)
posicao = list.index(maior)
print(maior)
print(f'{posicao+1}')