n = int(input())
qtIN = 0
qtOUT =0

for x in range(1, n+1):
    nt = int(input())
    if nt >= 10 and nt <= 20:
        qtIN += 1
    else:
        qtOUT += 1

print(f'{qtIN} in')
print(f'{qtOUT} out')