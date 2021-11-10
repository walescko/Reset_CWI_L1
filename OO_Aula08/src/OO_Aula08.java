public class OO_Aula08 {

    public static void main(String[] args) {

         Personagem jogador01 = new Personagem("Mario", 40, 1.61);
         Personagem jogador02 = new Personagem("Luigi", 41, 1.63 );

         Jogo jogo = new Jogo(jogador01, jogador02);
         //jogo.jogostatus();
        jogo.jogar();


    }
}
