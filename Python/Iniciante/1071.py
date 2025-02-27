X = int(input())
Y = int(input())

if X > Y:           # Garantindo que o x vai ser sempre o menor
    X, Y = Y, X     # Atribuição simultânea (ou "desempacotamento de tupla"), o que significa que os dois valores são trocados sem a necessidade de uma variável temporária.

soma = 0
for i in range(X + 1, Y):
    if i % 2 != 0:
        soma += i

print(soma)