function Produto(nome, preco, estoque) {
    this.nome = nome
    this.preco = preco

    Object.defineProperty(this, 'estoque', {
      enumerable: true,
      configurable: true,
      // Vai apenas pegar o valor de 'estoque' e retorná-lo
      get: function(){
        return estoque
      },
      // Vai modificar o valor de estoque
      set: function(valor){
        estoque = valor
      }
    })
}

const p1 = new Produto('Camiseta', 20, 3)
console.log(p1)
console.log(p1.estoque)

// Como eu tenho um 'set' definido para esse atributo, essa nova atribuição que estou fazendo vai 
// automaticamente ser passada como parâmetro para a função 'set'
p1.estoque = 7
console.log(p1.estoque)
