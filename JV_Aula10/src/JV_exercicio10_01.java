/*Exercício 01 - Aula 10 - CWI Reset
Crie um programa que receba 5 valores e armazene em um vetor.
Crie um segundo vetor de mesmo tipo e tamanho, contendo os valores do primeiro vetor multiplicados por 2.
Ou seja: segundoVetor[i] = primeiroVetor[i] * 2.
No final, imprima o conteúdo dos dois vetores.*/
import java.util.Scanner;

public class JV_exercicio10_01 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] Vetor01 = new int[5];
        int[] Vetor02 = new int[5];
        System.out.println("Vetor unitário e Dobro desse vetor");
        System.out.println("Entre com os valores do vetor");
        for (int index = 0; index < Vetor01.length;index++){
            System.out.print("Entre com o "+ (index+1)+"º valor: ");
            Vetor01[index] = scan.nextInt();
            Vetor02[index] = Vetor01[index]*2;
        }
        System.out.println("O vetor digitado é:");
        for (int index = 0; index < Vetor01.length ; index++){
            System.out.println(Vetor01[index]);
        }

        System.out.println("O vetor dobro é: ");
        for (int index = 0; index < Vetor02.length ; index++){
            System.out.println(Vetor02[index]);
        }

    }
}
