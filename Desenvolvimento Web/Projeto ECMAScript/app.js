class Despesa {
    constructor(ano, mes, dia, tipo, descricao, valor){
        this.ano = ano
        this.mes = mes
        this.dia = dia
        this.tipo = tipo
        this.descricao = descricao
        this.valor = valor
    }

    validarDados(){
        //'i' retorna pra nós os índices de um determinado array ou os atributos de um determinado
        //objeto. Ele não retorna o valor especificamente
        for(let i in this){
            if(this[i] == undefined || this[i] == '' || this[i] == null){
                return false
            }
        }

        return true 
    }
}

class Bd{
    
    constructor(){
        let id = localStorage.getItem('id')

        if(id === null){
            localStorage.setItem('id', 0)
        }
    }

    getProximoId(){
        let proximoId = localStorage.getItem('id')
        return parseInt(proximoId) + 1
    }

    gravar(d){
        //Função de local storage. Essa instrução retorna um objeto de manipulação do local storage do browser,
        //e assim temos acesso a alguns métodos.
        //O primeiro parâmetro é a identificação do objeto que vamos armazenar (um nome, a chave), e o segundo é o dado 
        //que queremos armazenar, sendo que esse dado precisa ser encaminhado através de uma notação JSON.
        //Como estamos trabalhando com um objeto literal, precisamos convertê-lo para uma notação JSON.
        //Para fazer essa converção, utilizamos um objeto nativo do JS que é justamento o objeto JSON,
        //e a partir dele podemos executar a função 'stringify()' passando por parâmetro o objeto literal que queremos
        //converter para uma notação JSON.

        // localStorage.setItem('despesa', JSON.stringify(d))
    
        //Mas há um "problema" com o 'setItem', se eu tentar cadastrar um segundo item, o objeto associado a chave no 
        //local storage será atualizado, as informações serão atualizadas, mas o correto seria de fato inserir
        //um novo objeto, e não atualizar o antigo. Na função 'setItem', sempre que a despesa for inserida nessa
        //chave ('despesa') ela irá sobrepor a já existente. Para evitar isso, vamos precisar de um índice dinâmico.
        //OBS: Criei um observação na aula, chamada 'IMPORTANTE - CRIAÇÃO DE ÍNDICE DINÂMICO'. Tem toda a explicação
        //lá
        let id = this.getProximoId()
        localStorage.setItem(id, JSON.stringify(d))
        localStorage.setItem('id', id)
    }

    recupeparTodosRegistros(){

        //array de despesas
        let despesasArray = Array()


        let id = localStorage.getItem('id')
        
        //Recuperar todas as despesas cadastradas em localStorage
        for(let i=1;i<=id;i++){
            //Recuperar a despesa e converter a string JSON para um objeto literal
            let despesa = JSON.parse(localStorage.getItem(i)) 

            //Verificar se existe a possibilidade de haver índices que foram pulados/removidos 
            //Nestes casos, nós vamos pular esses índices
            if(despesa === null){
                continue
            }else{
                despesa.id = i
                despesasArray.push(despesa)
            }
        }

        return despesasArray
    }

    pesquisar(despesa){
        let despesasFiltradas = Array()
        despesasFiltradas = this.recupeparTodosRegistros()

        //ano
        if(despesa.ano != ''){
            despesasFiltradas = despesasFiltradas.filter(d => d.ano == despesa.ano)
        }
        //mes
        if(despesa.mes != ''){
            despesasFiltradas = despesasFiltradas.filter(d => d.mes == despesa.mes)
        }
        //dia
        if(despesa.dia != ''){
            despesasFiltradas = despesasFiltradas.filter(d => d.dia == despesa.dia)
        }
        //tipo
        if(despesa.tipo != ''){
            despesasFiltradas = despesasFiltradas.filter(d => d.tipo == despesa.tipo)
        }
        //descricao
        if(despesa.descricao != ''){
            despesasFiltradas = despesasFiltradas.filter(d => d.descricao == despesa.descricao)
        }
        //valor
        if(despesa.valor != ''){
            despesasFiltradas = despesasFiltradas.filter(d => d.valor == despesa.valor)
        }

        return despesasFiltradas
    }

    remover(id){
        localStorage.removeItem(id)
    }

}

let bd = new Bd()

function cadastrarDespesa(){
    
    let ano = document.getElementById('ano')
    let mes = document.getElementById('mes')
    let dia = document.getElementById('dia')
    let tipo = document.getElementById('tipo')
    let descricao = document.getElementById('descricao')
    let valor = document.getElementById('valor')

    let despesa = new Despesa(ano.value, mes.value, dia.value, tipo.value, descricao.value, valor.value)

    if(despesa.validarDados()){
        bd.gravar(despesa)
        //dialog de sucesso
        console.log('Dados válidos')
        document.getElementById('tituloModal').innerHTML = '<h2>Registro inserido com sucesso</h2>'
        document.getElementById('tituloModal').className = 'text-success'
        document.getElementById('corpoModal').innerText = 'Despesa foi cadastrada com sucesso'
        document.getElementById('botaoModal').innerText = 'Voltar'
        document.getElementById('botaoModal').className = 'btn btn-primary btn-success'
        $('#modalRegistroDespesa').modal('show')

        ano.value = ""
        mes.value = ""
        dia.value = ""
        tipo.value = "" 
        descricao.value = ""
        valor.value = ""
    }else{
        console.log('Dados inválidos')
        document.getElementById('tituloModal').innerHTML = '<h2>Erro na gravação</h2>'
        document.getElementById('tituloModal').className = 'text-danger'
        document.getElementById('corpoModal').innerText = 'Existem campos obrigatórios que não foram preenchidos'
        document.getElementById('botaoModal').innerText = 'Voltar e corrigir'
        document.getElementById('botaoModal').className = 'btn btn-primary btn-danger'
        $('#modalRegistroDespesa').modal('show')
    }
}

function carregaListaDespesas(despesas = Array(), filtro = false){
    if(despesas.length == 0 && filtro == false){
        despesas = bd.recupeparTodosRegistros()
    }

    //Recebe a referência do elemento 'listaDespesas'
    //Selecionando o elemento tbody da tabela
    var listaDespesas = document.getElementById('listaDespesas')

    //Limpar o conteúdo da lista
    listaDespesas.innerHTML = ''

    //percorrer o array despesas, listando cada despesa de forma dinâmica
    despesas.forEach(function(d) {
        

        //criando a linha (tr)
        //O método 'insertRow()' é um método que faz parte do elemento tbody, que possibilita a 
        //inserção de linhas. A quantidade de linhas criadas será de acordo com a quantidade de elementos
        //dentro do array 'despesas' (No caso, a cada repetição desse laço forEach, uma nova linha será criada)

        //Vai receber a referência da linha criada  (Basicemnte está criando uma 'tr' no HTML)
        let linha = listaDespesas.insertRow()

        //criar as colunas (td)
        //O método 'insertCell' espera um parâmetro para o número de colunas que serão criadas (basicamente está
        //inseindo uma 'tr' no código HTML)
        //No caso dessa aplicação, eu sei que serão criadas 4 colunas: Data, Tipo, Descrição e Valor.
        //Primeiro informo em qual coluna vai começar, e depois em qual vai terminar. A primeira coluna
        //começa em 0, portanto se eu quero 4 colunas, elas terão que ir de 0 até 3
        linha.insertCell(0).innerHTML = `${d.dia}/${d.mes}/${d.ano}`
       
        //Ajustar o tipo
        switch(parseInt(d.tipo)){
            case 1: 
                d.tipo = 'Alimentação'
                break
            case 2:
                d.tipo = 'Educação'
                break
            case 3:
                d.tipo = 'Lazer'
                break
            case 4:
                d.tipo = 'Saúde'
                break
            case 5:
                d.tipo = 'Transporte'
                break
        }

        linha.insertCell(1).innerHTML = d.tipo
        linha.insertCell(2).innerHTML = d.descricao
        linha.insertCell(3).innerHTML = d.valor

        //Criando o botão de exclusão
        let btn = document.createElement("button")
        btn.className = 'btn btn-danger'
        btn.innerHTML = '<i class="fas fa-times">'
        btn.id = `id_despesa_${d.id}`
        btn.onclick = function(){
            //recuperar o id do próprio elemento HTML clicado
            id = this.id
            id = id.replace('id_despesa_', '')
            bd.remover(id)
            window.location.reload()
        }
        linha.insertCell(4).append(btn)

        //IMPORTANTE: esses métodos fazem alterações na estrutura HTML durante a execução da página.
        //Para visualizar isso acontecendo, basta abrir o console na aba de 'elements', ir até a tag
        //'tbody', e ver que as 'tr' e 'td' estão sendo adicionadas dinamicamente ao código
    })
}

function pesquisarDespesa(){
    let ano = document.getElementById('ano').value
    let mes = document.getElementById('mes').value
    let dia = document.getElementById('dia').value
    let tipo = document.getElementById('tipo').value
    let descricao = document.getElementById('descricao').value
    let valor = document.getElementById('valor').value

    let despesa = new Despesa(ano, mes, dia, tipo, descricao, valor)

    let despesas = bd.pesquisar(despesa)

    carregaListaDespesas(despesas, true)
}

