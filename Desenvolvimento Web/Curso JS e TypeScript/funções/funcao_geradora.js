function* geradora1() {
    yield 'Valor 1'
    yield 'Valor 2'
    yield 'Valor 3'
}

const g1 = geradora1()

console.log(g1)

// Na primeira vez, ele vai retornar o primeiro yield ('Valor 1')
console.log(g1.next().value)

// Ne segunda vez, ele vai retornar o segundo yield ('Valor 2')
console.log(g1.next().value)

// Ne terceira vez, ele vai retornar o terceiro yield ('Valor 3')
console.log(g1.next())

// Usando o laço for
// for(let valor of g1){
//     console.log(valor)
// }


// Gerador infinito
function* geradora2() {
  let i = 0

  while(true) {
    yield i
    i++
  }
}
const g2 = geradora2()
console.log(g2.next().value)
console.log(g2.next().value)
console.log(g2.next().value)
console.log(g2.next().value)
console.log(g2.next().value)
console.log(g2.next().value)
console.log(g2.next().value)


// Delegando para outra função
function* geradora3() {
    yield 0
    yield 1
    yield 2
}

function* geradora4() {
    yield* geradora3()
    yield 3
    yield 4
    yield 5
}

const g4 = geradora4()
for (let valor of g4) {
    console.log(valor)
}

// Ultimo exemplo
function* geradora5() {
    yield function() {
        console.log('Vim do y1')
    }

    yield function() {
        console.log('Vim do y2')
    }
}

const g5 = geradora5()
console.log('------ G5 ------')
const func1 = g5.next().value
const func2 = g5.next().value

func1()
func2()