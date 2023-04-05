// Closure - A habilidade da função de acessar seu escopo léxico
function retornaFuncao (nome) {
  return function () {
    return nome
  }
}

const funcao = retornaFuncao('Luiz')
const funcao2 = retornaFuncao('João')
// Para o 'console.dir' funcionar como o esperado, é necessário rodar o script no navegador
console.dir(funcao)
console.dir(funcao2)
