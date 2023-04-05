cpf = '746.824.890-70'
soma = 0
result1 = 0
result2 = 0

cpf = cpf.split('.')
cpf = ''.join(cpf)
cpf = cpf.split('-')

cpf_nove_digitos = cpf[0]
cpf_ultimos_digitos = cpf[1]

#Cálculo do primeiro dígito
for i, j in enumerate(cpf_nove_digitos, start=-10):
    soma += (int(j) * abs(i))

result1 = (soma * 10) % 11

result1 = 0 if result1 > 9 else result1

#Cálculo do segundo dígito
soma = 0
for i, j in enumerate(cpf_nove_digitos, start=-11):
    soma += (int(j) * abs(i))

soma += result1 * 2

result2 = (soma * 10) % 11
result2 = 0 if result2 > 9 else result2

#Verificação da validade do CPF
if result1 == int(cpf_ultimos_digitos[0]) and result2 == int(cpf_ultimos_digitos[1]):
    print('Cpf válido!') 
else:
    print('Cpf inválido')