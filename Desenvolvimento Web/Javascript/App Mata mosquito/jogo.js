//----- 1º passo: definir as dimensões do palco do jogo -----

var altura = 0
var largura = 0
var vidas = 1
var tempo = 15

var criaMosquitoTempo = 1500

//Recuperando o parâmetro de nível que foi passado pela página Index
//O 'search' vai recuperar o ponto de interregoção e tudo oq vier depois dele na URL
var nivel = window.location.search
nivel = nivel.replace('?', '')

if(nivel === 'normal'){
    //1500
    criaMosquitoTempo = 1500
}else if(nivel === 'dificil'){
    //1000
    criaMosquitoTempo = 1000
}else if(nivel === 'chucknorris'){
    //750
    criaMosquitoTempo = 750
}

//É necessário que a altura e largura alterem toda vez que o usuário diminuir ou aumentar e tala do navegador.
//Para isso, criei a função a baixo, a criei o evento 'onresize' no body, para que essa função seja chamada
//toda vez que o tamanho da página for redimensionado. As variáveis 'altura' e 'largura' conterão, 
//respectivamente, o dimensionamento atual da página

function ajustaTamanhoPalcoJogo(){
    altura = window.innerHeight
    largura = window.innerWidth

    console.log(altura, largura)
}

ajustaTamanhoPalcoJogo()

var cronometro = setInterval(function(){
    tempo -= 1

    if(tempo < 0){
        clearInterval(cronometro)
        clearInterval(criaMosquito)
        window.location.href = 'vitoria.html'
    }else{ 
        //innerHTML - Valor entre as tags html
        document.getElementById('cronometro').innerHTML = tempo
    }
}, 1000)

//----- 2º passo: criando uma posição randômica -----

// É importante que a interpretação de uma página HTML segue uma sequencia gravitacional.
// No momento em que a página for lida, e a função 'appendChild' for chamada, a body ainda não
// terá sido criado, gerando assim um erro. Para evitar isso, inseri todo o código abaixo em
// um função que será chamada depois da criação do body

function posicaoRandomica(){
    //Remover o mosquito anterior (caso exista)
    //Nesse if, o javascript verifica se o elemento existe. Se ele retornar algo, então será
    //true, e ele entrará na condição. Também removerá os corações caso o usuário nao clique
    //no mosquito
    if(document.getElementById('mosquito')){
        document.getElementById('mosquito').remove()

        if(vidas>3){
            window.location.href = 'fim_de_jogo.html'
        }else{
            document.getElementById('v' + vidas).src = "imagens/coracao_vazio.png"
            vidas++
        }
    }

    //Em alguns casos, a barra de rolagem continuará sendo criada. Isso porque a imagem
    //possui uma determinada dimensão (nesse caso 50px). Quando posicionamos uma imagem, o eixo é
    //se encontra na parte esquerda superior, fazendo com que as vezes esse eixo se posicione muito
    //próximo ao limite de largura ou altura. Pelo fato de a imagem ter 50px, ela acaba ultrapassando
    //as dimensõesda tela. Para resolver isso, basta no momento da criação dos valores aleatórios, subtrair
    //uma quantidade razoável para posicionar as imagens sem que haja esse estouro.

    //Vai gerar uma valor aleatório de 0 até a largura
    var posicaoX = Math.floor(Math.random() * largura) - 90
    //Vai gerar uma valor aleatório de 0 até a altura
    var posicaoY = Math.floor(Math.random() * altura) - 90

    //Se os números gerados forem zero, haverá a subtração de 0 - 90, fazendo assim com que a imagem
    //saia da página. Para evitar isso, há o código de controle abaixo
    posicaoX = posicaoX < 0 ? 0 : posicaoX
    posicaoY = posicaoY < 0 ? 0 : posicaoY
    
    //criar elemento html
                                     //(tag HTML)
    var mosquito = document.createElement('img')
    
    //Aqui estou definindo o atributo src. Através do operador '.' eu posso acessar os atributos dos elementos
    //que eu criar em JS, e definir um valor para eles.
    mosquito.src = 'imagens/mosquito.png'
    mosquito.className = tamanhoAleatorio() + ' ' + ladoAleatorio()
    mosquito.style.left = posicaoX + 'px'
    mosquito.style.top = posicaoY + 'px'
    mosquito.style.position = 'absolute'
    mosquito.id = 'mosquito'

    //Função de onclick, responsável pela lógica que vai acontecer caso o jogador clique a tempo no
    //mosquito. Removerá o elemento quando clicado
    mosquito.onclick = function(){
        //Como a função está associada ao elemento HTML (mosquito.onclick), eu posso usar o 'this'
        this.remove()
    }
    
    //Incluir o elemento no body da página. Basicamente estou adicionando um filho pro body
    document.body.appendChild(mosquito)

    
}

//----- 3º passo: criando tamanhos randômicos para o mosquito -----

function tamanhoAleatorio(){
    //Vai gerar um número aleatório de 0 até muito próximo de 3
    var classe = Math.floor(Math.random() * 3)

    switch(classe){
        case 0:
            return 'mosquito1'        
        case 1:
            return 'mosquito2'
        case 2:
            return 'mosquito3'
    }
}

//----- 4º passo: fazendo o mosquito mudar de lado (olhar para a direita ou para a esquerda) -----
function ladoAleatorio(){
     //Vai gerar um número aleatório de 0 até muito próximo de 2
    var classe = Math.floor(Math.random() * 2)

    switch(classe){
        case 0:
            return 'ladoA'        
        case 1:
            return 'ladoB'
    }
}