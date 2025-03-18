ng = 0
vi = 0
vg = 0
emp = 0

i,g = map(int, input().split())
if i > g:
    vi += 1
elif i < g:
    vg += 1
else:
    emp += 1
ng += 1
x = int(input('Novo grenal (1-sim 2-nao)\n'))
while x == 1 or x != 2:
    if x == 1:
        i,g = map(int, input().split())
        if i > g:
            vi += 1
        elif i < g:
            vg += 1
        else:
            emp += 1
        ng += 1
        x = int(input('Novo grenal (1-sim 2-nao)\n'))
    elif x == 2:
        break
    else:
        x = int(input('Novo grenal (1-sim 2-nao)\n'))

print(f'{ng} grenais')
print(f'Inter:{vi}')
print(f'Gremio:{vg}')
print(f'Empates:{emp}')
if vi > vg:
    print(f'Inter venceu mais')
elif vi < vg:
    print(f'Gremio venceu mais')
else:
    print(f'Nao houve vencedor')