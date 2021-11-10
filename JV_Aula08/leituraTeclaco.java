import java.util.Scanner;

class leituraTeclado {
	public static void main(String[] args){
		System.out.println("Nome: ");
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		System.out.print("O nome informado eh: "+ nome);
	}
}
