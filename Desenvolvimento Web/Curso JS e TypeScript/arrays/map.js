// Primeira forma de usar o map
const numeros = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

function callbackMap(valor, indice, array){
  console.log('Valor: ' + valor)
  console.log('Índice: ' + indice)
  console.log('Array: ' + array)
}

numeros.map(callbackMap)


// Segunda forma de usar o map
const a = numeros.map(v => console.log('Esse é o número ' + v))


// Adicione uma chave id em cada objeto
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


const condicao4Map = pessoas.map((v, i) => {
    v.id = i
    return v
})

console.log('Condição 4: ', condicao4Map)