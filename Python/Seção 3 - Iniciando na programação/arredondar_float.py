import decimal


numero_1 = 0.1
numero_2 = 0.7
numero_3 = numero_1 + numero_2
print(numero_3)
print(f'{numero_3:.2f}')

#O primeiro parâmetro é a variável. O segundo parâmetro é quantas casas decimais eu quero que tenha depois
#da vírgula.
print(round(numero_3, 3))

#Usando decimal. OBS: geralmente só será usado para valores muito grande que necessitam de muita precisão
num1 = decimal.Decimal('0.1')
num2 = decimal.Decimal('0.7')
num3 = num1 + num2
print(num3)