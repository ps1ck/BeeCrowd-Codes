vpares = 0
vimpar = 0
vpos = 0
vneg = 0
n = 0

for x in range(1,6):
    n = input()
    if (int(n)%2) == 0:
        vpares += 1
    else:
        vimpar += 1
    if int(n) != 0:
        if int(n) > 0:
            vpos += 1
        else:
            vneg += 1
        
print(f'{int(vpares)} valor(es) par(es)')
print(f'{int(vimpar)} valor(es) impar(es)')
print(f'{int(vpos)} valor(es) positivo(s)')
print(f'{int(vneg)} valor(es) negativo(s)')