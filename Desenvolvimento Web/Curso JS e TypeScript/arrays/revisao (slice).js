const nomes = ['Eduardo', 'Maria', 'Joana', 'Wallace', 'Rosana']
nomes[2] = 'João'
delete nomes[2]
console.log(nomes)

//Fatiando o array
const novo = nomes.slice(1, 3)
console.log(novo)

//Remover último elemento do array
const novo2 = nomes.slice(0, -1)
console.log(novo2)

//Transforman string em array com Split
const nome = 'Nathan Fonseca da Silva'
const n = nome.split(' ')
console.log(n)


//Transformar array em string
const nome2 = n.join(' ')
console.log(nome2)