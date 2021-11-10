/*Exercicio 02 - Aula 07 - RESET CWI
Faça um programa que tenha como entradas 4 notas e imprima a média.
Utilize a classe Scanner para obter as entradas.*/
import java.util.Scanner;

public class JV_exercicio07_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Programa de Média do Aluno");
        System.out.print("Entre com a primeira nota: ");
        double nota01 = scan.nextDouble();
        System.out.print("Entre com a segunda nota: ");
        double nota02 = scan.nextDouble();
        System.out.print("Entre com a terceira nota: ");
        double nota03 = scan.nextDouble();
        System.out.print("Entre com a quarta nota: ");
        double nota04 = scan.nextDouble();

        //Processamento de Dados
        double media = (nota01 + nota02 + nota03 + nota04) / 4;

        //Saída de dados - média aritimética
        System.out.println("As notas digitadas foram: " + nota01 + ", " + nota02 + ", " + nota03 + ", " + nota04);
        System.out.println("A Média dessas nota é: " + media);
        //se usarmos um loop esse programa fica mais legível.
    }
}
