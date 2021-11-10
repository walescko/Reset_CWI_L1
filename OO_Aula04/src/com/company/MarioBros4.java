public class MarioBros4 {
    //Atributos do Mario
    private String nome;
    private int idade;
    private double altura;
    private int estamina; 
    
    //Constructors
    //Constructor Standard
    public MarioBros4(){
        this.nome = "Mário";
        this.idade = 40;
        this.altura = 1.50;
        this.estamina = 100;
    }

    //Constructor Setters
    public MarioBros4(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
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

    //Getter status
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Estamina: " + this.getEstamina());
        superPower2();
        System.out.println("\n");
    }

}