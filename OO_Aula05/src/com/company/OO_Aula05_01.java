package com.company;

public class OO_Aula05_01 {

    public static void main(String[] args) {
        MarioBros05 mario1 = new MarioBros05();

        mario1.status();
        System.out.println("--------");
        System.out.println("Teste de Estamina - Perdendo");
        mario1.estaminaminus();
        mario1.status();

        System.out.println("--------");
        System.out.println("TEste de Estamina - Ganhando");
        mario1.estaminaplus();
        mario1.status();

        //Acrescentado Estamina até o limite
        for (int index = 1 ; index <= 15; index++){
            mario1.estaminaplus();
        }
        mario1.status();
        //Dimunuindo Estamina até o limite
        for (int index = 1 ; index <= 11; index++){
            mario1.estaminaminus();
        }
        mario1.status();

        //Criando um segundo Mário
        MarioBros05 mario2 = new MarioBros05("Mario2", 41, 1.60);
        mario2.status();
        //Alterando a altura do Mário2
        System.out.println("Mario comeu um cogumelo");
        mario2.setCogumelo(true);
        mario2.heigth();
        mario2.status();
        System.out.println("Mario perdeu o efeito do cogumelo");
        mario2.setCogumelo(false);
        mario2.heigth();
        mario2.status();
    }
}
