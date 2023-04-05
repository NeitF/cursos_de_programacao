let cpf = '705.484.450-52'
cpf = cpf.split("-")

const nove_digitos = cpf[0].replace(/\./g, "")
let result = 0

//Primeiro dígito
const nove_digitos_array = Array.from(nove_digitos)
nove_digitos_array.push(calcularDigitos(nove_digitos_array, 10))

//Segundo dígito
nove_digitos_array.push(calcularDigitos(nove_digitos_array, 11))

// Esse replace vai remover qualquer caractere que não seja um número
cpf = cpf.join('').replace(/\D+/g, '')
const novo_cpf = nove_digitos_array.join('')
if(novo_cpf === cpf)
  console.log('CPF Válido!')
else
  console.log('CPF Inválido')


function calcularDigitos (nove_digitos_array, multiplicador) {
  const total = nove_digitos_array.reduce((acum, valor) => {
    let t = acum + (valor * multiplicador) 
    multiplicador--
    return t
}, 0)

  let result = 11 - (total % 11)
  if(result > 9)
    result = 0
  return result
}
