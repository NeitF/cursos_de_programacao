const a1 = [1,2,3,4,5,6,7,8,9,10]

// Primeira forma de usar forEach
a1.forEach(function(valor, indice, array){
  console.log(valor)
  console.log(indice)
  console.log(array)
})

let total = 0
a1.forEach(v => total += v)
console.log(total)