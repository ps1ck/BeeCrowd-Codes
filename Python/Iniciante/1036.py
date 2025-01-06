import math 

A, B, C = map(float, input().split())

if 2*A == 0:
    print(f'Impossivel calcular')
else:
    delta = (B**2) - 4 * A * C
    if delta < 0:
        print(f'Impossivel calcular')
    else:
        bhaskara1 = (-B + math.sqrt(delta)) / (2 * A)
        bhaskara2 = (-B - math.sqrt(delta)) / (2 * A)
        print(f'R1 = {bhaskara1:.5f}')
        print(f'R2 = {bhaskara2:.5f}')