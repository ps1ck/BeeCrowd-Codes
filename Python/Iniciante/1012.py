A,B,C = input().split()

A = float(A) 
B = float(B) 
C = float (C)

tri = float( (A * C) / 2 ) #Área do triângulo retângulo (A é a base e C é a altura)
print(f'TRIANGULO: {tri:.3f}')

cir = float(3.14159 * (C**2)) #Área do círculo (C é o raio)
print(f'CIRCULO: {cir:.3f}')

trap = float( ((A + B) * C )/ 2 ) #Área do trapézio (A e B são as bases e C é a altura)
print(f'TRAPEZIO: {trap:.3f}')

quad = float(B**2) #Área do quadrado (B é o lado)
print(f'QUADRADO: {quad:.3f}')

ret = float(A * B) #Área do retângulo (A e B são os lados)
print(f'RETANGULO: {ret:.3f}')