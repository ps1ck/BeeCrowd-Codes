vp = 0.0
media = 0.0
for x in range (1,7):
    n = input()
    if float(n) >= 0:
        vp = vp + 1
        media = media + float(n)

print(f'{int(vp)} valores positivos')
mediafinal = media / vp
print(f'{mediafinal:.1f}')