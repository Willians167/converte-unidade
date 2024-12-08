

import java.util.Scanner;
import Converte.Converter;
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Olá bem vindo ao Convert!");
        System.out.println("O que você deseja converter?");
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");

        System.out.println("Escolha sua opção:");
        System.out.println("Digite 1:  Quilômetros para Milhas");
        System.out.println("Digite 1:  Metros para Centímetros");
        System.out.println("Digite 1:  Quilogramas para Gramas");
        System.out.println("Digite 1:  Celsius para Fahrenheit");
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");


        System.out.print("Digite aqui sua opção: ");
        int opcao = input.nextInt();
        System.out.println("-----------------------------------");

        System.out.print("Digite aqui seu valor: ");
        double valor = input.nextDouble();
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");



        System.out.println( Converter.calcula(opcao,valor));
        System.out.println("-----------------------------------");

      }

}
