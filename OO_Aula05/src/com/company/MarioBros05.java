package com.company;

public class MarioBros05 {
    //Atributos do Mario
    private String nome;
    private int idade;
    private double altura, alturaInicial;
    private int estamina;
    private boolean cogumelo;

    //Constructors
    //Constructor Standard
    public MarioBros05(){
        this.nome = "Mário";
        this.idade = 40;
        this.altura = 1.50;
        this.estamina = 100;
        this.cogumelo = false;
        this.alturaInicial = altura;
    }

    //Constructor Setters
    public MarioBros05(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
        this.cogumelo = false;
        this.alturaInicial = altura;
    }

    //Métodos
    public int estaminaminus(){
        int minus = 10;
        if ((this.getEstamina()-minus) <= 0 ){
            this.setEstamina(0);
        } else {
            this.setEstamina(this.getEstamina()-minus);
        }
        return estamina;
    }

    public int estaminaplus(){
        int plus = 5;
        if (this.getEstamina()+plus >= 100){
            this.setEstamina(100);
        } else {
            this.setEstamina(this.getEstamina()+plus);
        }
        return estamina;
    }

    public double heigth(){
        if (this.getCogumelo() == true){
            this.setAltura(this.getAltura()*2);
        } else {
            this.setAltura(this.alturaInicial);
        }
        return altura;
    }

    public void superPower2() {
        System.out.println("Poderes: Supervelcodiade, Superestamina e Supersaltos");
    }
    //Getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public int getEstamina(){
        return estamina;
    }

    //Setters
    public String setNome(String nomeS){
        return this.nome = nomeS;
    }
    public int setIdade(int idadeS){
        return this.idade = idadeS;
    }
    public void setAltura(double alturaS){
        this.altura = alturaS;
    }
    public void setEstamina(int estaminaS) {
        this.estamina = estaminaS;
    }

    public boolean getCogumelo(){
        return this.cogumelo;
    }

    public void setCogumelo(boolean cogumelo){
        this.cogumelo = cogumelo;
    }


    //Getter status
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Estamina: " + this.getEstamina());
        System.out.println("Cogumelo: " + this.getCogumelo());
        superPower2();
        System.out.println("\n");
    }

}
