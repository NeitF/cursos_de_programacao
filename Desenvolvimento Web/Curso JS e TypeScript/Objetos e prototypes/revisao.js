const pessoa = {
    nome: 'Luiz',
    idade: 25
}

// Acessando atributos - Forma #1
console.log(pessoa.nome)
// Acessando atributos - Forma #2
const chave = 'idade'
console.log(pessoa['nome'])
console.log(pessoa[chave])

// outra forma de criar um obj
const pessoa1 = new Object()
pessoa1.nome = 'Luiz'
pessoa1.sobrenome = 'Souza'
pessoa1.falarNome = function(){
    console.log(`${this.nome}`)
}

// Apagar um atributo do obj
delete pessoa1.nome
console.log(pessoa1)

