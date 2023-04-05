/*
Javascript é baseado em protótipos para passar propriedades e métodos de um objeto para outro.

Definição de protótipo
Protótipo é o termo usado para se referir ao que foi criado pela primeira vez, servindo de modelo
ou molde para futuras produções

Todos os objetos tem um referência interna para um protótipo (__proto__) que vem da propriedade
prototype da função construtora que foi usada para criá-lo. Quando tentamos acessar um membro de um objeto,
primeiro o motor do JS vai tentar encontrar este membro no próprio objeto e depois a cadeia de protótipo é
usada até o topo (null) até encontrar (ou não) tal membro
*/

function Pessoa(nome, sobrenome) {
  this.nome = nome
  this.sobrenome = sobrenome
}

// Vamos supor que eu irei criar um método que irá fazer a mesma coisa para todos os objetos. Ao invés
// de criá-lo de declaração da minha função construtora, e fazer com qua a cada nova instanciação o objeto
// tenha esse método, eu posso criar um prototype de 'Pessoa' que contém esse método. Assim, todo os objetos
// do tipo 'Pessoa' que eu criar irão ter esse método. (Isso me lembra método estático em Java). Usar protoype 
// melhora a performance do programa, pois agora cada pessoa que eu instanciar não vai criar um método nomeCompleto(),
// elas vão simplesmente usar a referência do pai delas, que é o protótipo
// Instance method will be available to all instances but only load once in memory 
Pessoa.prototype.nomeCompleto = function() {
  return this.nome + ' ' + this.sobrenome
}

const pessoa1 = new Pessoa('Luiz', 'O')  // <- Pessoa = função construtora
const pessoa2 = new Pessoa('Nathan', 'F')  // <- Pessoa = função construtora

console.log(pessoa1.nomeCompleto())
console.log(pessoa2.nomeCompleto())


// Pessoa.prototype === pessoa1.__proto__
