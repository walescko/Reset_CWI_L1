/* Exercicio 03 - Aula 07 - RESET CWI
Faça um programa que solicite quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês.*/

import java.util.Scanner;

public class JV_exercicio07_03 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Calculo do salário mensal");
        System.out.print("Qual o valor da hora de trabalho? ");
        double valor = scan.nextDouble();
        System.out.print("Quanta horas trabalhou durante o mês? ");
        double horas = scan.nextDouble();

        double salario = (horas * valor);

        System.out.println("Horas trabalhada: "+horas+" h");
        System.out.println("Valor da hora de trabalho: R$ "+valor);
        System.out.println("O salário desse mês será de R$ "+salario);
    }
}
