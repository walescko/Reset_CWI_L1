timesDeFutebol = ["Grêmio", "São José", "Cruzeiro", "Aimoré", "Aquele da Beira-Rio"]
console.log("Comando For")
for ( i = 0; i < timesDeFutebol.length; i++){
    console.log("Time "+ (i+1) + " " + timesDeFutebol[i])
}
console.log("Comando While")
i = 0
while (i < timesDeFutebol.length){
    console.log("Time "+ (i+1) + " " + timesDeFutebol[i])
    i++
}
console.log("Comando Do...While")
i = 0
do{
console.log("Time "+ i+1 + " " + timesDeFutebol[i])
} while (i <= timesDeFutebol.length)
