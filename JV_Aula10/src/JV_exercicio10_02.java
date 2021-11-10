/*Exercício 02 - Aula 10 - CWI Reset
Crie um programa que leia 10 valores inteiros correspondentes as idades de um grupo de pessoas e armazene em um vetor.
Escreva uma lógica para determinar a quantidade de pessoas que possuem idade igual ou superior a 18 anos.
Ao final, imprima o vetor de idades e a quantidade de pessoas maiores de idade.
*/
import java.util.Scanner;

public class JV_exercicio10_02 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int[] idades = new int[10];
        int maiorDe18 = 0;

        System.out.println("Idades de um grupo e maioridade");
        System.out.println("Entre com o valor das idades das pessoas:");
        for (int index = 0 ; index < idades.length ; index++){
            System.out.print("Idade da "+(index+1)+"º pessoa: ");
            idades[index]= scan.nextInt();
            if (idades[index]>=18) {
                maiorDe18 +=1;

            }
        }

        System.out.println("As idades digitadas foram:");

        for (int idade : idades){
            System.out.print(idade + " ");
        }
        System.out.println("\nE são "+ maiorDe18+ " que tem 18 anos ou mais.");
    }
}
