n = int(input())
for n in range(1, n+1):
    x = int(input())
    if x == 0:
        print('NULL')
    elif x > 0 and x%2 == 0:
        print('EVEN POSITIVE')
    elif x > 0 and x%2 != 0:
        print('ODD POSITIVE')
    elif x < 0 and x%2 == 0:
        print('EVEN NEGATIVE')
    elif x < 0 and x%2 != 0:
        print('ODD NEGATIVE')