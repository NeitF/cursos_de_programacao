"""
split e join com list e str
split - divide uma string
join - une uma string
strip - remove os espaços em branco da string (tem tbm lstrip e rstrip)
"""

frase = 'Olha só que, coisa interessante'
#Ele vai dividir a string na vírgula e retornar uma lista. Se eu não passar nenhum parâmetro, o comportamento padrão
#é que ele divida a partir dos espaços em branco
lista_frases = frase.split(',')

for i, frase in enumerate(lista_frases):
    print(lista_frases[i].strip())

print(lista_frases)

frases_unidas = ' '.join(lista_frases)
print(frases_unidas)