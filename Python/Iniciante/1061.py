x = input()
y = x.split('Dia ')
dataInicial = y[1]

x = input()
y = x.split(' : ')
horaInicial = y[0]
minInicial = y[1]
secInicial = y[2]

x = input()
y = x.split('Dia ')
dataFinal = y[1]

x = input()
y = x.split(' : ')
horaFinal = y[0]
minFinal = y[1]
secFinal = y[2]

InicialEmSegundos = (float(dataInicial) - 1) * 86400 + float(horaInicial) * 3600 + float(minInicial) * 60 + float(secInicial)   # -1 na dataInicial para achar a quantidade de
FinalEmSegundos = (float(dataFinal) - 1) * 86400 + float(horaFinal) * 3600 + float(minFinal) * 60 + float(secFinal)             # dias inteiros, o dia atual ta acontecendo.

VlrFinal = FinalEmSegundos - InicialEmSegundos
dias = VlrFinal // 86400
VlrFinal %= 86400

horas = VlrFinal // 3600
VlrFinal %= 3600

minutos = VlrFinal // 60
segundos = VlrFinal % 60

print(f"{int(dias)} dia(s)")
print(f"{int(horas)} hora(s)")
print(f"{int(minutos)} minuto(s)")
print(f"{int(segundos)} segundo(s)")