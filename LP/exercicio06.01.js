peso = 180.8
altura = 1.85
obesidade = ""

imc = peso / (altura**2)
console.log("Altura = " + altura + "m")
console.log("Peso = " + peso + " kg")
console.log("IMC = " + imc) //"m/kg²" essa seria a unidade do IMC

if (imc < 18.5) {
    console.log("Magreza")
    obesidade = 0
} else if (imc >= 18.50 && imc < 24.99){
    console.log("Normal")
    obesidade = 0
} else if (imc >= 25.00 && imc < 29.99){
    console.log("Sobrepeso")
    obesidade = 1
} else if (imc >= 29.99 && imc < 39.99){
    console.log("Obesidade")
    obesidade = 2
} else if (imc >=40.00) {
    console.log("Obesidade grave")
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