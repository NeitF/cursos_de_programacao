// #Object.defineProperty
function Produto(nome, preco, estoque) {
  this.nome = nome
  this.preco = preco
  
  // Ordem dos parâmetros:
  // O primeiro parâmetro vai ser o objeto que eu quero mexer. Nesse caso estou usando a palavra 'this', pois
  // assim ela está referenciando este objeto em que este comentário está sendo escrito. O segundo parâmetro é 
  // o nome da propriedade que eu quero trabalhar, nesse caso 'estoque'. O terceiro parâmetro é um 
  // 'property descriptor', que é um objeto.
  Object.defineProperty(this, 'estoque', {
    // Mostra a chave quando eu usar o forIn ou o object.keys
    enumerable: true,
    // Define o valor da propriedade/atributo (nesse caso, 'estoque' é o nome da variável passada por parâmetro)
    value: estoque,
    // Define se a propriedade pode ser alterado. Quando é 'false', ela tem o comportamento de uma constante
    writable: false,
    // Define se a propriedade pode ser reconfigurada (ou seja, se eu posso usar outro Object.defineProperty apontando
    // para essa mesma propriedade e alterar suas configurações). Quando está false, ele também não permite que 
    // o atributo seja deletado do objeto
    configurable: true
  })
}

const p1 = new Produto('Camiseta', 20, 3)
console.log(p1)

//Object.keys retorna um array com as chaves
console.log(Object.keys(p1))

// #Object.defineProperties
function Produto2(nome, preco, estoque){
  // O primeiro parâmetro vai ser o objeto que eu quero mexer
  Object.defineProperties(this, {
    nome: {enumerable: true, value: nome},
    preco: {enumerable: true, value: preco},
    estoque: {enumerable: true, value: estoque}
  })
}

const p2 = new Produto2('Celular', 2000, 10)
console.log(p2)