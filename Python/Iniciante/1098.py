i = 0
j1 = 1
j2 = 2
j3 = 3
print(f'I={i} J={j1}')
print(f'I={i} J={j2}')
print(f'I={i} J={j3}')
i += 0.2
j1 += 0.2
j2 += 0.2
j3 += 0.2
while i > 0.0 and i < 1.0:
    print(f'I={i:.1f} J={j1:.1f}')
    print(f'I={i:.1f} J={j2:.1f}')
    print(f'I={i:.1f} J={j3:.1f}')
    i += 0.2
    j1 += 0.2
    j2 += 0.2
    j3 += 0.2
print(f'I={i:.0f} J={j1:.0f}')
print(f'I={i:.0f} J={j2:.0f}')
print(f'I={i:.0f} J={j3:.0f}')
i += 0.2
j1 += 0.2
j2 += 0.2
j3 += 0.2
while i > 1.0 and i <= 1.9:
    print(f'I={i:.1f} J={j1:.1f}')
    print(f'I={i:.1f} J={j2:.1f}')
    print(f'I={i:.1f} J={j3:.1f}')
    i += 0.2
    j1 += 0.2
    j2 += 0.2
    j3 += 0.2
print(f'I={i:.0f} J={j1:.0f}')
print(f'I={i:.0f} J={j2:.0f}')
print(f'I={i:.0f} J={j3:.0f}')