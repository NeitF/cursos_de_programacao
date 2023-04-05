const formulario = document.querySelector('#formulario')
const resultado = document.querySelector('.resultado')

formulario.addEventListener('submit', calcular)

function calcular(evento){
    evento.preventDefault()
    //formula => imc = peso / altura * altura
    let peso = document.querySelector('#peso').value
    let altura = document.querySelector('#altura').value

    if(isNaN(peso) || peso == ''){
        resultado.style.background = '#FF4F4F'
        resultado.innerHTML = 'Peso inválido'
    }else if(isNaN(altura) || altura == ''){
        resultado.style.background = '#FF4F4F'
        resultado.innerHTML = 'Altura inválida'
    }else{
        let imc = peso / altura ** 2
        imc = imc.toFixed(2)
        let resultFinal = `Seu IMC é ${imc}`
        resultado.style.background = 'green'
        if(imc < 18.5)
            resultFinal += `(Abaixo do peso)`
        else if(imc >= 18.5 && imc <= 24.9)
            resultFinal += `(Peso normal)`
        else if(imc >= 25 && imc <= 29.9)
            resultFinal += `(Sobrepeso)`
        else if(imc >= 30 && imc <= 34.9)
            resultFinal += `(Obesidade grau 1)`
        else if(imc >= 35 && imc <= 39.9)
            resultFinal += `(Obesidade grau 2)`
        else
            resultFinal += `(Obesidade grau 3)`
        
        resultado.innerHTML = resultFinal
        console.log(resultFinal)
    }
}