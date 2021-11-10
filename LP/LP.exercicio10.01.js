//Verifica se o nome a procurar é colaborador
function procuraNome(colaborador,index){
    for (let i = 0; i < index; i++){
        if (colaboradores[i] == colaborador){ 
            trabalhador = i
            break 
        } else {
            trabalhador = "Não Encontrado"
        } 
    }
    return trabalhador
}

//Verifica a idade e o tempo de serviço
function procuraIdade(idade){
    idade = idades[i]
        return idade 
} 

function procuraTempoDeServico(tempoDeServico){
        tempoDeServico = temposDeTrabalho[i] 
        return tempoDeTrabalho 
} 

//Verificação de condições de aposentadoria
function verificaCondicoes(idade, tempo){
    if ((idade >= 60) && (tempo >= 25)){
        return "parabéns, já pode sair de férias eterna! :)"
    } else if (tempo >= 30){
        return "parabéns, já pode sair de férias eterna! :)"
    } else if  (idade >= 65){
        return "parabéns, já pode sair de férias eterna! :)"
    } else {
        return "infelizmente para você ainda falta um tempo. :(."
    }
}

//Listagem dos colaboradores, idades e tempo de trabalho
//Variáveis
let colaboradores    = ['Rhoger', 'Cléverson', 'Gleysberto', 'Nádio', 'Rosiméri', 'Regislane', 'Agripino', 'Wellison']
let idades           = [      69,          66,           58,      61,         60,          64,         59,         55]
let temposDeTrabalho = [      31,          29,           30,      26,         25,          25,         26,         29]

//Apresentação dos colaboradores, idades e tempo de trabalho
console.log(colaboradores)
console.log(idades)
console.log(temposDeTrabalho)

nomeAProcurar = "Rosiméri" //Linha  de comando entrar com o nome a procurar no vetor colaboradores
let i = colaboradores.length

let posicao = procuraNome(nomeAProcurar,i)//chamada para encontrar o colaborador

//Sequencia para verificar se o colaborador pode se aposentar ou não.
if (posicao >= 0 && posicao < i){
    //variaveis para chamar a função de verificação das condições de aposentadoria
    let idade = idades[posicao]
    let tempoDeServico = temposDeTrabalho[posicao]
    
    let aposentadoria = verificaCondicoes(idade,tempoDeServico) //chamada da função de aposentadoria
    console.log(nomeAProcurar + ", " +aposentadoria) //apresentação da saida da função
} else {
    console.log(posicao)
}
