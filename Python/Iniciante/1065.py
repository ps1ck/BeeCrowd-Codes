vpares = 0
n = 0
for x in range(1,6):
    n = input()
    if (int(n)%2) == 0:
        vpares = vpares + 1

print(f'{int(vpares)} valores pares')