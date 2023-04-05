//  Pega a data atual
const data = new Date()
console.log(data.toString())

//  Quando passo o parâmetro 0, a data será 31/12/1969 (época do unix)
const data2 = new Date(0)
console.log(data2.toString())

//  Constante com 3 horas em milésimos de segundo
//  60 segundos * 60 segundos dá 1 hora. Multiplicado por 3 dá 3 horas (em segundos), só que em
//  javascript são milisegundo, então vezes 1000
const tresHoras = 60 * 60 * 3 * 1000
const data3 = new Date(0 + tresHoras)
console.log(data3.toString())

//  Ordem dos parâmetros: Ano, mês (janeiro é o número 0), dia, hora, minuto, segundo
const data4 = new Date(2019, 3, 15, 14, 27)
console.log(data4.toString())

const data5 = new Date('2019-04-20 20:59')
console.log(data5.toString())

const data6 = new Date()
console.log('Dia ', data6.getDate())
console.log('Mês ', data6.getMonth())
console.log('Ano ', data6.getFullYear())
console.log('Hora ', data6.getHours())
console.log('Min ', data6.getMinutes())
console.log('Seg ', data6.getSeconds())
console.log('Dia na semana ', data6.getDay()) // 0 => Domingo, 6 => Sábado

//  Obter hora atual em milésimos de segundo (do marco 0 até hoje)
console.log('Hora atual: ', Date.now())
