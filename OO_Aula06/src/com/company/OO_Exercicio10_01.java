package com.company;

public class OO_Exercicio10_01 {

    public static void main(String[] args) {
        PersonagemMarioBrosGame mario1 = new PersonagemMarioBrosGame();

        mario1.status();
        mario1.estaminaMinus();
        mario1.estaminaMinus();
        mario1.status();
        mario1.morrer();
        mario1.status();
        for (int i = 1 ; i <= 11; i++) {
            mario1.moedas();
        }
        mario1.cogumelo();
        mario1.status();
        mario1.estaminaMinus();
        mario1.morrer();
        mario1.status();
        mario1.moedas();
        mario1.morrer();
        mario1.status();
    }
}

