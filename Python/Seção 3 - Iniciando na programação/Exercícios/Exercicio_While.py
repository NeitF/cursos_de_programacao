nome = 'Nathan Fonseca'
tamanho = len(nome)
novo_nome = ''
i = 0

while i < tamanho:
    letra = nome[i]
    novo_nome += f'*{letra}'
    i += 1

print(novo_nome)