array1 = []

array1[0] = "Walescko"
array1[1] = "Chimendes"
array1[2] = "WadaJu"
array1[4] = "Juca"
 
console.log(array1.length)
console.log(array1)
console.log(array1[3]) //vai dar  empty slot no execução

array2 =[]

array2[0] = ["Walescko", "JudoWa", "Juliana", "WadaJu"]
array2[1] = [1,2,3,6]
console.log(array2)

alunos = ["Walescko", "WadaJu", "Juliana", "JudoWa"]
notas = [[5.6,7.2],[9.0,8.5],[5.8,4.6],[4.5,8.5]]
console.log("Primeira Apresentação")
console.log(alunos)
console.log(notas)
console.log("Segunda apresentação com aluno selecionado")
alunoSelecionado = 0
nomeDoAluno = alunos[alunoSelecionado]
notasDoAluno = notas[alunoSelecionado]

console.log(nomeDoAluno)
console.log(notasDoAluno)

console.log("Terceira Apresentação - aluno selecionado e notas separadas")
alunoSelecionado = 1
nomeDoAluno = alunos[alunoSelecionado]
notasDoAluno = notas[alunoSelecionado]

nota1 = notasDoAluno[0]
nota2 = notasDoAluno[1]
media = (nota1+nota2)/2
console.log(nomeDoAluno)
console.log("A primeira nota foi: " + nota1)
console.log("A segunda nota foi : " + nota2)
console.log(nomeDoAluno + " Teve Média: " + media.toFixed(1))