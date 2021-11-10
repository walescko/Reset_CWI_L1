package com.company;

public class mariobros {
    //Atritutos
    String nome;
    String corDosOlhos;
    boolean bigode;
    boolean bone;
    boolean speed;
    boolean stamine;

    void statusMario() {
        System.out.println("Nome " + this.nome);
        System.out.println("Cor dos Olhos" + this.corDosOlhos);
        System.out.println("Bigode: " + this.bigode);
        System.out.println("Ele sua boné: " + this.bone);
        System.out.println("Poder Supervelocidade: " + speed);
        System.out.println("Poder Super Estamina: " + stamine);
    }

    void bigodeMario() {
        this.bigode = true;
    }

    void boneMario(){
        this.bone = true;
    }

    void speedPower(){
        this.speed = false;
    }
    void staminePower(){
        this.stamine = false;
    }
}
