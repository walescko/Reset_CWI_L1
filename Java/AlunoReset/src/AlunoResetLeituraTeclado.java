import java.util.Scanner;

public class AlunoResetLeituraTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com o seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Sou aluno do Level 1 CWI Reset! Me chamo " + nome + "!");

	}

}
