// Funções imediatas são funções que são chamadas logo após a sua criação
(function () {
  console.log('Olá')
})()

(function (idade, peso, altura) {
  const sobrenome = 'miranda'
  function criaNome (nome) {
    return nome + ' ' + sobrenome
  }

  function falaNome () {
    console.log(criaNome('Luiz'))
  }

  falaNome()
  console.log(idade, peso, altura)
})(30, 80, 1.80)
