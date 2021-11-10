function imprimir(conteudo){
    console.log(conteudo)
}

/* Função que compara dois nomes */
function comparaNomes(nomeDoFulado,nomeDoBeltrano){
    return (nomeDoFulado == nomeDoBeltrano);   
}

nome1 = "Walescko"
nome2 = "Ju"
var nomesComparados = comparaNomes(nome1,nome2);
console.log(nomesComparados); //retorno da função comparaNomes

/*Função para checagem de maior idade*/
function maiorIdade(idade){
    return (idade >=18 );
}

var idadeInformada = maiorIdade(15)
console.log(idadeInformada)

/* Função Acréscimo de Juros */
function valorFinal(boleto,juros){
    acrescimo = juros/100 //converção da taxa de juro para decimal
    return boleto*(1+acrescimo) //retorno do valor corrigido
}

var valorAPagar = valorFinal(1000,10)
console.log("O valor a pagar corrigido é R$ " + valorAPagar)

/*Função Média Aritimética
Essa função realiza a soma determinado números de números
e realiza a média entre eles*/
function mediaAritmetica(vetor){ //Definição da função media
     var soma = 0
    for (i = 0; i < item.length; i++){//loop para fazer a soma dos elementos do array
        soma += vetor[i]
        }
        return soma / item.length //retorno da media dos números do array
}
item = [3,5,7,8,10,12]//entrada dos elementos do vetor
var media = (mediaAritmetica(item)).toFixed(2)
console.log(media) 

/* Função da Margem Bruta de Lucro de uma empresa */
function margemBruta(compras,arrecadacao){
    lucroBruto = arrecadacao - compras
    console.log("Arrecadação Mensal R$ " + arrecadacao)
    console.log("Compras do mês R$ " + compras)
    return ((lucroBruto/arrecadacao)*100).toFixed(2)
}
var margemBruta100 = margemBruta(1000,1500)
console.log("Margem Bruta de Lucro: " + margemBruta100 + "%")

imprimir(comparaNomes(nome1,nome2))
imprimir("----")
imprimir(maiorIdade(15))
imprimir(maiorIdade(55))
imprimir("----")
imprimir(valorFinal(1000,10))
imprimir("-----")
imprimir(mediaAritmetica(item))
imprimir("------")
imprimir(margemBruta(1000,1500))
