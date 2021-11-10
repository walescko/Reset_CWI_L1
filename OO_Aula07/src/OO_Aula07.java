package com.company;

public class OO_Aula07 {

    public static void main(String[] args) {

        //Criando os personagens usando vetores
        /*Personagem[] Personagem = new Personagem[2];

        Personagem[0] = new Personagem("Mario", 40, 1.60);
        Personagem[1] = new Personagem("Luigi", 40, 1.80);

        Personagem[0].status();
        Personagem[1].status(); //verificando a criação dos persongens
        Personagem[0].saltar(); // teste de salto.
        Personagem[1].saltar();
        */
        //Criando os persongens direto com o nome de cada um
        Personagem mario = new Personagem("Mario", 40, 1.60);
        Personagem luigi = new Personagem("Luigi", 40, 1.80);

        System.out.println("Caracteristicas de cada personagem:");
        mario.status();
        luigi.status();

        System.out.println("Teste do método saltar de cada personagem");
        mario.saltar();
        luigi.saltar();



    }
}
