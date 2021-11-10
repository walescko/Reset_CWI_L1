console.log("Função Atravessar a rua")
function atravessar (){
    console.log("Olhar para a direita");
    console.log("Olhar para a esquerda");
    console.log("Esperar")
    console.log("Atravessar");

}
atravessar()
console.log("Interview 1");
atravessar()
console.log("Interview 2");

//declaração da função
function imprimir(i){
    console.log(i)
}
imprimir(5)
imprimir(8)

for (j = 1; j <=5;j++){
    imprimir(j)
}

function multiplicar(a,b){
    imprimir(a*b)
}
multiplicar(3,5)

//até as funções estão não estão valor.
 function multiplicar2(a,b){
     return a*b
 }

var resultado = multiplicar2(4,6)
 imprimir(resultado)