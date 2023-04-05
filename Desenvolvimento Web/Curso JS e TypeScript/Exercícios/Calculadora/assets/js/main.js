function criaCalculadora () {
  return {
    display: document.querySelector('.display'),
    inicia () {
      this.cliqueBotoes()
      this.pressionaEnter()
    },
    pressionaEnter () {
      this.display.addEventListener('keyup', e => {
        if (e.keyCode === 13) {
          this.realizaConta()
        }
      })
    },
    realizaConta () {
      let conta = this.display.value

      try {
        conta = eval(conta)
        if (!conta) {
          alert('Conta inválida')
          return
        }
        this.display.value = String(conta)
      } catch (e) {
        alert('Conta inválida')
      }
    },
    apagaUm () {
      this.display.value = this.display.value.slice(0, -1)
    },
    clearDisplay () {
      this.display.value = ''
    },
    btnParaDisplay (valor) {
      this.display.value += valor
    },
    cliqueBotoes () {
      document.addEventListener('click', function (e) {
        // 'e.target' vai retornar o elemento que foi clicado. No caso, vai retornar o botão que foi clicado
        const el = e.target
        if (el.classList.contains('btn-num')) {
          this.btnParaDisplay(el.innerText)
        }

        if (el.classList.contains('btn-clear')) {
          this.clearDisplay()
        }

        if (el.classList.contains('btn-del')) {
          this.apagaUm()
        }

        if (el.classList.contains('btn-eq')) {
          this.realizaConta()
        }
      }.bind(this))
      // Para que serve o 'bind'? O ideal é rever a observação feita na aula 'Praticando factory functions', mas
      // bascicamente é o seguinte: a função que estou passando como parâmetro em 'addEventListener', em determinado
      // momento (caso o seu 'if' retorne true), deverá chamar a função 'btnParaDisplay()'. Acontece que esta
      // é uma função ('btnParaDisplay()') que pertence ao mesmo objeto do qual 'cliqueBotoes'
      // (o 'addEventListener' está dentro dessa função) faz parte. Logo, eu preciso utilizar a palavrinha 'this'
      // para dizer ao JS que eu estou invocando uma função dentro do objeto no qual me encontro. Porém, como esse
      // chamada esta dentro da função parâmetro de addEventListener, ele vai entender que 'this' está fazendo
      // referência ao método 'addEventListener', e não ao meu objeto. O 'bind(this)' resolve esse problema,
      // dizendo à linguagem que na verdade eu quero apontar para o meu objeto. A arrow function tbm resolve esse
      // problema, e a explicação está em uma observação chamada 'arrow function com this'
    }
  }
}

const calculadora = criaCalculadora()
calculadora.inicia()
