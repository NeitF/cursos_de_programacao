lista_de_compras = []

while True:
    opcao = input('Selecione uma opção: \n [i]nserir [a]pagar [l]istar [s]air \n')
    opcao = opcao.lower()

    if opcao == 'i':
        item = input('Digite o que deseja inserir: ')
        lista_de_compras.append(item)
    elif opcao == 'a':
        try:
            indice = int(input('Escolha o índice para apagar: '))
            del(lista_de_compras[indice])
        except:
            print('O valor digitado é inválido ou o índice não existe!')
    elif opcao == 'l':
        for lista in enumerate(lista_de_compras):
            print(lista)
    elif opcao == 's':
        break
    else:
        print('Digite um valor válido!')
