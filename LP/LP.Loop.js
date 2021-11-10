var i = 1 //variável de controle
console.log("Loops com While")
while (i <=5){
    console.log(i)
    i = i +1
}
console.log("Segundo Método")
i = 1
while (i<= 6){
    console.log(i)
    i++
}
console.log("Terceiro Método")
i = 1
while (i<=7){
    console.log(i++)
}
i = 1
console.log("Loops com Do...While")
do {
    console.log(i++)
} while(i <= 10)

console.log("Loops com For")
for (i = 1; i <=7; i++){
    console.log(i)
}

console.log("Array das Notas dos Alunos")

alunos = ["Walescko", "WadaJu", "Juliana", "JudoWa", "Roberval", "Laura Pausini"]
notas = [[5.6,7.2],[9.0,8.5],[5.8,4.6],[4.5,8.5],[5.7,8.9],[10.0, 6.5]]

for (i = 0; i < alunos.length; i++){
alunoSelecionado = i
nomeDoAluno = alunos[alunoSelecionado]
notasDoAluno = notas[alunoSelecionado]
nota1 = notasDoAluno[0]
nota2 = notasDoAluno[1]
media = (nota1+nota2)/2
console.log(nomeDoAluno)
console.log("A primeira nota foi: " + nota1)
console.log("A segunda nota foi : " + nota2)
console.log(nomeDoAluno + " Teve Média: " + media.toFixed(1))
console.log("")}