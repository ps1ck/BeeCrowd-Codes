e1 = input()
e2 = input()
e3 = input()

if e1 == 'vertebrado':
    if e2 == 'ave':
        if e3 == 'carnivoro':
            print('aguia')
        elif e3 == 'onivoro':
            print('pomba')
    elif e2 == 'mamifero':
        if e3 == 'onivoro':
            print('homem')
        elif e3 == 'herbivoro':
            print('vaca')

if e1 == 'invertebrado':
    if e2 == 'inseto':
        if e3 == 'hematofago':
            print('pulga')
        elif e3 == 'herbivoro':
            print('lagarta')
    if e2 == 'anelideo':
        if e3 == 'hematofago':
            print('sanguessuga')
        elif e3 == 'onivoro':
            print('minhoca')