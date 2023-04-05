const paragrafos = document.querySelector('.paragrafos')

/*
Dentro da div "paragrafos" existem 4 elementos "<p>". O "documento.querySelector" permite o
retorno de apenas 1 elemento, mas vamos supor que eu queira selecionar todos os elementos "<p>"
dentro da div, ou seja, ter uma coleção de elementos. Uma forma de fazer isso é:
*/ 
const ps = paragrafos.querySelectorAll('p')

//Se eu fizer o querySelector normal, ele vai retornar apenas a primeira ocorrência de "<p>" que
//ele encontrar

console.log(ps)
console.log(ps.length)

for(let p of ps){
    console.log(p.textContent)
}

// ps[0].innerHTML = 'Primeiro parágrafo'
// ps[1].innerHTML = 'Segundo parágrafo'
// ps[2].innerHTML = 'Terceiro parágrafo'
// ps[3].innerHTML = 'Quarto parágrafo'


//Obj: pegar a cor de fundo do body e aplicar no texto
const estilosBody = getComputedStyle(document.body)
const backgroundColorBody = estilosBody.backgroundColor

for(let p of ps){
    p.style.color = backgroundColorBody
}