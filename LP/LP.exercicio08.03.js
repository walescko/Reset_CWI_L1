nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

/*for (i=0; i < nomesComuns.length; i++){
nomeExibir = nomesComuns[i]
console.log(nomeExibir)
}*/
nomeProcurado = "Samuel"
console.log("O nome a ser procurado é: " + nomeProcurado) 
nomeEncontrado = " "
for (i = 0; i < nomesComuns.length; i++){
    if (nomesComuns[i]==nomeProcurado){
        nomeEncontrado = nomesComuns[i]
        break
    } 
}
if (nomeEncontrado != " "){
    console.log("O nome " +nomeProcurado + " foi encontrado")
    console.log("Nome Comum! :P")
}   else {
    console.log("Nome Diferentão hein!? " +nomeProcurado +"!")
}
