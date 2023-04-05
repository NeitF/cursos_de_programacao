const num1 = 10.5844140
const num2 = 5

//  console.log(num1.toString())
console.log('Num 1: ' + num1)
console.log('Deixando apenas 2 casas decimais: ' + num1.toFixed(2))

//  Saber se o número é inteiro
console.log('Número inteiro? ' + Number.isInteger(num1))
console.log('Número inteiro? ' + Number.isInteger(num2))

//  is not a number?
const temp = num1 * 'Ola'
console.log('É um não-número? ' + Number.isNaN(temp))
console.log('É um não-número? ' + Number.isNaN(num1))
