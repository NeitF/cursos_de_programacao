"""
For + Range
range -> range(start, stop, step)
"""

#Quando eu passo apenas uma parâmetro, o start e o step viram 0, e esse valor que eu passei por parãmetro
#é o stop. No caso, ele vai de 0 a 9 
numeros = range(10)
numeros2 = range(5, 10)
numeros3 = range(0, 10, 2)
numerosNeg = range(0, -10, -1)

print('Sequencia normal de 0 a 9')
for n in numeros:
    print(n)


print('Sequencia 5 a 9')
for n in numeros2:
    print(n)


print('Sequencia 0 a 9 pulando de 2 em 2')
for n in numeros3:
    print(n)


print('Sequencia negativa')
for n in numerosNeg:
    print(n)