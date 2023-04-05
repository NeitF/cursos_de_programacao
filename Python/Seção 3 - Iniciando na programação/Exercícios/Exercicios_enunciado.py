"""
Faça um programa que peça ao usuário para digitar um número inteiro,
informe se este número é par ou ímpar. Caso o usuário não digite um número inteiro,
informe que não é um número inteiro.
"""
num = input('Digite um número inteiro: ')

if num.isnumeric():
    num = int(num)
    print('O valor é par' if num%2 == 0 else 'O valor é impar')
else:
    print('O valor digitado não é um número inteiro')

print(15 * '-')

"""
Faça um programa que pergunte a hora ao usuário e, baseando-se no horário
descrito, exiba a saudação apropriada. Ex:
Bom dia 0-11, Boa tarde 12-17 e Boa noite 18-23
"""
horario = int(input('Que horas são? '))
if horario >= 0 and horario <= 11:
    print('Bom dia')
elif horario >= 12 and horario <= 17:
    print('Boa tarde')
elif horario >= 18 and horario <= 23:
    print('Boa noite')
else:
    print('O horário digitado não existe')

print(15 * '-')

"""
Faça um programa que peça o primeiro nome do usuário. Se o nome tiver 4 letras ou
menos, escreva "Seu nome é curto"; se tiver entre 5 e 6 letras, escreva
"Seu nome é normal"; maior que 6 escreva "Seu nome é muito grande".
"""
nome = input('Digite o seu nome: ')
if len(nome) <= 4:
    print('Seu nome é curto')
elif len(nome) >= 5 and len(nome) <= 6:
    print('Seu nome é normal')
else:
    print('Seu nome é muito grande')
