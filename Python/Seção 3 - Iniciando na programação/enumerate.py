
#criar uma lista enumerada (vai enumerar os elementos)
lista = ['Maria', 'Helena', 'João']
lista.append('João')


#O enumerate pode receber qualquer iterável. Recebendo um iterável, ele irá enumerar
#cada um dos elementos
lista_enumerada = enumerate(lista)


#Esse objeto enumerado vira uma TUPLA, com o 'índice' no primeiro índice da tupla e o 'valor' no segundo índice da
#tupla.
print(next(lista_enumerada))


#'i' irá armazenar as enumerações dos valores. 'e' irá armazenar os valores da lista (desempacotamento)
for i, e in enumerate(lista):
    print('Enumeração: ', i, ' Valor da lista: ', e)

print('-' * 10)
#enum ja armazena a lista enumerada
for enum in enumerate(lista):
    print(enum)


#Obs importante:
"""

for item in lista_enumerada:
    print(item)

for item in lista_enumerada:
    print(item)

    
O segundo laço for não irá imprimir nada. Isso porque os valores do meu iterator enumerate ja foram consumidos
no primeiro laço. Uma maneira de contornar isso é ao invés de armazenar o enumerate em uma variável, colocar ele
direto no for, como no exemplo abaixo:

for item in enumerate(lista):
    print(item)
"""

#Converter enumerate para uma lista
lista_enum = list(enumerate(lista))
print('Lista enum: ', lista_enum)


# for i, e in enumerate(lista, start=19):
#     print('Enumeração: ', i, ' Valor da lista: ', e)