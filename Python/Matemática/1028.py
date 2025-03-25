from math import gcd                # Função do máximo divisor comum (MDC)

c = int(input())

for _ in range(c):
    x,y = map(int, input().split())
    print(gcd(x,y))