"""
Os tipos str, int, float e bool são IMUTÁVEIS. Portanto, operações como esta 
abaixo não são possíveis:

-----------------------
string = 'Luiz otavio'
string[3] = 'ABC'
print(string[3])
-----------------------

"""

string = '1000'
outra_variavel = f'{string[:3]}ABC{string[4:]}'
print(string)
print(outra_variavel)
print(string.zfill(10))