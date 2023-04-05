lista = ['Maria', 'Helena', 1, 2, 3, 'Eduarda']
string = 'ABCD'
tup = 'Python', 'é', 'legal'

#Os dois códigos abaixo vão exibir e mesma coisa
print('Maria', 'Helena', 1, 2, 3, 'Eduarda')
print(*lista)

#Esse print (print(*lista)) se aplica a qualquer iterável
print(*string)
print(*tup)