array = [1, 2, 3, 5, 8, 13, 21, 23]
soma = 0 
for (i = 0; i < array.length; i++){
    soma = soma + array[i]
}


media = (soma/(array.length)).toFixed(2)
console.log("A media da soma dos números")
for (i= 0; i < array.length; i++){
    console.log(array[i])
}
console.log("é ", media)

pares = []
somapar = 0 
console.log("Números pares até 100")
for (i = 0; i <=100; i++){
    resto = i % 2
    if (resto == 0){
        somapar = somapar + i
    }
}
console.log("A soma dos pares até 100 é: " +somapar)