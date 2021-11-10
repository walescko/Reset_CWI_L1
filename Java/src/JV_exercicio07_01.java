/*Exercício 01 Aula 07
Faça um programa que tenha como entradas dois números e imprima a soma de ambos.
 Utilize a classe Scanner para obter as entradas.*/
import java.util.Scanner;

public class JV_exercicio07_01 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Soma de Dois Números");
        //Entrada dos valores
        System.out.print("Entre com o primeiro valor: ");
        int number1 = scan.nextInt();
        System.out.print("Entre com o segundo valor: ");
        int number2 = scan.nextInt();
        int soma = (number1+number2);//processamento de dados

        System.out.println(number1+" + "+number2+" = "+ soma);//devolução do processamento.
    }

}
