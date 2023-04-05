const elementos = [
    {tag: 'p', texto: 'Frase 1'},
    {tag: 'div', texto: 'Frase 2'},
    {tag: 'footer', texto: 'Frase 3'},
    {tag: 'section', texto: 'Frase 4'},
]

const result = document.querySelector('#resultado')
let tag, texto, elemento

for(let i=0;i<elementos.length;i++){
    tag = elementos[i].tag
    texto = elementos[i].texto
    elemento = document.createElement(tag)
    result.appendChild(elemento)
    elemento.innerHTML = texto
}