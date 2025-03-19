valores = list(map(int, input().split()))               # Feito com chat gpt depois de muito estudo, eu tinha imaginado que a solução era essa, só não tava conseguindo fazer
A = valores[0]

for N in valores[1:]:
    if N > 0:
        break

soma = sum(A + i for i in range(N))

print(soma)
