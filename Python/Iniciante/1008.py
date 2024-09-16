nf = int(input())   #Número do Funcionário
ht = int(input())   #Horas Trabalhadas
vh = float(input()) #Valor por Hora
salario = float(ht * vh)
print(f'NUMBER = {nf}')
print(f'SALARY = U$ {salario:.2f}')