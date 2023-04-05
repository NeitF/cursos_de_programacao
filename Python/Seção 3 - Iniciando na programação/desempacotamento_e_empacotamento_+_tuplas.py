"""
Introdução ao desempacotamento + tuplas
"""

nomes = ['Maria', 'Helena', 'João']
nome1, nome2, nome3 = nomes

# nome1, nome2, nome3 = ['Maria', 'Helena', 'João']

# Supondo que eu queira desempacotar apenas um valor, eu terei que empacotar o resto. Para isso, usarei o '*'
nome1, *resto = ['Maria', 'Helena', 'João']
print(nome1) #conterá o valor 'Maria'
print(resto) #conterá o valor ['Helena', 'João']

# Existe uma convenção no Python que, caso você não vá utilizar o resto, utilize _ para nomear a variável
nome1, *_ = ['Maria', 'Helena', 'João']
print(nome1)

#Também posso usar o _ para caso eu queira por exemplo pegar o segundo valor (nesse caso, Helena), e ignorar
#o primeiro:
_, nome2, *_ = ['Maria', 'Helena', 'João']
print(nome2)

#O mesmo exemplo acima se aplica caso eu queira o terceiro valor.
#OBS: mesmo não tendo mais itens para o 'resto', ele vai armazenar uma lista vazia
_, _, nome3, *resto = ['Maria', 'Helena', 'João']
print(nome3, resto)


#TUPLAS
nomes_tuplas = 'Maria', 'Helena', 'João'

#converter lista para tupla
nomes_tuplas2 = tuple(nomes)

#converter tupla para lista
nomes_tuplas2 = list(nomes_tuplas2)