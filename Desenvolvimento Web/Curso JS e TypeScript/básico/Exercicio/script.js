function meuEscopo(){
    //No query selector nós selecionamos os elementos como a gente selecionaria classes ou id's css,
    //ou qualquer outro seletor.
    //Selecionar pelo nome da tag -> 'form'
    //Selecionar pelo nome da class -> '.formulario'
    //Selecionar pelo id -> '#nomeDoID'
    const formu = document.querySelector('.formulario')
    const result = document.querySelector('.resultado')

    const pessoas = []
    
    //Quando o form sofrer um evento de submit, a função será executada. 
    //O parâmetro dessa função receberá automaticamente o evento
    // form.onsubmit = function(evento){
    //     //Impede que a página seja atualizada ao fazer submit no form
    //     evento.preventDefault()
    //     document.write(document.querySelector('.nome').value)
    // }

    //O código abaixo funcionará da mesma forma que o código acima, porém ele é mais 'moderno'
    //Adiciona um escutador de eventos no formulário. O primeiro parâmetro é o evento que eu quero
    //escutar, e o segundo parâmetro é a função que eu vou executar ao escutar o evento.
    //Lembrando que ao chamar a função 'recebeEventoForm', o evento está automaticamente
    //sendo passado como parâmetro para essa função
    formu.addEventListener('submit', recebeEventoForm)

    function recebeEventoForm(evento){
        //Impede que a página seja atualizada ao fazer submit no form
        evento.preventDefault()
        const nome = formu.querySelector('.nome')
        const sobrenome = formu.querySelector('.sobrenome')
        const peso = formu.querySelector('.peso')
        const altura = formu.querySelector('.altura')
        pessoas.push({
            nome: nome.value,
            sobrenome: sobrenome.value,
            peso: peso.value,
            altura: altura.value
        })
        console.log(pessoas)

        result.innerHTML += `<p>Nome: ${nome.value}, Sobrenome: ${sobrenome.value} Peso: ${peso.value}, 
        Altura: ${altura.value}</p>`
    }
}

meuEscopo()