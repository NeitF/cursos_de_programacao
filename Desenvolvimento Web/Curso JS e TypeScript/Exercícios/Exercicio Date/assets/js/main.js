let buscarDiaDaSemana = diaDaSemana => {
    switch(diaDaSemana){
        case 0:
            diaDaSemana = 'domingo'
            return diaDaSemana
        case 1:
            diaDaSemana = 'segunda-feira'
            return diaDaSemana
        case 2:
            diaDaSemana = 'terça-feira'
            return diaDaSemana
        case 3:
            diaDaSemana = 'quarta-feira'
            return diaDaSemana
        case 4:
            diaDaSemana = 'quinta-feira'
            return diaDaSemana
        case 5:
            diaDaSemana = 'sexta-feira'
            return diaDaSemana
        case 6:
            diaDaSemana = 'sábado'
            return diaDaSemana
    }
}

let buscarMes = mes => {
    switch(mes){
        case 0:
            mes = 'janeiro'
            return mes
        case 1:
            mes = 'feveriro'
            return mes
        case 2:
            mes = 'março'
            return mes
        case 3:
            mes = 'abril'
            return mes
        case 4:
            mes = 'maio'
            return mes
        case 5:
            mes = 'junho'
            return mes
        case 6:
            mes = 'julho'
            return mes
        case 7:
            mes = 'agosto'
            return mes
        case 8:
            mes = 'setembro'
            return mes
        case 9:
            mes = 'outubro'
            return mes
        case 10:
            mes = 'novembro'
            return mes
        case 11:
            mes = 'dezembro'
            return mes
    }
}


const horario = document.querySelector('h1')
const data = new Date()
const dia = data.getDate()
const ano = data.getFullYear()
const hora = data.getHours()
const minutos = data.getMinutes()
const mes = buscarMes(data.getMonth())
let diaDaSemana = buscarDiaDaSemana(data.getDay())


horario.innerHTML = `${diaDaSemana}, ${dia} de ${mes} de ${ano} <br> ${hora}:${minutos}`