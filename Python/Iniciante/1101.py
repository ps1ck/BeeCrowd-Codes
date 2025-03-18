m = 1
n = 1
soma = 0
while m > 0 and n > 0:
    m,n = map(int, input().split())

    if m <= 0 or n <= 0:
        break 
    else:
        maior = max(m, n)
        menor = min(m, n)
    
        soma = 0
        for i in range(menor, maior+1, +1):
            print(i, end=" ")
            soma += i
        
        print(f'Sum={soma}')