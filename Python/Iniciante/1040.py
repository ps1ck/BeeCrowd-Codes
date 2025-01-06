n1 ,n2 ,n3 ,n4 = map(float, input().split())

def media(a,b,c,d):
    m = ((a*2) + (b*3) + (c*4) + (d*1))/ 10
    return m

resultado = media(n1,n2,n3,n4)
print(f'Media: {resultado:.1f}')

if resultado >= 7.0:
    print('Aluno aprovado.')
elif resultado >= 5.0:
    print('Aluno em exame.')
    notanova = float(input())
    print(f'Nota do exame: {notanova:.1f}')
    resultadonovo = (notanova + resultado) / 2
    if resultadonovo >= 5.0:
        print('Aluno aprovado.')
        print(f'Media final: {resultadonovo:.1f}')
    else:
        print('Aluno reprovado.')
        print(f'Media final: {resultadonovo:.1f}')

else:
    print('Aluno reprovado.')
