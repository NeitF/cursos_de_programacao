function Pessoa (nome, sobrenome) {
  // Variável privada
  const ID = 123456

  // método privado
  const metodoInterno = function () {
    console.log('método interno')
  }

  this.nome = nome
  this.sobrenome = sobrenome

  this.metodo = function () {
    console.log(this.nome + ': sou um método')
  }

  this.outroMetodo = function () {
    metodoInterno()
    console.log(ID)
  }
}

const p1 = new Pessoa('Luiz', 'Otávio')
const p2 = new Pessoa('Maria', 'Oliveira')

p1.metodo()
p2.metodo()
