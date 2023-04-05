const nomes = ['Maria', 'João', 'Eduardo', 'Gabriel', 'Júlia']

// A função 'splice' pode incluir ou excluir elemento de um array. Tudo depende dos parâmetros passados para 
// a função. A ordem dos parâmetros são: O índice que eu quero mexer, quantos índices eu quero deletar, elementos
// que eu quero adicionar
// nomes.splice(índice, delete, elem1, elem2, elem3)

// Removendo elementos de um array: (detalhe, a função irá retornar um array contendo os elementos
// que foram removidos)
const removidos = nomes.splice(4, 1)
console.log(nomes, removidos)

// Adicionando elementos (a partir do índice 3, adicione os elemento 'Nathan' e 'Jonas'). Obs: ele vai substituir
// o elemento no índice 3 pelo primeiro elemento que eu adicionar, nesse caso 'Nathan'
nomes.splice(3, 0, 'Nathan', 'Jonas')
console.log(nomes)

//Adicionando e removendo
nomes.splice(3, 2, 'Malena', 'Eloísa')
console.log(nomes)