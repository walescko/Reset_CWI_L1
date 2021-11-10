package com.company;
public class PersonagemMarioBrosGame {
    //Atributos do Mario
    private String nome;
    private int idade;
    private double altura, alturaInicial;
    private int estamina;
    private boolean cogumelo;
    private int vida = 1;
    private int moedas = 0;

    //Constructors
    //Constructor Standard
    public PersonagemMarioBrosGame() {
        this.nome = "Mário";
        this.idade = 40;
        this.altura = 1.50;
        this.estamina = 100;
        this.cogumelo = false;
        this.alturaInicial = altura;
    }

    //Constructor com argumentos
    public PersonagemMarioBrosGame(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
        this.cogumelo = false;
        this.alturaInicial = altura;
    }

    //Métodos
    public void revigorar() {
        this.estamina = 100;
    }

    public int estaminaMinus() {
        int minus = 10;
        if ((this.estamina - minus) <= 0) {
            this.estamina = 0;
        } else {
            this.estamina -= minus;
        }
        return estamina;
    }

    public int estaminaPlus() {
        int plus = 5;
        if (this.estamina + plus >= 100) {
            this.estamina = 100;
        } else {
            this.estamina += plus;
        }
        return estamina;
    }

    public void cogumelo() {//para dobrar a altura
        this.altura = this.altura *2;
    }
    public void noCogumelo(){//reduzir a altura
        this.altura = this.alturaInicial;
         }

    public void morrer(){
        this.vida -=1;
        this.estamina = 100;
        this.altura = this.alturaInicial;
        if (this.vida < 0){
            this.vida = 0 ;
            this.estamina = 0;
        }
    }

    public void moedas(){
        this.moedas += 1;
        if (this.moedas >= 10) {
            this.vida += 1;
            this.moedas = this.moedas - 10;
        }
    }
    public void superPower2() {
        System.out.println("Poderes: Supervelcodiade, Superestamina e Supersaltos");
    }

      public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Altura: " + this.altura);
        System.out.println("Idade: " + this.idade);
        System.out.println("Vidas: " + this.vida);
        System.out.println("Estamina: " + this.estamina);
        System.out.println("Moedas: " + this.moedas);
        //System.out.println("Cogumelo: " + this.cogumelo);
        superPower2();
        System.out.println("\n");
    }
}
