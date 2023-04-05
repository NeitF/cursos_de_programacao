// Criando um atributo "privado" - Eu terei que criar um dado do tipo 'Symbol'. O Symbol vai gerar um id aleatório,
// e a cada vez que eu chamar ele, ele vai ser aletório, nunca se repetindo
const _velocidade = Symbol()

class Carro {
  constructor(nome){
    this.nome = nome
    //velocidade é um atributo privado
    this[_velocidade] = 0
  }

  set velocidade(valor) {
    if(typeof valor !== 'number') return
    if(valor >= 100 || valor <= 0) return
    this[_velocidade] = valor
  }

  get velocidade() {
    return this[_velocidade]
  }

  acelerar() {
    if(this[_velocidade] >= 100) return
    this[_velocidade]++
  }

  freiar() {
    if(this[_velocidade] <= 0) return
    this[_velocidade]--
  }
}

const c1 = new Carro('Fusca')

for(let i = 0; i<= 200; i++){
  c1.acelerar()
}

c1.velocidade = 20
c1.velocidade = 1000
console.log(c1.velocidade)
