nome = str(input())
sf = float(input()) #Salário Fixo
tv = float(input()) #Total de Vendas
total = float( (sf + (tv * 0.15)) ) #Somando os 15% de comissão
print(f'TOTAL = R$ {total:.2f}')