/* Já vimos
Object.keys (retorna as chaves)
Object.values (retorna os valores)
Object.freeze (congela o objeto)
Object.defineProperties (define várias propriedades)
Object.defineProperty (define uma propriedade)
*/

// Copiando objeto com spread operator
const produto = {nome: 'Caneca', preco: 1.8}
const outroProduto = {...produto, material: 'porcelana'}

console.log(produto)
console.log(outroProduto)

// Copiando objeto com 'assign'
const outroProduto2 = Object.assign({}, produto, {tamanho: '45cm'})
console.log(outroProduto2)


// Obter descrição de uma propriedade/atributo
// Vou ver a descrição do atributo 'nome'
console.log(Object.getOwnPropertyDescriptor(produto, 'nome'))

// Object.entries - retorna um array com as chaves e valores do objeto
console.log(Object.entries(produto))
for(let entry of Object.entries(produto)){
    console.log('entry: ', entry)
}

// Usando destructuring
for(let [chave, valor] of Object.entries(produto)){
    console.log('entry: ', chave, valor)
}