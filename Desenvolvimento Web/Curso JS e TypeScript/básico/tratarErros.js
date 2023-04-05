
function soma(x, y){
    if(typeof x !== 'number' || typeof y !== 'number'){
        //Aqui eu estou lançando a minha própria exceção
        throw new Error('x e y precisam ser números')
    }

    return x + y
}

try{
    console.log(soma(1, 2))
    console.log(soma(1, '2'))
}catch(error){
    console.log('erro')
}