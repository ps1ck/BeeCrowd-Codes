x = int(input())
print(x)

cem = x / 100
print(f'{int(cem)} nota(s) de R$ 100,00')

cinq = (x%100) / 50
print(f'{int(cinq)} nota(s) de R$ 50,00')

vinte = ((x%100) % 50) / 20
print(f'{int(vinte)} nota(s) de R$ 20,00')

dez = (((x%100) % 50) % 20) / 10
print(f'{int(dez)} nota(s) de R$ 10,00')

cinco = ((((x%100) % 50) % 20) % 10) / 5
print(f'{int(cinco)} nota(s) de R$ 5,00')

dois = (((((x%100) % 50) % 20) % 10) % 5) / 2
print(f'{int(dois)} nota(s) de R$ 2,00')

um = ((((((x%100) % 50) % 20) % 10) % 5) % 2) / 1
print(f'{int(um)} nota(s) de R$ 1,00')