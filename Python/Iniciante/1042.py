a, b, c = map(int, input().split())

if a > b and a > c:
    maior = a
    if b > c:
        meio = b
        menor = c
    else:
        meio = c
        menor = b
elif b > a and b > c:
    maior = b
    if a > c:
        meio = a
        menor = c
    else:
        meio = c
        menor = a
elif c > a and c > b:
    maior = c
    if b > a:
        meio = b
        menor = a
    else:
        meio = a
        menor = b

print(menor)
print(meio)
print(maior)
print()
print(a)
print(b)
print(c)