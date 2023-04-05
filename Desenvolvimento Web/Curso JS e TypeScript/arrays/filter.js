// Primeira forma de usar Filter
const a = [1, 2, 3, 4, 5]

function callBackFilter(valor, indice, array){
  console.log('Valor: ' + valor)
  console.log('Índice: ' + indice)
  console.log('Array: ' + array)
}

a.filter(callBackFilter)

// Segunda forma de usar Filter
const numsFiltrados = a.filter(v => v > 2)
console.log('Números filtrados: ' + numsFiltrados)


const outrosNumsFiltrados = a.filter((valor, indice, array) => {
    console.log(valor)
    console.log(indice)
    console.log(array)
    return valor > 2
})

console.log(outrosNumsFiltrados)


// Retorne as pessoas que tem o nome com 5 letras ou mais
// Retorne as pessoas com mais de 50 anos
// Retorne as pessoas cujo nome termina com a
const pessoas = [
    {nome: 'Luiz', idade: 62},
    {nome: 'Maria', idade: 23},
    {nome: 'Eduardo', idade: 55},
    {nome: 'Letícia', idade: 19},
    {nome: 'Rosana', idade: 32},
    {nome: 'Wallace', idade: 47}
]

const condicao1 = pessoas.filter(v => v.nome.length >= 5)
console.log('Condição 1: ', condicao1)

const condicao2 = pessoas.filter(v => v.idade > 50)
console.log('Condição 2: ', condicao2)

const condicao3 = pessoas.filter(v => v.nome.endsWith('a'))
console.log('Condição 3: ', condicao3)