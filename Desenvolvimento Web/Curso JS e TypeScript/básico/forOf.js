const nome = 'Nathan Fonseca'
const vetor = ['Nathan', 'Lucas']

//Iterando da forma tradicional
// for(let i=0;i<nome.length;i++){
//     console.log(nome[i])
// }

//Iterando com for in
// for(let i in nome){
//     console.log(nome[i])
// }

//Enquanto no 'for in' ele trás o índice, o 'for of' trás o valor, ou seja, a variável 'valor' abaixo, vai armazenar
//uma letra do nome a cada nova iteração
for(let valor of nome){
    console.log(valor)
}

for(let valor of vetor){
    console.log(valor)
}


//OBS: O 'for of' não funciona em objeto, pois eles não são iteráveis