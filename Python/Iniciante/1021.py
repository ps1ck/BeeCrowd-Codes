''' ESSE CÓDIGO TAVA DANDO ERRO NOS CENTAVOS.
x = float(input())

print('NOTAS:')
cem = x / 100
print(f'{int(cem)} nota(s) de R$ 100.00')

cinq = (x%100) / 50
print(f'{int(cinq)} nota(s) de R$ 50.00')

vinte = ((x%100) % 50) / 20
print(f'{int(vinte)} nota(s) de R$ 20.00')

dez = (((x%100) % 50) % 20) / 10
print(f'{int(dez)} nota(s) de R$ 10.00')

cinco = ((((x%100) % 50) % 20) % 10) / 5
print(f'{int(cinco)} nota(s) de R$ 5.00')

dois = (((((x%100) % 50) % 20) % 10) % 5) / 2
print(f'{int(dois)} nota(s) de R$ 2.00')



print('MOEDAS:')
um = ((((((x%100) % 50) % 20) % 10) % 5) % 2) / 1
print(f'{int(um)} moeda(s) de R$ 1.00')

if um >= 0.50:
    zcinq = (((((((x%100) % 50) % 20) % 10) % 5) % 2) % 1) / 0.50
    print(f'{int(zcinq)} moeda(s) de R$ 0.50')
else:
    print('0 moeda(s) de R$ 0.50')

if um >= 0.25:
    zvintec = ((((((((x%100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) / 0.25
    print(f'{int(zvintec)} moeda(s) de R$ 0.25')
else:
    print('0 moeda(s) de R$ 0.25')

if um >= 0.10:
    zdez = (((((((((x%100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) / 0.10 
    print(f'{int(zdez)} moeda(s) de R$ 0.10')
else:
    print('0 moeda(s) de R$ 0.10')

if um >= 0.05:
    zcinco = ((((((((((x%100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10) / 0.05
    print(f'{int(zcinco)} moeda(s) de R$ 0.05')
else:
    print('0 moeda(s) de R$ 0.05')    

if um >= 0.01:
    zUM = (((((((((((x%100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10) % 0.05) / 0.01
    print(f'{int(zUM)} moeda(s) de R$ 0.01')
else:
    print('0 moeda(s) de R$ 0.01') 
    '''

#CODIGO MELHORADO PELO CHAT GPT, APRENDI FOR HOJE ENTÃO JÁ CONSEGUI ENTENDER E UTILIZEI ESSE:

x = float(input())  # Entrada em reais
valor = int(round(x * 100))  # Trabalhar em centavos para evitar erros de ponto flutuante

print('NOTAS:')
notas = [10000, 5000, 2000, 1000, 500, 200]  # Valores em centavos (lista)
for nota in notas:
    qtd_notas = valor // nota
    print(f'{qtd_notas} nota(s) de R$ {nota / 100:.2f}')
    valor %= nota

print('MOEDAS:')
moedas = [100, 50, 25, 10, 5, 1]  # Valores em centavos (lista)
for moeda in moedas:
    qtd_moedas = valor // moeda
    print(f'{qtd_moedas} moeda(s) de R$ {moeda / 100:.2f}')
    valor %= moeda
 