/*Exercício 01 - Aula 08 - CWI RESET
Faça um programa que tenha como entradas 4 notas e calcule a média. Ao final o programa deve apresentar:
        A mensagem Aluno aprovado, se a média alcançada for igual ou superior a sete;
        A mensagem Aluno reprovado, se a média for inferior a sete;
        A mensagem Aluno aprovado com louvores, se a média for igual a dez.*/
import java.util.Scanner;

public class JV_exercicio08_01 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Média final com conceito");
        System.out.print("Entre com a primeira nota: ");
        double nota01 = scan.nextDouble();
        System.out.print("Entre com a segunda nota: ");
        double nota02 = scan.nextDouble();
        System.out.print("Entre com a terceira nota: ");
        double nota03 = scan.nextDouble();
        System.out.print("Entre com a quarta nota: ");
        double nota04 = scan.nextDouble();

        double media = (nota01+nota02+nota03+nota04)/4;

        if (media < 7.0) {
            System.out.println("Aluno reprovado. Média: "+media);
        } else if (media >= 7.0 && media <10){
            System.out.println("Aluno aprovado. Média: "+media);
        } else if (media == 10){
            System.out.println("Aluno aprovado com louvores. Media: " + media);
        } else {
            System.out.println("Revise as notas digitadas");
        }

    }
}
