n = int(input())  
for z in range(n): 
    x, y = map(int, input().split()) 
    if x == y:
        print(0)
    else:
        maior = max(x, y)
        menor = min(x, y)
        
        if maior % 2 == 0:
            maior -= 1
        else:
            maior -= 2
        if menor % 2 == 0:
            menor -= 1

        
        soma = 0
        for i in range(maior, menor, -2):
            soma += i

        print(soma)