var x = 13;
var y = 12;

for (i = 0; i <=6 ; i+=2){
    x = funcaoA(x,i);
    y = funcaoB(y,i*2);
    console.log(++x,y++);
}

function funcaoB(variavel, valor){
    return variavel += valor;
}

function funcaoA(variavel,valor){
    return variavel -=valor;
}