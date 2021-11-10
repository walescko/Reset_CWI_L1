//classe de jogo da aula de Orientação da Objetos do Reset CWI - Versão 01
import java.util.Random;

public class Jogo {

    private Personagem jogador01;
    private Personagem jogador02;

    //contructor players
    public Jogo(Personagem j1, Personagem j2){
        jogador01 = j1;
        jogador02 = j2;
        j1.status();
        j2.status();
    }
    public void jogostatus(){
        jogador01.status();
        jogador01.status();
    }
    public void jogar(){
        System.out.println("Start Game now");

        Random jogar = new Random();
        int joga01 = 0; int joga02 = 0; //contador de quantidade de jogadas de cada joga, também acumula a quantidade de moedas coletadas

        int jogadas = jogar.nextInt(30); //quantas vezes o jogador 1 irá jogar
        for (int i = 0 ; i<jogadas; i++) {
                joga01 += 1;
                jogador01.moedas();
            }
        jogadas = jogar.nextInt(30); //quantas vezes o jogador 2 irá jogar
        for (int i = 0 ; i < jogadas ; i++){
            joga02 +=1;
            jogador02.moedas();
            }

        System.out.println("--- Fim de Jogo ---");
        jogador01.status();
        System.out.println("Coletou "+ joga01 + " moedas.");
        System.out.println(" ------------ " );
        jogador02.status();
        System.out.println("Coletou "+ joga02 + " moedas.");


    }
}
