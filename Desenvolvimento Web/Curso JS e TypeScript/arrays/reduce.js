// Geralmente usado para reduzir o array à um único elemento
const numeros = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

// Primeira forma de usar Reduce
// OBS: Caso eu não informe um valor inicial, o primeiro valor do acumulador será o valor do 
// primeiro elemento do array
const total = numeros.reduce((acum, v) => acum + v)
console.log('Total: ', total)

// Segunda forma de usar Reduce
// OBS: A segundo valor passado por parâmetro (5), é o valor inicial do acumulador
const total2 = numeros.reduce(function(acum, valor, indice, array){
  console.log(indice)
  console.log(valor)
  console.log('Acum: ', acum)
  return valor + acum
}, 5)


// Esse exemplo abaixo faz algo idêntico ao filter (não é indicado usar reduce para fazer filter)
const acumuladorComoFilter = numeros.reduce(function(acum, valor){
  if(valor % 2 === 0)
    acum.push(valor)
    return acum  
}, [])

console.log('Reduce como filter: ', acumuladorComoFilter)

// Esse exemplo abaixo faz algo idêntico ao map (não é indicado usar reduce para fazer map)
const acumuladorComoMap = numeros.reduce(function(acum, valor){
  acum.push(valor * 2)
  return acum  
  }, [])

console.log('Reduce como map: ', acumuladorComoMap)
  

// Retorne a pessoa mais velha
const pessoas = [
    {nome: 'Luiz', idade: 62},
    {nome: 'Maria', idade: 23},
    {nome: 'Eduardo', idade: 55},
    {nome: 'Letícia', idade: 19},
    {nome: 'Rosana', idade: 32},
    {nome: 'Wallace', idade: 47}
]

const pessoaMaisVelha = pessoas.reduce((acum, v) => {
  if(acum.idade > v.idade){
    return acum
  }
  return v
})

console.log('Pessoa mais velha: ', pessoaMaisVelha)