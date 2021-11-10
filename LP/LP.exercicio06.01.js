peso = 83.8
altura = 1.84
obesidade = ""

imc = peso / (altura**2)
console.log("Altura = " + altura + "m")
console.log("Peso = " + peso + " kg")
console.log("IMC = " + imc) //"m/kg²" essa seria a unidade do IMC

if (imc < 18.5) {
    console.log("Magreza - Grau de Obesidade 0")
    obesidade = 0
} else if (imc >= 18.50 && imc < 24.99){
    console.log("Normal - Grau de Obesidade 0")
    obesidade = 0
} else if (imc >= 25.00 && imc < 29.99){
    console.log("Sobrepeso - Grau de Obesidade 1")
    obesidade = 1
} else if (imc >= 29.99 && imc < 39.99){
    console.log("Obesidade - Grau de Obesidade 2")
    obesidade = 2
} else if (imc >=40.00) {
    console.log("Obesidade grave - Grau de Obesidade 3")
    obesidade = 3
}

if (obesidade != 0){
    console.log("Cuidado! Você está acima do peso recomendado pela OMS!")
}

switch (obesidade){
    case 3:
        console.log("É importante procurar um médico para ajudar na sua saúde.") 
        break
}