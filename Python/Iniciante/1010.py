# .split() separa todos os valores recebidos no input nas respectivas variáveis.
cdp,np,vu = input().split() #Código de peça, número do produto, valor unitário, respectivamente.
cdp2,np2,vu2 = input().split() #Código de peça 2, número do produto 2, valor unitário 2, respectivamente.

cdp = int(cdp) #Recebi todos os dados como string, vou declara-los agora.
np = int(np)
vu = float(vu)
cdp2 = int(cdp2)
np2 = int(np2)
vu2 = float(vu2)

vp1 = float((np * vu)) #Valor final do produto 1
vp2 = float((np2 * vu2)) #Valor final do produto 2

TOTAL = float(vp1 + vp2)
print(f'VALOR A PAGAR: R$ {TOTAL:.2f}')