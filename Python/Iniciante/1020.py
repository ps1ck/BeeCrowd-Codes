idade = int(input()) #Idade em dias

ano = idade / 365
print(f'{int(ano)} ano(s)')

mes = (idade % 365) / 30
print(f'{int(mes)} mes(es)')

dia = ((idade % 365) % 30)
print(f'{int(dia)} dia(s)')