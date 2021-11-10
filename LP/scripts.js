nomeCompleto = "Tiago Walescko Chimendes";
apelido = "Prof";
idade = 41;
dataNascimento = "12/02/1980";
localNascimento = "Porto Alegre";
altura = 1.84;
emprego = false;
let trabalhando;

if (emprego == false) {
    trabalhando = "desempregado";
} else { 
    trabalhando = "empregado";
    }

let apresentacao
apresentacao = "Meu nome é " + nomeCompleto + "(sou conhecido como " + apelido + ") e tenho " + idade + " anos. Nasci no dia " + dataNascimento + ", na cidade de " +localNascimento + ". Tenho " + altura + "m de altura e estou " + trabalhando + "."
console.log(apresentacao);
