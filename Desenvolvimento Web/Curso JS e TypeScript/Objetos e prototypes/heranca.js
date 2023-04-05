function Produto(nome, preco) {
    this.nome = nome
    this.preco = preco
}
Produto.prototype.aumento = function(quantia) {
    this.preco += quantia
}
Produto.prototype.desconto = function(quantia) {
    this.preco -= quantia
}


function Camiseta(nome, preco, cor){
  //Herdando atributos de 'Produto' e chamando o construtor da "classe super"
  Produto.call(this, nome, preco)
  this.cor = cor
}

// Herdar prototype / linkando os prototypes
Camiseta.prototype = Object.create(Produto.prototype)
// Resgatando o construtor
Camiseta.prototype.constructor = Camiseta


const camiseta = new Camiseta('Regada', 7.5, 'Preta')
camiseta.aumento(10)
console.log(camiseta)


// ----- Mini Desafio -----
// Objetivo: fazer o objeto 'Caneca' herdar de 'Produto'
function Caneca(nome, preco, material) {
    Produto.call(this, nome, preco)
    this.material = material
}

Caneca.prototype = Object.create(Produto.prototype)
Caneca.prototype.constructor = Caneca

const caneca = new Caneca('Caneco', 15, 'porcelana')
caneca.desconto(5)
console.log(caneca)