class Pessoa {
  constructor(nome, sobrenome){
    this.nome = nome
    this.sobrenome = sobrenome
  }

  falar() {
    console.log(`${this.nome} está falando`)
}

beber() {
    console.log(`${this.nome} está bebendo`)
}

comer() {
      console.log(`${this.nome} está comendo`)
  }

  // O legal das classes, é que aqui não existe aquela complexidade de criar um prototype, atrelar
  // um método ao prototype, etc. Aqui isso é feito de forma automática. Se eu dar um console.log de
  // um objeto 'Pessoa' no navegador e abri seu prototype, eu vou reparar que ele já conterá todos os 
  // métodos que eu criei
}

const p1 = new Pessoa('Luiz', 'Miranda')
console.log(p1)
p1.falar()
p1.comer()
p1.beber()



// ----- Comparando com função construtora -----
function Pessoa2(nome, sobrenome) {
  this.nome = nome
  this.sobrenome = sobrenome
}

Pessoa2.prototype.falar = function() {
  console.log(`${this.nome} está falando`)
}

const p2 = new Pessoa2('Nathan', 'Silva')
p2.falar()