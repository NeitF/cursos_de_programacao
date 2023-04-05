palavra_secreta = list('perfume')
palavra_formatada = ''
letra_digitada = ''

for letra in palavra_secreta:
    palavra_formatada += '*'

palavra_formatada = list(palavra_formatada)

while True:
    letra_digitada = input('Digite uma letra: ')

    if len(letra_digitada) > 1:
        print('Digite apenas uma letra!')
        continue

    i = 0
    if letra_digitada in palavra_secreta:
        for letra in palavra_secreta:
            if letra == letra_digitada:
                palavra_formatada[i] = letra
                i += 1
            else:
                i += 1
    
    print(''.join(palavra_formatada))

    if palavra_secreta == palavra_formatada:
        break

print('Parabéns! Você descobriu a palavra secreta')