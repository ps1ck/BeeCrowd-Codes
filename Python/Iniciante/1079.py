n = int(input())
for n in range(1, n+1):
    a, b, c = map(float, input().split())
    mp = ((a*2) + (b*3) + (c*5)) / 10
    print(f'{mp:.1f}')