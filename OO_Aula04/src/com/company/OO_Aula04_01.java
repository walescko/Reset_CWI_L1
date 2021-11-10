public class OO_Aula04_01 {

    public static void main(String[] args) {
	
    MarioBros4 mario1 = new MarioBros4();

    mario1.status();

    MarioBros4 mario2 = new MarioBros4("Mario Kart", 47, 1.61);
    mario2.status();
    
    MarioBros4 mario3 = new MarioBros4("Luigi", 22, 1.93);
    mario3.status();
    mario3.setNome("Gaspar Bros");
    mario3.setIdade(35);
    mario3.setAltura(1.78);
    mario3.status();
    }

    }

