nota1 = 9.5
nota2 = 8.9

media = (nota1 + nota2)/2
console.log("Primeira forma de apresentação")
console.log("Média de " + media.toFixed(1))
if (media >= 7.0) {
    console.log("Aluno aprovado")
    console.log("Parabéns")
} else {
    console.log("Aluno reprovado")
    console.log("Até o próximo ano letivo.")
}
//mundaod a forma de apresentar, aumentando as especificações
console.log("Segunda opção de apresentação")
console.log("Média de " + media.toFixed(1))
if (media < 4.0){
    console.log("Aluno reprovado")
    console.log("Sem direito a exame")
} else if (media >= 4.0 && media < 7.0){
    console.log("Aluno reprovado")
    console.log("Aluno em Exame")
} else if (media >=6.0 && media <8.0){
    console.log("Aluno aprovado")
    console.log("Excelente Desempenho")
} else if (media >= 8.0 && media < 9.2){
    console.log("Aprovado com Exito")
    console.log("Dempenho Exemplar")
} else if (media >= 9.2) {
    console.log("Aprovado com honras")
    console.log("Mestre Jedi")
}
//Terceira versão
conceito = ""
console.log("Terceira forma de apresentação")
console.log("Media de " + media )
if (media < 4.0) {
    conceito = "E"
} else if (media >=4.0 && media < 7.0){
    conceito = "D"
} else if (media >= 7 && media <8.2) {
    conceito = "C"
} else if (media >= 8.2 && media <9.2){
    conceito = "B"
} else if (media >= 9.2){
    conceito = "A"
}
console.log(conceito)

switch (conceito) {
    case "E":
        console.log("Insuficiente")
        break
    case "D":
        console.log("Em Exame Final")
        break
    case "C":
        console.log("Teu esforço rendeu")
        break
    case "B":
        break
        console.log("Teus esforços foram recompensados")
    case "A": 
        console.log("Mestre Jedi")
        break
}