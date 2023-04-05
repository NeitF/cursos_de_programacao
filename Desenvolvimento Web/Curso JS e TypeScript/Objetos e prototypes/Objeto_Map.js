const pessoas = [
  { id: 3, nome: 'Luiz'},
  { id: 2, nome: 'Maria'},
  { id: 1, nome: 'Helena'}
]

// const novasPessoas = {}
// for (const pessoa of pessoas) {
//   const { id } = pessoa
//   novasPessoas[id] = { ...pessoa }
// }

// console.log(pessoas)

const novasPessoas = new Map()
for (const pessoa of pessoas){
  const {id} = pessoa
  novasPessoas.set(id, {...pessoa})
}

console.log(novasPessoas)

//Obter pessoa 2
console.log(novasPessoas.get(2))

// Iterando sobre o Map
for (const [identifier, {id, nome}] of novasPessoas) {
  console.log(identifier, id, nome)
}

for (const chaves of novasPessoas.keys()) {
    console.log(chaves)
}

// Apagando a chave 2
novasPessoas.delete(2)
console.log(novasPessoas)