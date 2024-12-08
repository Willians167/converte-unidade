package Converte;

import org.w3c.dom.ls.LSOutput;

public class Converter {

    public static Double calcula (int opcao, Double valor) {
        String[] opcoes = {"Quilômetros para Milhas ","Metros para Centímetros","Quilogramas para Gramas ","Celsius para Fahrenheit"};

        switch (opcao) {
            case 1:
                System.out.println("Resultado de "+ opcoes[0]);
                return  valor * 0.621371;

                case 2:
                System.out.println("Resultado de "+ opcoes[1]);
                return valor * 100;

            case 3:
                System.out.println("Resultado de "+ opcoes[2]);
                return valor * 1000;

            case 4:
                System.out.println("Resultado de "+ opcoes[3]);
                return (valor * 9 / 5) + 32;

            default:
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                return null;
        }
    }
}