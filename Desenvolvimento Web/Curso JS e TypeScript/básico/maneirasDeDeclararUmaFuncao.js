//  Declaração de função (Function Hoisting)
function falaOi () {
  console.log('Oi')
}
falaOi()

//  First-class objects
//  Function expression
const souUmDado = function(){
    console.log('Sou um dado')
}

//Arrow function
const funcaoArrow = () =>{
    console.log('Arrow')
}
funcaoArrow()

//Dentro do objeto
const obj = {
    falar: function(){
        console.log('Estou falando')
    }
}
obj.falar()