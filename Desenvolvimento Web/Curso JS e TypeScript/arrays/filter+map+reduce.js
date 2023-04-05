const numeros = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

const numeroPares = numeros
  .filter(v => v % 2 === 0)
  .map(v => v * 2)
  .reduce((acum, v) => acum + v)
console.log(numeroPares)