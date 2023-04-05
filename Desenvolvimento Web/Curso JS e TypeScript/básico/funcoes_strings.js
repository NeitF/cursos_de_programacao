let umaString = "um texto qualquer inserido aqui"

console.log('charAt: ' + umaString.charAt(6))
console.log('indexOf: ' + umaString.indexOf('texto'))

//Começa do final da string para o início (de trás pra frente)
console.log('lastIndexOf: ' + umaString.lastIndexOf('o'))
//No exemplo abaixo, o segundo parâmetro informa a partir de qual índice ele vai iniciar a busca
console.log('lastIndexOf: ' + umaString.lastIndexOf('m', 3))

//Busca e retorna expressão regular. No caso abaixo, vai retornar em um array todas as letras minúsculas 
//de 'a' até 'z'
console.log('match: ' + umaString.match(/[a-z]/g))

console.log('replace: ' + umaString.replace('um', 'outro'))

console.log('lenght: ' + umaString.length)

//Corta a string do índice 2 até o 5 (pois o segundo parâmetro '6' é exclusivo)
console.log('slice: ' + umaString.slice(2, 6))
console.log('slice: ' + umaString.slice(3))
console.log('slice: ' + umaString.slice(-5))

console.log('split: ' + umaString.split(' '))
console.log('split: ' + umaString.split(' ', 2))








