const objA = {
    chaveA: 'A'
    // O objeto tem um prototype implícito
    //__proto__: Object.prototype
}

const objB = {
    chaveB: 'B'
}

// fazer objB herdar de objA
Object.setPrototypeOf(objB, objA)
console.log(objB.chaveA)

// -------------------------------------
function Produto(nome, preco) {
  this.nome = nome
  this.preco = preco
}

Produto.prototype.desconto = function(percentual) {
  this.preco = this.preco - (this.preco * (percentual / 100))
}

const p1 = new Produto('Camiseta', 100)
p1.desconto(50)
console.log(p1)

// p2 é um objeto literal, e não uma função construtora. Logo, não será considerado um obj do tipo
// 'Produto' e não será capaz de usar a função 'desconto' do prototype. Para resolver isso, farei com
// que ele aponte para o prototype de 'Produto', herdando assim a função
const p2 = {
    nome: 'Caneca',
    preco: 15
}

Object.setPrototypeOf(p2, Produto.prototype)
p2.desconto(2)
console.log(p2)

// Mais um forma de criar um objeto
// O primeiro parâmetro é o prototype. Se eu definir como 'Object.prototype', ele criará um objeto que não
// herda de nenhuma outra "classe"
const p3 = Object.create(Produto.prototype, {
    tamanho: {
        writable: true,
        configurable: true,
        value: 43,
        enumerable: true
    },
    tamanho2: {
        enumerable: true,
        writable: true,
        configurable: true,
        value: 59
    },
    preco: {
        enumerable: true,
        value: 22,
        writable: true
    }
})

p3.desconto(50)
console.log(p3)