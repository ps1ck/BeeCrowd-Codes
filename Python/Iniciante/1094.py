n = int(input())
c = 0
r = 0 
s = 0
for n in range(1, n+1):
    x,y = input().split()
    if int(x) >= 1 and int(x) <= 15:
        if y == 'C':
            c += int(x)
        elif y == 'R':
            r += int(x)
        elif y == 'S':
            s += int(x)

total = c+r+s
print(f'Total: {total} cobaias')
print(f'Total de coelhos: {c}')
print(f'Total de ratos: {r}')
print(f'Total de sapos: {s}')
print(f'Percentual de coelhos: {(c/total)*100:.2f} %')
print(f'Percentual de ratos: {(r/total)*100:.2f} %')
print(f'Percentual de sapos: {(s/total)*100:.2f} %')